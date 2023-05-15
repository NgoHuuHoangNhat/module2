package ss6.bai_tap.bai_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(3, 4);

        point2D.setXY(5, 7);
        System.out.println(Arrays.toString(point2D.getXY()));

        Point3D point3D = new Point3D();

        point3D.setXYZ(5, 6, 7);
        System.out.println(Arrays.toString(point3D.getXYZ()));
    }
}
