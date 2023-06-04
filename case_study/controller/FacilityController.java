package case_study.controller;

import case_study.common.ChoiceException;
import case_study.service.IFacilityService;
import case_study.service.impl.FacilityService;

import java.util.Scanner;

public class FacilityController {
    private static final Scanner scanner = new Scanner(System.in);
    private static final IFacilityService facilityService = new FacilityService();

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (true) {
            System.out.print("**Facility Management**\n" +
                    "1. Display list facility\n" +
                    "2. Add new facility\n" +
                    "3. Display list facility maintenance\n" +
                    "4. Remove list facility\n" +
                    "5. Return main menu\n" +
                    "Option: ");

            try {
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        facilityService.display();
                        break;
                    case 2:
                        facilityService.addFacility();
                        break;
                    case 3://display list facility maintenance
                        break;
                    case 4://remove list
                        break;
                    case 5:
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
