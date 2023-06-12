package algorithms.bai_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter The First String: ");
            String firstStr = scanner.nextLine();
            System.out.print("Enter The Second String: ");
            String secondStr = scanner.nextLine();
            System.out.println(CheckStr.checkStr(firstStr,secondStr));
            System.out.println(CheckStr.checkStr(firstStr, secondStr).size());
        }
    }
}
