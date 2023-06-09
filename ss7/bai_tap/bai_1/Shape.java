package ss7.bai_tap.bai_1;

public class Shape {
    /**
     * @creactor: Nhat
     * @param: class Shape đc tạo ra để khai báo thuộc tính collor và filled, là lớp cha của các lớp Circle, Retangle, Square
     * @param color: thuộc tính màu sắc
     * @param filled: thuộc tính filled
     */
    private String color;
    private boolean filled;

    /**
     * @param các contructor
     */
    Shape() {
        this.color = "green";
        this.filled = true;
    }

    Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /**
     * getter và setter
     * @return
     */
    public String getColor() {
        return this.color;
    }

    public Boolean getFilled() {
        return this.filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    /**
     * phương thức toString
     * @return
     */

    @Override
    public String toString() {
        return "The Shape with color off " + getColor() + " and " + (getFilled() ? "filled" : "not-filled");
    }

}

