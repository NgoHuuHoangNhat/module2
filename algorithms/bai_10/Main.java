package algorithms.bai_10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 0, 3};
        int totalMoney = 0;

        while (true) {
            System.out.print("Enter total money: ");
            try {
                totalMoney = Integer.parseInt(new Scanner(System.in).nextLine());
                break;
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Total money is wrong format, please re-input!");
            }
        }

        int totalProceeds = Money.exchangeMoney(arr, totalMoney);
        System.out.println("Total proceeds: " + totalProceeds);

    }
}
