package ss7.bai_tap.bai_1;

public class Circle extends Shape implements ResizeableInterface {
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

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public void resize(double percent) {
        System.out.println(getArea() + getArea() * percent / 100);
    }
}
