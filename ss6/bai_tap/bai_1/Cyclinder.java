package ss6.bai_tap.bai_1;

public class Cyclinder extends Circle {
    private double height;

    Cyclinder() {

    }

    Cyclinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight() {
        this.height = height;
    }

    public double calculatorVolume() {
        return super.calculatorArea() * this.height;
    }

    @Override
    public String toString() {
        return "Cyclinder{" +
                "height=" + height +
                " volume=" + calculatorVolume() +
                ", " + super.toString() +
                "}";
    }
}
