package ss4.thuc_hanh;

public class Rectangle {
    double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public String getIfo() {
        return "chiều rộng là: " + this.width + ", chiều dài là: " + this.height;
    }

    public double getRetangleArea() {
        return this.height * this.width;
    }

    public double getRetanglePerimeter() {
        return (this.height + this.width) * 2;
    }
}
