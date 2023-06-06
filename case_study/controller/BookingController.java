package case_study.controller;

import case_study.common.ChoiceException;
import case_study.service.IBookingService;
import case_study.service.IContractService;
import case_study.service.impl.BookingService;
import case_study.service.impl.ContractService;

import java.util.Scanner;

public class BookingController {
    private static IBookingService bookingService = new BookingService();
    private static IContractService contractService = new ContractService();

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (true) {
            System.out.print("**Booking Management**\n" +
                    "1. Add new booking\n" +
                    "2. Display list booking\n" +
                    "3. Create new contracts\n" +
                    "4. Edit contracts\n" +
                    "5. Display contracts list\n" +
                    "6. Return main menu\n" +
                    "Option: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        bookingService.create();
                        break;
                    case 2:
                        bookingService.display();
                        break;
                    case 3:
                        contractService.createContract();
                        break;
                    case 4:
                        contractService.editContract();
                        break;
                    case 5:
                        contractService.displayContractList();
                        break;
                    case 6:
                        return;
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
