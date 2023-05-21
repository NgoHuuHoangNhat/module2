package ss10.bai_lam_them.quan_ly_sinh_vien.cotroller;

import ss10.bai_lam_them.quan_ly_sinh_vien.service.ICodegymService;
import ss10.bai_lam_them.quan_ly_sinh_vien.service.codegym_service.StudentService;
import ss10.bai_lam_them.quan_ly_sinh_vien.service.codegym_service.TeacherService;

import java.util.Scanner;

public class MainController {
    private static Scanner scanner = new Scanner(System.in);
    private static ICodegymService studentService = new StudentService();
    private static ICodegymService teacherService = new TeacherService();

    public static void menu() {


        while (true) {
            System.out.println("Chọn chức năng theo số (để tiếp tục):");
            System.out.print(
                    "1. Thêm mới giảng viên hoặc học sinh\n" +
                            "2. Xoá giảng viên hoặc học sinh\n" +
                            "3. Xem danh sách giảng viên hoặc học sinh\n" +
                            "0. Thoát \n" +
                            "Chọn chức năng: ");

            int chose = Integer.parseInt(scanner.nextLine());

            switch (chose) {
                case 0:
                    System.exit(1);
                case 1: {
                    System.out.println("Nhập để chọn\n" +
                            "1. Thêm mới học viên\n" +
                            "2. Thêm mới giảng viên\n" +
                            "0. Thoát");
                    int choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 0:
                            System.exit(1);
                        case 1:
                            studentService.add();
                            break;
                        case 2:
                            teacherService.add();
                            break;
                    }
                }
                break;
                case 2: {
                    System.out.println("Nhập để chọn\n" +
                            "1. Xoá học viên\n" +
                            "2. Xoá giảng viên\n" +
                            "0. Thoát");
                    int choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 0:
                            System.exit(1);
                        case 1:
                            studentService.remove();
                            break;
                        case 2:
                            teacherService.remove();
                            break;
                    }
                }
                break;
                case 3: {
                    System.out.println("Nhập để chọn\n" +
                            "1. Xem danh sách học viên\n" +
                            "2. Xem danh sách giảng viên\n" +
                            "0. Thoát");
                    int choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 0:
                            System.exit(1);
                        case 1:
                            studentService.display();
                            break;
                        case 2:
                            teacherService.display();
                            break;
                    }
                }
                break;
                default:
                    System.out.println("chọn sai");
            }
        }
    }
}
