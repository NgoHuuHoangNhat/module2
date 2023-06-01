package case_study.service.impl;

import case_study.common.CheckInfo;
import case_study.common.ChoiceException;
import case_study.common.Regex;
import case_study.model.impl_person.impl.Employee;
import case_study.repository.IEmployeeRepository;
import case_study.repository.impl.EmployeeRepository;
import case_study.service.IEmployeeService;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {

    private static Scanner scanner = new Scanner(System.in);
    private static IEmployeeRepository employeeRepository = new EmployeeRepository();

    @Override
    public void display() {
        List<Employee> employeeList = employeeRepository.getAll();

        for (Employee e : employeeList) {
            System.out.println(e.toString());
        }
    }

    @Override
    public void create() {

        while (true) {
            String checkId = "";
            System.out.print("Enter employee id: ");
            checkId = scanner.nextLine();

            if (!Regex.checkId(checkId)) {
                System.out.println("Id code is wrong format, please re-enter!");
            } else {
                Employee employee = employeeRepository.getEmployeeById(checkId);

                if (employee != null) {
                    System.out.println("This employee is already on the list, please re-enter!");
                } else {
                    String employeeStr = enterInfo(checkId);
                    employeeRepository.add(employeeStr);
                    break;
                }

            }
        }
    }

    @Override
    public String enterInfo(String checkID) {
        String name = "";
        while (true) {
            System.out.print("Enter employee name: ");
            name = scanner.nextLine();
            if (name.length() < 2 || name.length() > 100) {
                System.out.println("Inappropriate name length, name length must be greater than 1 and less than 100! ");
            } else if (!Regex.checkName(name)) {
                System.out.println("Incorrect naming, the first letter of each word must be capitalized, please re-enter!");
            } else {
                break;
            }
        }

        String dateOFBirth = "";
        while (true) {
            System.out.print("Enter employee date of birth(yyyy-mm-dd): ");
            dateOFBirth = scanner.nextLine();
            if (!Regex.checkDateOfBirth(dateOFBirth)) {
                System.out.println("date of birth is not in the correct format, please re-enter! ");
            } else if (!CheckInfo.checkAgeOlderThanEighteen(dateOFBirth)) {
                System.out.println("This age under 18, input again!");
            } else {
                break;
            }
        }

        String gender = "";
        while (true) {
            System.out.print("Enter employee gender(male or female): ");
            gender = scanner.nextLine();
            if (gender.toLowerCase().equals("male") || gender.toLowerCase().equals("female")) {
                break;
            } else {
                System.out.println("There is not this gender, please re-enter! ");
            }
        }

        String passPort = "";
        while (true) {
            System.out.print("Enter employee pass port: ");
            passPort = scanner.nextLine();
            if (!Regex.checkPassPort(passPort)) {
                System.out.println("date of birth is not in the correct format, please re-enter! ");
            } else {
                break;
            }
        }

        String numberPhone = "";
        while (true) {
            System.out.print("Enter employee number phone: ");
            numberPhone = scanner.nextLine();
            if (!Regex.checkNumberPhone(numberPhone)) {
                System.out.println("Number phone is not in the correct format, please re-enter! ");
            } else {
                break;
            }
        }


        String email = "";
        while (true) {
            System.out.print("Enter employee email: ");
            email = scanner.nextLine();
            if (!Regex.checkEmail(email)) {
                System.out.println("Email is not in the correct format, please re-enter! ");
            } else {
                break;
            }
        }


        String level = "";
        while (true) {
            System.out.print("Select employee level: \n" +
                    "1. Secondary\n" +
                    "2. Colleges\n" +
                    "3. University\n" +
                    "4. After university\n" +
                    "Option: ");

            int choice = 0;

            try {
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        level = "Secondary";
                        break;
                    case 2:
                        level = "Colleges";
                        break;
                    case 3:
                        level = "University";
                        break;
                    case 4:
                        level = "After university";
                        break;
                    default:
                        ChoiceException.choiceIsNotAvailable();
                        break;
                }
                break;
            } catch (NumberFormatException numberFormatException) {
                ChoiceException.choiceException();
            }
        }

        String position = "";
        while (true) {
            System.out.print("Select employee position: \n" +
                    "1. Manager\n" +
                    "2. Sales manager\n" +
                    "3. Marketing manager\n" +
                    "4. Staff\n" +
                    "Option: ");

            int choice = 0;

            try {
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        position = "Manager";
                        break;
                    case 2:
                        position = "Sales manager";
                        break;
                    case 3:
                        position = "Marketing manager";
                        break;
                    case 4:
                        position = "Staff";
                        break;
                    default:
                        ChoiceException.choiceIsNotAvailable();
                        break;
                }
                break;
            } catch (NumberFormatException numberFormatException) {
                ChoiceException.choiceException();
            }
        }

        Long wage = 0L;
        while (true) {
            try {
                System.out.print("Enter employee salary:");
                wage = Long.parseLong(scanner.nextLine());
                if (wage < 1000000) {
                    System.out.println("The salary cannot be less than 1 million VND!");
                } else {
                    break;
                }
            } catch (NumberFormatException numberFormatException) {
                ChoiceException.choiceException();
            }
        }

        String employee = checkID + "," + name + "," + dateOFBirth + "," + gender + "," +
                passPort + "," + numberPhone + "," + email + "," + level + "," + position + "," + wage;
        return employee;
    }
}
