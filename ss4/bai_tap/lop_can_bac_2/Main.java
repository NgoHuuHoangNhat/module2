package ss4.bai_tap.lop_can_bac_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhập a: ");
        double numA = Double.parseDouble(scanner.nextLine());

        System.out.print("nhập b: ");
        double numB = Double.parseDouble(scanner.nextLine());

        System.out.print("nhập c: ");
        double numC = Double.parseDouble(scanner.nextLine());

        QuadraticEquation quadraticEquation = new QuadraticEquation(numA, numB, numC);

        if (numA == 0 && numB == 0 && numC == 0) {
            System.out.println("phương trình vô số nghiệm");
        } else if (quadraticEquation.getDelta() < 0 || numA == 0) {
            System.out.println("phương trình vô nghiệm");
        } else if (quadraticEquation.getDelta() == 0) {
            System.out.println("phương trình có nghiệm kép là: " + quadraticEquation.getDoubleSolution());
        } else {
            System.out.println("phương trình có 2 nghiệm phân biệt là: " + quadraticEquation.getRoot1() + " và " + quadraticEquation.getRoot2());
        }

    }
}
