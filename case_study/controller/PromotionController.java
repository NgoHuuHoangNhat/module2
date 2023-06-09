package case_study.controller;

import case_study.common.ChoiceException;
import case_study.service.IBookingService;
import case_study.service.impl.BookingService;

import java.util.Scanner;

public class PromotionController {
    private static IBookingService bookingService = new BookingService();
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
                    case 1:
                        bookingService.displayListCustomerUseService();
                        break;
                    case 2:bookingService.displayListCustomerGetVoucher();
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
