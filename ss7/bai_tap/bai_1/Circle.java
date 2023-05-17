package ss7.bai_tap.bai_1;

public class Circle extends Shape implements Resizeable {
    /**
     * @creator: Nhat
     * Class Cirle kế thừa class Shape và sử dụng phương thức của interface ResizeableInterface
     */


    private double radius;

    /**
     *
     * @param color: thuộc tính màu sắc:
     * @param filled: thuộc tính filled:
     * @param radius: thuộc tính bán kính:
     */

    Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * @param getter/setter của từng thuộc tính
     */
    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * @param phương thức tính diện tích hình tròn
     * @return: diện tích hình tròn
     */
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    /**
     *
     * @param percent: tỉ lệ (%)
     * @param phương thức tính diện tích của 1 hình sau khi thay đổi kích thước
     * @param sử dụng phương thức của interface ResizeableInterface
     */
    @Override
    public void resize(double percent) {
        System.out.println(getArea() + getArea() * percent / 100);
    }
}
