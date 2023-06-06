package case_study.controller;

import case_study.common.ChoiceException;
import case_study.service.IFacilityService;
import case_study.service.impl.FacilityService;

import java.util.Scanner;

public class FacilityController {
    private static  Scanner scanner = new Scanner(System.in);
    private static IFacilityService facilityService = new FacilityService();

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (true) {
            System.out.print("**Facility Management**\n" +
                    "1. Display list facility\n" +
                    "2. Add new facility\n" +
                    "3. Display list facility maintenance\n" +
                    "4. Remove list facility\n" +
                    "5. Clear maintenance\n"+
                    "6. Return main menu\n" +
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
                    case 3:
                        facilityService.displayMaintenance();
                        break;
                    case 4:
                        facilityService.removeFacilityList();
                        break;
                    case 5:
                        facilityService.clearMaintenance();
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
