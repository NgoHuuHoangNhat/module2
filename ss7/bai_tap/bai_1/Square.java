package ss7.bai_tap.bai_1;

public class Square extends Shape implements ResizeableInterface {
    double width;

    Square(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    public double getArea() {
        return this.width * this.width;
    }

    @Override
    public void resize(double percent) {
        System.out.println(getArea() + getArea() * percent / 100);
    }
}
