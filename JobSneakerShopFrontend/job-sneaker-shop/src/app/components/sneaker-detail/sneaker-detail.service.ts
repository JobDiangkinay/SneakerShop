import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Sneaker} from '../../models/sneaker';

@Injectable({
  providedIn: 'root'
})
export class SneakerDetailService {
  private sneakerUrl = 'http://localhost:8181/SneakerShop/sneakers/';

  constructor(private httpClient: HttpClient) { }

  getArticleById(modelId : string): Observable<Sneaker>{
    const url = `${this.sneakerUrl}/${modelId}`;
    return this.httpClient.get<Sneaker>(url);
  }
}
