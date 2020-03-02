import { Component, OnInit, Input } from '@angular/core';
import { Sneaker} from '../../models/sneaker';
import { SneakerService } from '../../services/sneaker.service';
import { Subject, Observable } from "rxjs";
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-sneaker-list-brand',
  templateUrl: './sneaker-list-brand.component.html',
  styleUrls: ['./sneaker-list-brand.component.css']
})
export class SneakerListBrandComponent implements OnInit {
  @Input() selectBrand: String;
  sneakerList: Sneaker[];
  sneakerListTry: Observable<Sneaker[]>;
  curChoice: String;
  showSneakerDetail: boolean = false;
  selSneaker: Sneaker;
  brandHeader: String;

  constructor(private sneakerService: SneakerService, private route: ActivatedRoute) { }

  ngOnInit() {
    this.route.params.subscribe(params => {
      this.selectBrand = params['all'];
    this.viewHeaderBrand();
    this.viewHandler();
      });
    //this.curChoice = this.selectBrand;
    
    
  }

  handleSneaker(curSneaker: Sneaker){
    this.selSneaker = curSneaker;
    this.showSneakerDetail = true;
  }

  viewHandler(){
    if (typeof this.selectBrand != "undefined"){
      if(this.selectBrand == 'all'){
       // this.sneakerService.getAllSneakers().subscribe(sneakerByBrandList => this.sneakerList = sneakerByBrandList);
        this.sneakerListTry = this.sneakerService.getAllSneakers();
      }
      else 
      {
        //this.sneakerService.getSneakerByBrand(this.selectBrand).subscribe(sneakerByBrandList => this.sneakerList = sneakerByBrandList);
        this.sneakerListTry = this.sneakerService.getSneakerByBrand(this.selectBrand);
      }
    }
    else{
      //this.sneakerService.getAllSneakers().subscribe(sneakerByBrandList => this.sneakerList = sneakerByBrandList);
      this.sneakerListTry = this.sneakerService.getAllSneakers();
    }
  }

  viewHeaderBrand(){
    if(this.selectBrand == "all"){
      this.brandHeader = "All Brands";
    }
    else{
      this.brandHeader = this.selectBrand;
    }
  }


}
