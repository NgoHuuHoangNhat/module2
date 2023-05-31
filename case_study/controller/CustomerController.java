package case_study.controller;

import case_study.common.ChoiceException;

import java.util.Scanner;

public class CustomerController {
    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (true) {
            System.out.print("**Customer Management**\n" +
                    "1. Display list customers\n" +
                    "2. Add new customer\n" +
                    "3. Edit customer\n" +
                    "4. Return main menu\n" +
                    "Option: ");

            try {
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1://Display list customer
                        break;
                    case 2://add new customer
                        break;
                    case 3://edit customer
                        break;
                    case 4:
                        FuramaController.displayMainMenu();
                        break ;
                    default:
                        ChoiceException.choiceIsNotAvailable();
                        break;
                }
            } catch (NumberFormatException numberFormatException) {
                ChoiceException.choiceException();
            }
        }
    }
}
