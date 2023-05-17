package ss7.bai_tap.bai_1;

public class Retangle extends Shape implements Resizeable {
    double width;
    double height;

    Retangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public void resize(double percent) {
        System.out.println(getArea() + getArea() * percent / 100);
    }
}
