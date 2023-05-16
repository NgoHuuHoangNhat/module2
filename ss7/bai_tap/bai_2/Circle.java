package ss7.bai_tap.bai_2;

public class Circle extends Shape {
    private double radius;

    Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public String getName() {
        return "hình tròn";
    }
}

