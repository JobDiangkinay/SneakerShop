import { Component } from '@angular/core';
import { Subject } from "rxjs";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'job-sneaker-shop';
  showByBrand: boolean = false;
  showDefault: boolean = true;
  selBrand: String;
  adidas: String = 'Adidas';
  jordan: String = 'Jordan';
  nike: String = 'Nike';
  all: String = 'all'
  resetFormSubject: Subject<boolean> = new Subject<boolean>();

  handleBrandList(brandSelected: String){
    alert(brandSelected);
    //this.resetChildForm();
    this.selBrand = brandSelected;
    this.showByBrand = true;
    this.showDefault = false;
    
  }

  showDefaultView(){
    this.showDefault = true;
    this.showByBrand = false;
  }

  resetChildForm(){
    this.resetFormSubject.next(true);
 }

}
