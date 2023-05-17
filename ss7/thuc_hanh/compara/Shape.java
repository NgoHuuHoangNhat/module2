package ss7.thuc_hanh.comparable;

public class Shape {
    private String color;
    private boolean filled;
    protected Shape() {
        this.color = "green";
        this.filled = true;
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

