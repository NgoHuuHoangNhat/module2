package ss4.bai_tap.lop_can_bac_2;

public class QuadraticEquation {

    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDelta() {
        return this.b * this.b - 4 * this.a * this.c;
    }

    public double getDoubleSolution(){
        return -this.b/(2*this.a);
    }
    public double getRoot1() {
        double result = (-this.b + Math.sqrt((this.b * this.b - 4 * this.a * this.c))) / (2 * this.a);
        return result;
    }

    public double getRoot2() {
        double result = (-this.b - Math.sqrt((this.b * this.b - 4 * this.a * this.c))) / (2 * this.a);
        return result;
    }

}

