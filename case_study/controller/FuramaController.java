package case_study.controller;

import case_study.common.ChoiceException;

import java.util.Scanner;

public class FuramaController {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() {
        while (true) {
            System.out.print("Select option:\n" +
                    "1. Employee Management\n" +
                    "2. Customer Management\n" +
                    "3. Facility Management\n" +
                    "4. Booking Management\n" +
                    "5. Promotion Management\n" +
                    "6. Exit\n" +
                    "Option: ");

            int choice = 0;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException numberFormatException) {
                ChoiceException.choiceException();
                displayMainMenu();
            }

            switch (choice) {
                case 1:
                    EmployeeController.menu();
                    break;
                case 2:
                    CustomerController.menu();
                    break;
                case 3:
                    FacilityController.menu();
                    break;
                case 4:
                    BookingController.menu();
                    break;
                case 5:
                    PromotionController.menu();
                    break;
                case 6:
                    System.exit(1);
                default:
                    ChoiceException.choiceIsNotAvailable();
            }
        }
    }


}
