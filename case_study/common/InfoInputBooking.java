package case_study.common;

import sun.util.resources.LocaleData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class InfoInputBooking {
    private static Scanner scanner = new Scanner(System.in);
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public static String enterBookingDay() {
        while (true) {
            System.out.print("Enter booking day(yyyy-mm-dd): ");
            String bookingDay = scanner.nextLine();
            if (!Regex.checkDateOfBirth(bookingDay)) {
                System.out.println("Booking day is wrong format, please re-input!");
            } else {
                return bookingDay;
            }
        }
    }

    public static String enterRentalStartDay(String bookingDay) {
        while (true) {
            System.out.print("Enter rental start day(yyyy-mm-dd): ");
            String rentalStartDay = scanner.nextLine();
            if (!Regex.checkDateOfBirth(rentalStartDay)) {
                System.out.println("Booking day is wrong format, please re-input!");
            } else {
                try {
                    Date bookingDate = simpleDateFormat.parse(bookingDay);
                    Date rentalStartDate = simpleDateFormat.parse(rentalStartDay);

                    if (bookingDate.compareTo(rentalStartDate) < 0) {
                        System.out.println("The rental start time must be after the booking time!");
                    } else {
                        return rentalStartDay;
                    }
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static String enterRentalEndDay(String rentalStartDay) {
        while (true) {
            System.out.print("Enter rental end day(yyyy-mm-dd): ");
            String rentalEndDay = scanner.nextLine();
            if (!Regex.checkDateOfBirth(rentalEndDay)) {
                System.out.println("Rental end day is wrong format, please re-input!");
            } else {
                try {
                    Date rentalEndDate = simpleDateFormat.parse(rentalEndDay);
                    Date rentalStartDate = simpleDateFormat.parse(rentalStartDay);
                    if (rentalEndDate.compareTo(rentalStartDate) < 0) {
                        System.out.println("The rental end day must be after rental start day, please re-input!");
                    }else {
                        return rentalEndDay;
                    }
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
