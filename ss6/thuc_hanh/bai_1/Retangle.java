package ss6.thuc_hanh.bai_1;

public class Retangle extends Shape {
    private double width = 1;
    private double length = 1;

    Retangle() {

    }

    Retangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    Retangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    public double getArea() {
        return getWidth() * getLength();
    }

    public double getPerimeter() {
        return (getWidth() + getLength()) * 2;
    }

    @Override
    public String toString() {
        return "Retangle{" +
                "width=" + width +
                ", length=" + length +
                ", " + super.toString() +
                '}';
    }
}
