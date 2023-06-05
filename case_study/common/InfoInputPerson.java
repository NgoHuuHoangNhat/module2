package case_study.common;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class InfoInputPerson {
    private static Scanner scanner = new Scanner(System.in);

    public static boolean checkAgeOlderThanEighteen(String dateOfBirth) {
        LocalDate current = LocalDate.now();
        LocalDate dOB = LocalDate.parse(dateOfBirth);
        int age = Period.between(dOB, current).getYears();
        if (age >= 18) {
            return true;
        }
        return false;
    }

    public static String enterName() {
        String name = "";
        while (true) {
            System.out.print("Enter name: ");
            name = scanner.nextLine();
            if (name.length() < 2 || name.length() > 100) {
                System.out.println("Inappropriate name length, name length must be greater than 1 and less than 100! ");
            } else if (!Regex.checkName(name)) {
                System.out.println("Incorrect naming, the first letter of each word must be capitalized, please re-input!");
            } else {
                return name;
            }
        }
    }

    public static String enterDateOfBirth() {
        String dateOFBirth = "";
        while (true) {
            System.out.print("Enter date of birth(yyyy-mm-dd): ");
            dateOFBirth = scanner.nextLine();
            if (!Regex.checkDateOfBirth(dateOFBirth)) {
                System.out.println("date of birth is not in the correct format, please re-input! ");
            } else if (!InfoInputPerson.checkAgeOlderThanEighteen(dateOFBirth)) {
                System.out.println("This age under 18, input again!");
            } else {
                return dateOFBirth;
            }
        }
    }

    public static String enterGender() {
        String gender = "";
        while (true) {
            System.out.print("Enter gender(male or female): ");
            gender = scanner.nextLine();
            if (!Regex.checkGender(gender)) {
                System.out.println("Gender is wrong format, please re-input!");
            } else {
                if (gender.equals("Male") || gender.equals("Female")) {
                    return gender;
                } else {
                    System.out.println("There is not this gender, please re-enter! ");
                }
            }
        }
    }

    public static String enterPassPort() {

        String passPort = "";
        while (true) {
            System.out.print("Enter pass port: ");
            passPort = scanner.nextLine();
            if (!Regex.checkPassPort(passPort)) {
                System.out.println("date of birth is not in the correct format, please re-input! ");
            } else {
                return passPort;
            }
        }
    }

    public static String enterNumberPhone() {

        String numberPhone = "";
        while (true) {
            System.out.print("Enter number phone: ");
            numberPhone = scanner.nextLine();
            if (!Regex.checkNumberPhone(numberPhone)) {
                System.out.println("Number phone is not in the correct format, please re-enter! ");
            } else {
                return numberPhone;
            }
        }
    }

    public static String enterEmail() {

        String email = "";
        while (true) {
            System.out.print("Enter email: ");
            email = scanner.nextLine();
            if (!Regex.checkEmail(email)) {
                System.out.println("Email is not in the correct format, please re-enter! ");
            } else {
                return email;
            }
        }
    }

    public static String enterTypeOfGuest() {

        String typeOfGuest = "";
        while (true) {
            System.out.print("Select customer type: \n" +
                    "1. Diamond\n" +
                    "2. Platinum\n" +
                    "3. Gold\n" +
                    "4. Silver\n" +
                    "5. Member\n" +
                    "Option: ");

            int choice = 0;

            try {
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        return typeOfGuest = "Diamond";
                    case 2:
                        return typeOfGuest = "Platinum";
                    case 3:
                        return typeOfGuest = "Gold";
                    case 4:
                        return typeOfGuest = "Silver";
                    case 5:
                        return typeOfGuest = "Member";
                    default:
                        ChoiceException.choiceIsNotAvailable();
                        break;
                }
            } catch (NumberFormatException numberFormatException) {
                ChoiceException.choiceException();
            }
        }
    }

    public static String enterAddress() {
        System.out.print("Select customer address: ");
        String address = scanner.nextLine();
        return address;
    }

    public static String enterLevel() {
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
                        return level = "Secondary";
                    case 2:
                        return level = "Colleges";
                    case 3:
                        return level = "University";
                    case 4:
                        return level = "After university";
                    default:
                        ChoiceException.choiceIsNotAvailable();
                        break;
                }
            } catch (NumberFormatException numberFormatException) {
                ChoiceException.choiceException();
            }
        }
    }

    public static String enterPosition() {
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
                        return position = "Manager";
                    case 2:
                        return position = "Sales manager";
                    case 3:
                        return position = "Marketing manager";
                    case 4:
                        return position = "Staff";
                    default:
                        ChoiceException.choiceIsNotAvailable();
                        break;
                }
            } catch (NumberFormatException numberFormatException) {
                ChoiceException.choiceException();
            }
        }
    }

    public static long enterWage() {
        long wage = 0L;
        while (true) {
            try {
                System.out.print("Enter employee salary:");
                wage = Long.parseLong(scanner.nextLine());
                if (wage < 1000000) {
                    System.out.println("The salary cannot be less than 1 million VND!");
                } else {
                    return wage;
                }
            } catch (NumberFormatException numberFormatException) {
                ChoiceException.choiceException();
            }
        }
    }
}
