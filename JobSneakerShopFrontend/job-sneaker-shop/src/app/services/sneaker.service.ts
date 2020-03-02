import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Sneaker} from '../models/sneaker';

@Injectable({
  providedIn: 'root'
})
export class SneakerService {

  private sneakerByBrandUrl = 'http://localhost:8181/SneakerShop/sneakers/brand/';
  private allSneakerUrl = 'http://localhost:8181/SneakerShop/sneakers/all';

  constructor(private httpClient: HttpClient) { }

  getSneakerByBrand(brand: String): Observable<Sneaker[]>{
    const url = `${this.sneakerByBrandUrl}${brand}`;
    return this.httpClient.get<Sneaker[]>(url);
  }

  getAllSneakers(): Observable<Sneaker[]>{
    return this.httpClient.get<Sneaker[]>(this.allSneakerUrl);

  }
}
