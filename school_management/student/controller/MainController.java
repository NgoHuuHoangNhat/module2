package school_management.student.controller;

import school_management.student.service.IStudentService;
import school_management.student.service.imp.StudentService;

import java.util.Scanner;

public class MainController {
    private static Scanner scanner = new Scanner(System.in);
    private static IStudentService studentService = (IStudentService) new StudentService();
    public static void menu() {
        do {
            System.out.print("Enter your option: \n" +
                    "1. Display student list\n" +
                    "2. Add new student\n" +
                    "3. Delete student\n" +
                    "4. Search student\n" +
                    "5. Edit student\n" +
                    "6. Exit\n" +
                    "Option: ");

            String choice = scanner.nextLine();
            switch (choice) {
                case "1": studentService.display();
                    break;
                case "2": studentService.add();
                    break;
                case "3":studentService.remove();
                    break;
                case "4":studentService.search();
                    break;
                case "5":studentService.edit();
                    break;
                case "6":
                    System.exit(1);
                default:
                    System.out.println("Your option is not in the list, please re-input!");
            }
        } while (true);
    }
}
