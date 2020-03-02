import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Sneaker} from '../models/sneaker';
import { SneakerStock} from '../models/sneakerStock';

@Injectable({
  providedIn: 'root'
})
export class SneakerDetailService {
  private sneakerUrl = 'http://localhost:8181/SneakerShop/sneakers/';
  private sneakerStockUrl = 'http://localhost:8181/SneakerShop/sneakerstocks/';

  constructor(private httpClient: HttpClient) { }

  getSneakerById(modelId : String): Observable<Sneaker>{
    const url = `${this.sneakerUrl}/${modelId}`;
    return this.httpClient.get<Sneaker>(url);
  }

  getSneakerStockById(modelId : String): Observable<SneakerStock>{
    const url = `${this.sneakerStockUrl}/${modelId}`;
    return this.httpClient.get<SneakerStock>(url);
  }
}
