import { Component, OnInit, Input } from '@angular/core';
import { Sneaker } from 'src/app/models/sneaker';
import { SneakerDetailService } from '../../services/sneaker-detail.service';
import { ActivatedRoute, Router, NavigationEnd } from '@angular/router';
import { Observable } from 'rxjs';
import { SneakerStock } from 'src/app/models/sneakerStock';


@Component({
  selector: 'app-sneaker-detail',
  templateUrl: './sneaker-detail.component.html',
  styleUrls: ['./sneaker-detail.component.css']
})
export class SneakerDetailComponent implements OnInit {
  currentSneakerId: String;
  currentSneaker: Sneaker;
  currentSneakerStock: SneakerStock;
  currentBackTo: String;
  showSneakerDetail: boolean = false;
  showByBrand: boolean = false;
  displaySizes: Array<Number> = [];

  constructor(private route: ActivatedRoute, private sneakerDetailService: SneakerDetailService, private router: Router) {
  }

  ngOnInit() {
    this.route.params.subscribe(params => {
      this.currentSneakerId = params['sneakerId'];
      this.sneakerDetailService.getSneakerById(this.currentSneakerId).subscribe((sneaker) => { this.currentSneaker = sneaker });
      this.sneakerDetailService.getSneakerStockById(this.currentSneakerId).subscribe((sneakerStock) => { this.currentSneakerStock = sneakerStock; this.displaySizes = this.listSneakerStock(this.currentSneakerStock)});
      var splittable = this.router.url.split('/');
      this.currentBackTo = splittable.slice(-2)[0];
    });
  }

  mySortingFunction = (a, b) => {
    return a.key > b.key ? 1 : -1;
  }

  sneakerSizeLabel(size: String) {
    var ret = size.replace('size', '');
    ret = ret.replace('_', '.');
    return ret;
  }

  listSneakerStock(sneakerStock: SneakerStock) {
    var keysList = Object.keys(sneakerStock.stockList);
    return this.sortSneakerDisplaySizes(keysList);
  }

  sortSneakerDisplaySizes(displaySizes: Array<String>) {
    let labeledSizes :number[] = [];  
    for(let item of displaySizes){
      labeledSizes.push(Number(this.sneakerSizeLabel(item)));
    }
    var sortedArray: Number[] = labeledSizes.sort((n1,n2) => n1 - n2);
    return sortedArray;
  }
}
