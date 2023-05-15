package ss6.thuc_hanh.bai_1;

public class Circle extends Shape {
    private double radius = 1;

    Circle() {

    }

    Circle(double radius) {
        this.radius = radius;
    }

    Circle(String color, double radius, Boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * 3.14;
    }

    public double getPerimeter() {
        return 2 * radius * 3.14;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", " + super.toString() +
                '}';
    }
}
