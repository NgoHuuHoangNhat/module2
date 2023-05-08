package ss1.thuc_hanh;

import java.util.Scanner;

public class RectangularArea {
    public static void main(String[] args) {
        float width, heigth;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width: ");
        width = scanner.nextFloat();


        System.out.println("Enter height: ");
        heigth = scanner.nextFloat();

        float area = width * heigth;
        System.out.println("Diện tích là: " + area);
    }
}
