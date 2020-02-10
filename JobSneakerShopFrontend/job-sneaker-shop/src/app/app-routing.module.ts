import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { SneakerListComponent } from './sneaker-list/sneaker-list.component';


const routes: Routes = [
  { path: '',     component: SneakerListComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
