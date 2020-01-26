import { Component, OnInit } from '@angular/core';
import { Sneaker} from '../models/sneaker';
import { SneakerListService } from './sneaker-list.service';

@Component({
  selector: 'app-sneaker-list',
  templateUrl: './sneaker-list.component.html',
  styleUrls: ['./sneaker-list.component.css']
})
export class SneakerListComponent implements OnInit {
  allSneakerList: Sneaker[];

  constructor(private sneakerListService: SneakerListService) { }

  ngOnInit() {
    this.sneakerListService.getAllSneakers().subscribe(allSneakerList => this.allSneakerList = allSneakerList);
  }

}
