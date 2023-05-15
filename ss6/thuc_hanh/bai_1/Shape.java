package ss6.thuc_hanh.bai_1;

public class Shape {
    private String color = "green";
    private Boolean filled = true;

    Shape(){

    }
    Shape(String color, Boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return this.color;
    }
    public Boolean getFilled(){
        return this.filled;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setFilled(Boolean filled){
        this.filled = filled;
    }


    public String toStr() {
        return "The Shape with color off " + getColor() + " and " + (getFilled() ? "filled" : "not-filled");
    }

}
