class shape
{
	dis()
	{
	console.log("Program to Calculate Area");
	}
	}
	class rectangle extends shape
	{
	
	rect:number;
	 rectarea(l:number,b:number):void
	 {
		
		this.rect = l*b;
		console.log("Area of rectangle :"+this.rect);
	
	 }
	 }
	 class Square extends shape
	 {
	 
	 squ:number;
	 squr(a:number):void
	 {
		
		this.squ =a*a;
		console.log("Area of rectangle :"+this.squ);
	 
	 } 
	 }
	 
	 var p=new Square();
	 p.dis();
	 p.squr(10);
	 var r=new rectangle();
	 r.rectarea(20,30);
	