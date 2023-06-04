package case_study.controller;

import case_study.common.ChoiceException;
import case_study.service.ICustomerService;
import case_study.service.IService;
import case_study.service.impl.CustomerService;

import java.util.Scanner;

public class CustomerController {
    private static ICustomerService customerService = new CustomerService();

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (true) {
            System.out.print("**Customer Management**\n" +
                    "1. Display list customers\n" +
                    "2. Add new customer\n" +
                    "3. Edit customer\n" +
                    "4. Remove customer\n" +
                    "5. Search customer\n" +
                    "6. Return main menu\n" +
                    "Option: ");

            try {
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        customerService.display();
                        break;
                    case 2:
                        customerService.create();
                        break;
                    case 3:
                        customerService.edit();
                        break;
                    case 4:
                        customerService.remove();
                        break;
                    case 5:
                        customerService.search();
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
