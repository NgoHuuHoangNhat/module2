package ss5.circle;

public class Circle {
    private double radius = 1.0;
    private static String color = "red";

    Circle() {

    }

    protected Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return this.radius * 3.14;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "color =" + color +
                ", radius =" + getRadius() +
                ", area ='" + getArea() + '\'' +
                '}';
    }
}


