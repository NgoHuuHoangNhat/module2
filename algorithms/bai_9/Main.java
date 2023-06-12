package algorithms.bai_9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter start num: ");
            int startNum = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter end num: ");
            int endNum = Integer.parseInt(scanner.nextLine());

            int numberOfCircleNum = CircleNum.findCircleNum(startNum, endNum);
            System.out.println(numberOfCircleNum);
        }
    }
}
