package ss16.bai_tap.bai_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FileBinary fileBinary = new FileBinary();
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        Scanner scanner = new Scanner(System.in);
        String path = null;
        while (true) {
            System.out.print("Nhập đường dẫn của file cần copy: ");
            try {
                path = scanner.nextLine();
                File file = new File(path);
                if (!file.exists()) {
                    throw new FileNotFoundException();
                }
                break;
            } catch (FileNotFoundException e) {
                }
        }
        String newPath=null;
        while (true) {
            System.out.print("Nhập đường dẫn mới cho file copy: ");
            try {
                newPath = scanner.nextLine();
                File file = new File(newPath);
                if(file.exists()){
                    throw new FileNotFoundException();
                }
                break;
            } catch (FileNotFoundException e) {
                System.out.println("********************************************");
                System.out.println("Đường dẫn đã có file săn, vui lòng nhập lại!");
                System.out.println("********************************************");
            }

        }


        fileBinary.copyFileBinary(path,newPath);
        List<Integer> copyFile = fileBinary.readFromFileBinary(newPath);
        System.out.println(copyFile);
    }
}
