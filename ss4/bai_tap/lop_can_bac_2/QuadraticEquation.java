package ss4.bai_tap.lop_can_bac_2;

public class QuadraticEquation {

    private double numA;
    private double numB;
    private double numC;

    public QuadraticEquation(double a, double b, double c) {
        this.numA = a;
        this.numB = b;
        this.numC = c;
    }

    public double getDelta() {
        return this.numB * this.numB - 4 * this.numA * this.numC;
    }

    public double getDoubleSolution() {
        return -this.numB / (2 * this.numA);
    }

    public double getRoot1() {
        double result = (-this.numB + Math.sqrt((this.numB * this.numB - 4 * this.numA * this.numC))) / (2 * this.numA);
        return result;
    }

    public double getRoot2() {
        double result = (-this.numB - Math.sqrt((this.numB * this.numB - 4 * this.numA * this.numC))) / (2 * this.numA);
        return result;
    }

}

