package algorithms.bai_14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true){
            System.out.print("Enter string: ");
            String str = new Scanner(System.in).nextLine();
            int num = CheckedString.getDifferentNumberOfCharacter(str);
            System.out.println(num);
        }
    }
}
