package ss10.bai_5;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bracket bracket = new Bracket();

        while (true) {
            System.out.print("nhập 1 chuỗi có dấu '()': ");
            String str = scanner.nextLine();

            System.out.println("chuỗi nhập vào là: " + str);
            System.out.println((bracket.testBracket(str) ? "dấu ngoặc được sử dụng đúng" : "dấu ngoặc sử dụng sai"));
        }
    }
}
