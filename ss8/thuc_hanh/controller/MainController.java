package ss8.thuc_hanh.controller;

import ss8.thuc_hanh.model.Student;
import ss8.thuc_hanh.repository.StudentRepository;
import ss8.thuc_hanh.service.StudentService;

import java.util.Scanner;

public class MainController {
   StudentService student = new StudentService();
    public void showMenu(){
        Scanner scanner = new Scanner(System.in);

        MENU_WHILE: while (true){
            System.out.println("-----Student List-----");
            System.out.println("Menu:");
            System.out.println("1. Hiển thị danh sách sinh viên \n" +
                    "2. Thêm sinh viên\n" +
                    "3. Xoá sinh viên\n" +
                    "4. Sửa sinh viên\n" +
                    "5. Thoát chương trình");
            int chose = Integer.parseInt(scanner.nextLine());

            switch (chose) {
                case 1:
                    student.displayStudent();
                    break;
                case 2:
                    student.addStudent();
                    student.displayStudent();
                    break;
                case 3: //Xoá sinh viên
                    break;
                case 4://Sửa sinh viên
                    break;
                case 5: //Thoát
                    break MENU_WHILE;
                default:
                    System.out.println("Nhập sai");
            }
        }
    }
}
