import { Component, OnInit, Input } from '@angular/core';
import { Sneaker } from 'src/app/models/sneaker';
import { SneakerDetailService } from './sneaker-detail.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-sneaker-detail',
  templateUrl: './sneaker-detail.component.html',
  styleUrls: ['./sneaker-detail.component.css']
})
export class SneakerDetailComponent implements OnInit {
  @Input() selectSneaker: Sneaker;
  currentSneaker: Sneaker;
  showSneakerDetail: boolean = false;

  constructor(private route: ActivatedRoute,private sneakerDetailService: SneakerDetailService) { }

  ngOnInit() {
    this.currentSneaker = this.selectSneaker;
  }

  handleBackButton(){
    this.showSneakerDetail = true;
  }

}
