package case_study.common;

import java.util.Scanner;

public class InfoInputFacility {
    private static Scanner scanner = new Scanner(System.in);

    public static String enterServiceName() {
        while (true) {
            System.out.print("Enter service name: ");
            String serviceName = scanner.nextLine();
            if (!Regex.checkServiceName(serviceName)) {
                System.out.println("The service name is wrong format, please re-input!");
            } else if (serviceName.length() < 3 || serviceName.length() > 100) {
                System.out.println("Inappropriate name service length, name service length must be greater than 3 and less than 100! ");
            } else {
                return serviceName;
            }
        }
    }

    public static Float enterArea() {
        while (true) {
            System.out.print("Enter facility area: ");
            float facilityArea = 0;
            try {
                facilityArea = Float.parseFloat(scanner.nextLine());
                if (facilityArea < 30) {
                    System.out.println("The facility area is not suitable; it must be more than 30 square meters, please re-input!");
                } else {
                    return facilityArea;
                }
            } catch (NumberFormatException numberFormatException) {
                ChoiceException.choiceException();
            }

        }
    }

    public static Float enterRentalCost() {
        while (true) {
            System.out.print("Enter rental cost: ");
            float rentalCost = 0;
            try {
                rentalCost = Float.parseFloat(scanner.nextLine());
                if (rentalCost <= 0) {
                    System.out.println("The rental cost must be greater than 0, please re-input!");
                } else {
                    return rentalCost;
                }
            } catch (NumberFormatException numberFormatException) {
                ChoiceException.choiceException();
            }
        }
    }

    public static int enterNumberOfPeople() {
        while (true) {
            System.out.print("Enter number of people: ");
            int numberOfPeople = 0;
            try {
                numberOfPeople = Integer.parseInt(scanner.nextLine());
                if (numberOfPeople <= 0 || numberOfPeople > 20) {
                    System.out.println("Number of people must be greater than 0 and less than 20, please re-input!");
                } else {
                    return numberOfPeople;
                }
            } catch (NumberFormatException numberFormatException) {
                ChoiceException.choiceException();
            }
        }
    }

    public static String enterRentalType() {
        while (true) {
            System.out.print("Enter rental type: ");
            String rentalType = scanner.nextLine();
            if (!Regex.checkServiceName(rentalType)) {
                System.out.println("The rental type is wrong format, please re-input!");
            } else if (rentalType.length() < 3 || rentalType.length() > 100) {
                System.out.println("The rental type length must be greater than 3 and less than 100, please re-input!");
            } else {
                return rentalType;
            }
        }
    }

    public static String enterStandard() {
        while (true) {
            System.out.print("Enter standard: ");
            String standard = scanner.nextLine();
            if (!Regex.checkServiceName(standard)) {
                System.out.println("Standard is wrong format, please re-input!");
            } else if (standard.length() < 3 || standard.length() > 100) {
                System.out.println("Standard length must be greater 3 and less than 100, please re-input! ");
            } else {
                return standard;
            }
        }
    }

    public static float enterAreaOfSwimmingPool() {
        while (true) {
            System.out.print("Enter area of swimming pool: ");
            float area = 0;
            try {
                area = Float.parseFloat(scanner.nextLine());
                if (area < 30) {
                    System.out.println("The swimming pool area must be greater 30 square meters, please re-input! ");
                } else {
                    return area;
                }
            } catch (NumberFormatException numberFormatException) {
                ChoiceException.choiceException();
            }
        }
    }

    public static int enterNumberFloor() {
        while (true) {
            System.out.print("Enter number floor: ");
            int numberFloor = 0;
            try {
                numberFloor = Integer.parseInt(scanner.nextLine());
                if (numberFloor < 1) {
                    System.out.println("The number floor must be greater than 0, please re-input");
                } else {
                    return numberFloor;
                }
            } catch (NumberFormatException numberFormatException) {
                ChoiceException.choiceException();
            }

        }
    }

    public static String enterVoucher() {
        while (true) {
            System.out.print("Enter voucher: ");
            String voucher = scanner.nextLine();
            if (voucher.length() < 3 || voucher.length() > 100) {
                System.out.println("Voucher length must been greater than 3 and less than 100, please re-input!");
            } else {
                return voucher;
            }
        }
    }
}
