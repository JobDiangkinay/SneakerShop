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

  constructor(private route: ActivatedRoute, private sneakerDetailService: SneakerDetailService, private router: Router) {
  }

  ngOnInit() {
    this.route.params.subscribe(params => {
      this.currentSneakerId = params['sneakerId'];
      this.sneakerDetailService.getSneakerById(this.currentSneakerId).subscribe((sneaker) => { this.currentSneaker = sneaker });
      this.sneakerDetailService.getSneakerStockById(this.currentSneakerId).subscribe((sneakerStock) => { this.currentSneakerStock = sneakerStock });
      var splittable = this.router.url.split('/');
      this.currentBackTo = splittable.slice(-2)[0];
    });
  }

  mySortingFunction = (a, b) => {
    return a.key > b.key ? 1 : -1;
  }


}
