var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var shape = /** @class */ (function () {
    function shape() {
    }
    shape.prototype.dis = function () {
        console.log("Program to Calculate Area");
    };
    return shape;
}());
var rectangle = /** @class */ (function (_super) {
    __extends(rectangle, _super);
    function rectangle() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    rectangle.prototype.rectarea = function (l, b) {
        this.rect = l * b;
        console.log("Area of rectangle :" + this.rect);
    };
    return rectangle;
}(shape));
var Square = /** @class */ (function (_super) {
    __extends(Square, _super);
    function Square() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    Square.prototype.squr = function (a) {
        this.squ = a * a;
        console.log("Area of rectangle :" + this.squ);
    };
    return Square;
}(shape));
var p = new Square();
p.dis();
p.squr(10);
var r = new rectangle();
r.rectarea(20, 30);
