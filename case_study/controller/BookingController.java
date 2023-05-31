package case_study.controller;

import case_study.common.ChoiceException;

import java.util.Scanner;

public class BookingController {
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (true) {
            System.out.print("**Booking Management**\n" +
                    "1. Add new booking\n" +
                    "2. Display list booking\n" +
                    "3. Create new contracts\n" +
                    "4. Edit contracts\n" +
                    "5. Return main menu\n" +
                    "Option: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1://add new booking
                        break;
                    case 2://display list booking
                        break;
                    case 3://create new contracts
                        break;
                    case 4://display list contracts
                        break;
                    case 5:FuramaController.displayMainMenu();
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
