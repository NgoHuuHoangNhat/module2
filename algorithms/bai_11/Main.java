package algorithms.bai_11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        int s;
        while (true) {
            do {
                System.out.print("Enter x: ");
                x = Integer.parseInt(scanner.nextLine());
                if (x < 0) {
                    System.out.println("X must be greater than or equal to 0!");
                } else break;
            } while (true);
            do {
                System.out.print("Enter y: ");
                y = Integer.parseInt(scanner.nextLine());
                if (y < 0) {
                    System.out.println("X must be greater than or equal to 0!");
                } else break;
            } while (true);
            do {
                System.out.print("Enter s: ");
                s = Integer.parseInt(scanner.nextLine());
                if (s <= 0) {
                    System.out.println("X must be greater than 0!");
                } else break;
            } while (true);
            System.out.println("Total pencils need buy: " + NumberOfPencil.getTotalPencilNeedBuy(x, y, s));
        }
    }

}
