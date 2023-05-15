package ss6.bai_tap.bai_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("nhập độ dài 3 cạnh của tam giác");

            System.out.print("cạnh a: ");
            double sizeA = Integer.parseInt(scanner.nextLine());

            System.out.print("cạnh b: ");
            double sizeB = Integer.parseInt(scanner.nextLine());

            System.out.print("cạnh c: ");
            double sizeC = Integer.parseInt(scanner.nextLine());

            if (sizeA + sizeB > sizeC && sizeA + sizeC > sizeB && sizeB + sizeC > sizeA &&
                    sizeA > 0 && sizeB > 0 && sizeC > 0) {

                Triangle triangle = new Triangle(sizeA, sizeB, sizeC);

                System.out.println(triangle);
            } else {
                System.out.println("Đây không phải tam giác!!!!!");
            }
        }
    }
}
