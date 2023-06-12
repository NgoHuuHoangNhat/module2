package algorithms.bai_15_luoi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String fileType = "";
            while (true) {
                System.out.print("Enter file type: ");
                fileType = scanner.nextLine();

                if (fileType.toLowerCase().equals("class") || fileType.toLowerCase().equals("package") ||
                        fileType.toLowerCase().equals("field") || fileType.toLowerCase().equals("method")) {
                    break;
                } else {
                    System.out.println("Nhập sai!");
                }
            }


            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            boolean check = CheckName.checkName(name, fileType);
            System.out.println(fileType + (check ? " is correct format of " : " is wrong format of ") + fileType);
        }
    }
}
