import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class VehicleService {

  constructor(private httpClient:HttpClient) { }

  public getAllVehicles():Observable<any>{
    return this.httpClient.get("http://localhost:2000/IMMATRICULATION-MS/vehicles")
  }
}
