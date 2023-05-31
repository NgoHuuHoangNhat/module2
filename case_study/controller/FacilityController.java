package case_study.controller;

import case_study.common.ChoiceException;

import java.util.Scanner;

public class FacilityController {
    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (true) {
            System.out.print("**Facility Management**\n" +
                    "1. Display list facility\n" +
                    "2. Add new facility\n" +
                    "3. Display list facility maintenance\n" +
                    "4. Return main menu\n" +
                    "Option: ");

            try {
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1://Display list facility
                        break;
                    case 2://add new facility
                        break;
                    case 3://display list facility maintenance
                        break;
                    case 4:
                        FuramaController.displayMainMenu();
                        break;
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
