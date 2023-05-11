package ss4.bai_tap.lop_fan;

import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;

public class Fan {
    final String SLOW = "Slow";
    final String MEDIUM = "Medium";
    final String FAST = "Fast";
    private int speed = 1;

    private boolean onOff = false;

    private double radius = 5;

    private String color = "blue";

    public Fan(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public String getSpeed() {
        switch (this.speed) {
            case 1:
                return SLOW;
            case 2:
                return MEDIUM;
            case 3:
                return FAST;
            default:
                return SLOW;
        }
    }

    public boolean getOnOff() {
        return this.onOff;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOnOff(boolean onOff) {
        this.onOff = onOff;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOff() {
        return "Fan{" +
                ", radius = " + getRadius() +
                ", color = " + getColor() + '\'' +
                ", fan is of " + '\'' +
                '}';
    }

    public String getOn() {
        return "Fan{" +
                "speed = " + getSpeed() +
                ", radius = " + getRadius() +
                ", color = " + getColor() +
                ", fan is on " + '\'' +
                '}';
    }
}
