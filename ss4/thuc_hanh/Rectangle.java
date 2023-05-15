package ss4.thuc_hanh;

public final class Rectangle {
    double width, height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    String getIfo() {
        return "chiều rộng là: " + this.width + ", chiều dài là: " + this.height;
    }

    double getRetangleArea() {
        return this.height * this.width;
    }

    double getRetanglePerimeter() {
        return (this.height + this.width) * 2;
    }
}
