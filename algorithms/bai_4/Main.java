package algorithms.bai_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter string: ");
        String str = (new Scanner(System.in)).nextLine();

        String newStr = CheckString.changeStr(str);
        System.out.println(newStr);

    }
}
