import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { SneakerListBrandComponent } from './components/sneaker-list-brand/sneaker-list-brand.component';
import { SneakerDetailComponent } from './components/sneaker-detail/sneaker-detail.component';


const routes: Routes = [
  { path: '', redirectTo: 'SneakerShop/:all', pathMatch: 'full' },
  { path: 'SneakerShop/:all',component: SneakerListBrandComponent},
  { path: 'SneakerShop/:brand/:sneakerId',component: SneakerDetailComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
