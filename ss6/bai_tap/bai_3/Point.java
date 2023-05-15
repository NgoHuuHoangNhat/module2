package ss6.bai_tap.bai_3;

import java.util.Arrays;

public class Point {
    float x;
    float y;

    Point() {

    }

    Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return this.x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        float[] arrXY = new float[2];
        arrXY[0] = this.x;
        arrXY[1] = this.y;
        return arrXY;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ")";
    }
}
