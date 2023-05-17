package ss7.thuc_hanh.compara;


public class Circle extends Shape implements Comparable<Circle> {
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
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", " + super.toString() +
                '}';
    }

    @Override
    public int compareTo(Circle o) {
        if (this.radius > o.radius) {
            return 1;
        } else {
            return -1;
        }
    }


}
