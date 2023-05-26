package ss15.bai_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Tạo nhập dữ liệu vào file!
        FileText fileText = new FileText();

        String message = "Hello my name is Ngo Huu Hoang Nhat";
        fileText.writeToFile(message, "ss15\\bai_1\\file.txt");

        String message1 = "Hello my name is Dam Tuong Minh";
        fileText.writeToFile(message1, "ss15\\bai_1\\file.txt");

        String message2 = "Hello my name is Ngo Dinh Quan";
        fileText.writeToFile(message2, "ss15\\bai_1\\file.txt");

        String message3 = "Hello my name is Dam Thoai Tin";
        fileText.writeToFile(message3, "ss15\\bai_1\\file.txt");


        String message4 = "Hello my name is Le Huy";
        fileText.writeToFile(message4, "ss15\\bai_1\\file.txt");


//        Coppy file qua 1 đường dẫn mới!
        Scanner scanner = new Scanner(System.in);
        String path = "";
        String newPath = "";
        while (true) {
            System.out.println("File có sẵn: ss15/bai_1/file.txt");
            System.out.print("Nhập đường dẫn của file bạn muốn copy: ");
            try {
                path = scanner.nextLine();
                File file = new File(path);
                if (!file.exists()) {
                    throw new FileNotFoundException();
                }
                break;
            } catch (FileNotFoundException fileNotFoundException) {
                System.out.println("file nguồn chưa có, hãy nhập đường dẫn khác!");
            } catch (Exception e) {
                System.out.println("file nguồn chưa có, hãy nhập đường dẫn khác!");
            }
        }

        while (true) {
            System.out.print("Nhập vào đường dẫn mà bạn muỗn copy: ");
            try {
                newPath = scanner.nextLine();
                File file = new File(newPath);
                if (file.exists()) {
                    throw new FileNotFoundException();
                }
                break;
            } catch (FileNotFoundException fileNotFoundException) {
                System.out.println("file đã có sẵn, hãy nhập lại đường dẫn mới!");
            } catch (Exception e) {
                System.out.println("file đã có sẵn, hãy nhập lại đường dẫn mới!");
            }
        }

        fileText.copyFileText(path, newPath);

        System.out.println("Bạn đã copy thành công!!");


    }
}
