import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Sneaker} from '../models/sneaker';

@Injectable({
  providedIn: 'root'
})
export class SneakerListService {

  private allSneakerUrl = 'http://localhost:8181/SneakerShop/sneakers/all';

  constructor(private httpClient: HttpClient) { }

  getAllSneakers(): Observable<Sneaker[]>{
    return this.httpClient.get<Sneaker[]>(this.allSneakerUrl);

  }
}
