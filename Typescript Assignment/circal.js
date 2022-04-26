var Crical = /** @class */ (function () {
    function Crical(radius, distance) {
        this.radius = radius;
        this.distance = distance;
    }
    Crical.prototype.show = function () {
        var pi = 3.14;
        var circum = 2 * pi * this.radius;
        var i = this.distance / circum;
        var spin = Math.floor(i);
        console.log("Number of spin= " + spin);
    };
    return Crical;
}());
var obj = new Crical(10, 200);
obj.show();
