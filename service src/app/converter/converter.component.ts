import { Component, OnInit } from '@angular/core';
import { ConvertService } from '../service/convert.service';

@Component({
  selector: 'converter',
  templateUrl: './converter.component.html',
  styleUrls: ['./converter.component.css']
})
export class ConverterComponent implements OnInit {
   upperName:string;
  constructor(public convertservive:ConvertService) { 
              

  }
     converterletter(txtname:HTMLInputElement){
       this.upperName=this.convertservive.converttoUpper(txtname.value);
     }


     
  ngOnInit() {
  }

}
