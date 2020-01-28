import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ConvertService {
  
    
  constructor() { }
  converttoUpper(str:string):string{
    return str.toUpperCase();
  }
  
   }

