package ss1.bai_tap;

import java.util.Scanner;

public class NumbersIntoWords {

    public static void main(String[] args) {

        String strOnes = "";
        String strTens = "";
        String strHundreds = "";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập 1 số tự nhiên bé hơn 1000");
        int num = scanner.nextInt();

        int ones = num % 10;
        int tens = num / 10 % 10;
        int hundreds = num / 100 % 10;

        switch (ones) {
            case 0:
                strOnes = "";
                break;
            case 1:
                strOnes = "one";
                break;
            case 2:
                strOnes = "two";
                break;
            case 3:
                strOnes = "three";
                break;
            case 4:
                strOnes = "four";
                break;
            case 5:
                strOnes = "five";
                break;
            case 6:
                strOnes = "six";
                break;
            case 7:
                strOnes = "seven";
                break;
            case 8:
                strOnes = "eight";
                break;
            case 9:
                strOnes = "nine";
                break;

        }

        switch (tens) {
            case 1:
                switch (ones) {
                    case 0:
                        strTens = "ten";
                        break;
                    case 1:
                        strTens = "eleven";
                        break;
                    case 2:
                        strTens = "twelve";
                        break;
                    case 3:
                        strTens = "thirteen";
                        break;
                    case 5:
                        strTens = "fifteen";
                        break;
                    case 8:
                        strTens = "eighteen";
                        break;
                    default:
                        strTens = strOnes + "teen";
                        break;
                }
                break;
            case 2:
                strTens = "twen";
                break;
            case 3:
                strTens = "thir";
                break;
            case 4:
                strTens = "four";
                break;
            case 5:
                strTens = "fif";
                break;
            case 6:
                strTens = "six";
                break;
            case 7:
                strTens = "seven";
                break;
            case 8:
                strTens = "eigh";
                break;
            case 9:
                strTens = "nine";
                break;

        }
        switch (hundreds) {

            case 1:
                strHundreds = "one";
                break;
            case 2:
                strHundreds = "two";
                break;
            case 3:
                strHundreds = "three";
                break;
            case 4:
                strHundreds = "four";
                break;
            case 5:
                strHundreds = "five";
                break;
            case 6:
                strHundreds = "six";
                break;
            case 7:
                strHundreds = "seven";
                break;
            case 8:
                strHundreds = "eight";
                break;
            case 9:
                strHundreds = "nine";
                break;

        }

        if (num < 0 || num >= 1000) {
            System.out.println("Ngoài khả năng");
        } else if (num < 10) {
            if (ones == 0) {
                System.out.println("zero");
            } else {
                System.out.println(strOnes);
            }
        } else if (num < 20) {
            System.out.println(strTens);
        } else if (num < 100) {
            System.out.println(strTens + "ty " + strOnes);
        } else {
            if (tens == 0) {
                if (ones == 0) {
                    System.out.println(strHundreds + " hundred");
                } else {
                    System.out.println(strHundreds + " hundred and " + strOnes);
                }
            } else if (tens == 1) {
                System.out.println(strHundreds + " hundred and " + strTens);
            } else {
                System.out.println(strHundreds + " hundred and " + strTens + "ty " + strOnes);
            }
        }
    }
}