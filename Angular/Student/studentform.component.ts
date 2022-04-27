import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { FormGroup, FormControl, Validators } from '@angular/forms';
@Component({
  selector: 'app-studentform',
  templateUrl: './studentform.component.html',
  styleUrls: ['./studentform.component.css']
})
export class StudentformComponent implements OnInit {

  studentform:FormGroup;
  // formData:any={};
  // formMaths:any={};
  // result:any=0;
  // n1:any=0;
  // n2:any=0;
  // n3:any=0;
  // n4:any=0;
  // n5:any=0;
  // totalmarks:any="";
  // totalmarksshow:any="";
  // percentage:any="";
  // perscentageshow="";
  constructor() { 
    this.studentform=new FormGroup({
      fname:new FormControl("",[Validators.required,Validators.minLength(2)]),
      clsname:new FormControl("",[Validators.required,Validators.minLength(2)]),
      rollno:new FormControl("",[Validators.required,Validators.minLength(2)]),
      math:new FormControl("",[Validators.required,Validators.minLength(2)]),
      physics:new FormControl("",[Validators.required,Validators.minLength(2)]),
      chemistry:new FormControl("",[Validators.required,Validators.minLength(2)]),
      hindi:new FormControl("",[Validators.required,Validators.minLength(2)]),
      english:new FormControl("",[Validators.required,Validators.minLength(2)]),
    });
  }
  public result:any;
  public grade:any;
  public showgrade:any;
  public showresult:any;
  Submit(){
    this.result=(((this.studentform.value.math+this.studentform.value.physics+this.studentform.value.chemistry+this.studentform.value.hindi+this.studentform.value.english)/500)*100);
    this.showresult="Result is :"+this.result;
    
    if(this.result>=40 && this.result<=50){
    this.grade="Grade C";

}

else if(this.result>=50 && this.result<=60){

this.grade="Grade C+";

}

else if(this.result>=60 && this.result<=70){

this.grade="Grade B";

}

else if(this.result>=70 && this.result<=80){

this.grade="Grade B+";

}

else if(this.result>=80 && this.result<=90){

this.grade="Grade A";

}

else if(this.result>=90 && this.result<=100){

this.grade="Grade A+";

}
this.showgrade="Grade is :"+this.grade;
    
    // this.totalmarks=Number(this.n1)+Number(this.n2)+Number(this.n3)+Number(this.n4)+Number(this.n5);
    // this.totalmarksshow="total marks :"+this.totalmarks
    // console.log("totalmarks :"+this.totalmarks);

    // this.percentage=this.totalmarks/5;
    // this.perscentageshow="percentage :"+this.percentage
    // console.log("percentage :"+this.percentage)
  }
  ngOnInit(): void {
  }
  onSubmit():void{
    console.log(this.studentform.value);
    console.log(this.studentform.value.result);
    console.log(this.studentform.value.grade);
   }
  
}

