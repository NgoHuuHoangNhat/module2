package ss6.thuc_hanh.bai_1;

public class Shape {
    private String color = "green";
    private boolean filled = true;

    protected Shape() {

    }

    protected Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

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

    @Override
    public String toString() {
        return "The Shape with color off " + getColor() + " and " + (getFilled() ? "filled" : "not-filled");
    }

}
