import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import {HttpClientModule} from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SneakerListComponent } from './sneaker-list/sneaker-list.component';
import { SneakerDetailComponent } from './components/sneaker-detail/sneaker-detail.component';

@NgModule({
  declarations: [
    AppComponent,
    SneakerListComponent,
    SneakerDetailComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
