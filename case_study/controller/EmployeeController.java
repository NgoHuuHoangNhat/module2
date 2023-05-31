package case_study.controller;

import case_study.common.ChoiceException;

import java.util.Scanner;

public class EmployeeController {
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (true) {
            System.out.print("**Employee Management**\n" +
                    "Select option:\n" +
                    "1. Display list employees\n" +
                    "2. Add new employee\n" +
                    "3. Edit employee\n" +
                    "4. Return main menu\n" +
                    "Option: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1://Display list employee
                        break;
                    case 2: // add new list employee
                        break;
                    case 3://edit employee
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
