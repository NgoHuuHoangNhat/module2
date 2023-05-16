package ss7.bai_tap.bai_2;

import ss7.bai_tap.bai_2.Colorable;
import ss7.bai_tap.bai_2.Shape;

public class Square extends Shape implements Colorable {
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
    public void howToColor() {
        System.out.println("Color all four sides..");
    }

    @Override
    public String getName() {
        return "hình vuông";
    }
}

