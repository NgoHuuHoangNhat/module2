package ss7.bai_tap.bai_2;

public class Retangle extends Shape {
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

    @Override
    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public String getName() {
        return "hình chữ nhật";
    }
}
