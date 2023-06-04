package case_study.controller;

import case_study.common.ChoiceException;

import java.util.Scanner;

public class PromotionController {
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (true) {
            System.out.println("**Promotion Management**\n" +
                    "1. Display list customers use service\n" +
                    "2. Display list customers get voucher\n" +
                    "3. Return main menu\n" +
                    "Option: ");

            try {
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1: //display list customers use service
                        break;
                    case 2:// display list customers get voucher
                        break;
                    case 3:
                        return;
                    default:
                        ChoiceException.choiceIsNotAvailable();
                }
            } catch (NumberFormatException numberFormatException) {
                ChoiceException.choiceException();
            }
        }
    }
}
