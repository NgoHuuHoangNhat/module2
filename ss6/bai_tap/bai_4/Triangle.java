package ss6.bai_tap.bai_4;

import ss6.thuc_hanh.bai_1.Shape;

public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    Triangle() {
        side1 = 1;
        side2 = 1;
        side3 = 1;

    }

    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    public double getArea() {
        double height = 2 * Math.sqrt(getPerimeter()/2 *
                (getPerimeter()/2 - this.side1) *
                (getPerimeter()/2 - this.side2) *
                (getPerimeter()/2 - this.side3)) / this.side1;
        return (height * this.side1) / 2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", Area=" + getArea() +
                ", Perimeter=" + getPerimeter() +
                ", " + super.toString() +
                '}';
    }
}

