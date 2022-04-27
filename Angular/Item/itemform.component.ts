import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
@Component({
  selector: 'app-itemform',
  templateUrl: './itemform.component.html',
  styleUrls: ['./itemform.component.css']
})
export class ItemformComponent implements OnInit {
  //no:String='ashutosh';
  itemform:FormGroup;
  
 
  constructor() { 
    this.itemform=new FormGroup({
      name:new FormControl("",[Validators.required,Validators.minLength(2)]),
      price:new FormControl(""),
      quantity:new FormControl(""),
      discount:new FormControl(""),
      
     
    });
  }
  public total:any;
  public totalprice:any;
  public discountprice:any;
  public showtotal:any;
  public showdis:any;
  public addprod : Number[]=[];
  public showlist:any;
//  public grade:any;
  send()
  {
    this.total=((this.itemform.value.price*this.itemform.value.quantity));
    this.totalprice=((this.total*this.itemform.value.discount)/100);
    this.discountprice=(this.total-this.totalprice)
    this.addprod=this.itemform.value.name
    for (var i = 0; i < this.addprod.length; i++) {
      this.showlist=this.addprod[i]
      console.log(this.addprod[i]);
   }
    this.showtotal="Total price is :"+this.total
    this.showdis="Total price after discount :"+this.discountprice
  }

  ngOnInit(): void {
  }
  onSubmit():void{
    console.log(this.itemform.value);
    console.log(this.itemform.value.total);
    console.log(this.itemform.value.totalprice);
    console.log(this.itemform.value.discountprice);
  
   }
}
