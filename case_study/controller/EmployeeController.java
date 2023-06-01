package case_study.controller;

import case_study.common.ChoiceException;
import case_study.service.IEmployeeService;
import case_study.service.IService;
import case_study.service.impl.EmployeeService;

import java.util.Scanner;

public class EmployeeController {
    private static IService employeeService = new EmployeeService();

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
                    case 1:
                        employeeService.display();
                        break;
                    case 2:
                        employeeService.create();
                        break;
                    case 3:
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
