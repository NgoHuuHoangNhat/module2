package ss7.thuc_hanh.compara;

import java.util.Arrays;

public class MainController {
    public static void main(String[] args) {

        Circle[] circles = new Circle[3];

        circles[0] = new Circle("green", true,8);
        circles[1] = new Circle("red", false,9);
        circles[2] = new Circle("yellow", true,10);

        Arrays.sort(circles);
        System.out.println("sắp xêp theo tăng dần: " + Arrays.toString(circles));


    }
}
