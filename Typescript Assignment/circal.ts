class Crical
{
   radius:number;
   distance:number;
constructor(radius:number,distance:number)
{
this.radius=radius;
this.distance=distance;
}
show()
{
var pi=3.14;
var circum=2*pi*this.radius;
var i=this.distance/circum;
var spin=Math.floor(i);

console.log("Number of spin= "+spin);
}
}
var obj=new Crical(10,200);
obj.show();