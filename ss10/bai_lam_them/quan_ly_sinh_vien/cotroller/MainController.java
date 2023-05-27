package ss10.bai_lam_them.quan_ly_sinh_vien.cotroller;

import ss10.bai_lam_them.quan_ly_sinh_vien.service.ICodegymService;
import ss10.bai_lam_them.quan_ly_sinh_vien.service.codegym_service.StudentService;
import ss10.bai_lam_them.quan_ly_sinh_vien.service.codegym_service.TeacherService;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class MainController {
    private static Scanner scanner = new Scanner(System.in);
    private static ICodegymService studentService = new StudentService();
    private static ICodegymService teacherService = new TeacherService();

    public static void menu() {


        while (true) {
            System.out.println("*************************************");
            System.out.println("Chọn chức năng theo số (để tiếp tục)");
            System.out.print(
                    "1. Thêm mới giảng viên hoặc học sinh\n" +
                            "2. Xoá giảng viên hoặc học sinh\n" +
                            "3. Xem danh sách giảng viên hoặc học sinh\n" +
                            "0. Thoát Chương Trình \n" +
                            "Chọn chức năng: ");

            int chose = 0;
            while (true) {
                try {
                    chose = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Nhập sai vui lòng nhập lại!");
                    menu();
                }
            }
            switch (chose) {
                case 0:
                    System.exit(1);
                case 1: {
                    while (true) {
                        System.out.println("Nhập để chọn\n" +
                                "1. Thêm mới học viên\n" +
                                "2. Thêm mới giảng viên\n" +
                                "0. Quay lại ");
                        try {
                            int choice = Integer.parseInt(scanner.nextLine());
                            switch (choice) {
                                case 0:
                                    menu();
                                    break;
                                case 1:
                                    studentService.add();
                                    break;
                                case 2:
                                    teacherService.add();
                                    break;
                                default:
                                    System.out.println("**********************************************");
                                    System.out.println("Không có chức năng này, xin vui lòng nhập lại!");
                                    System.out.println("**********************************************");

                            }
                        } catch (NumberFormatException numberFormatException) {
                            System.out.println("************************************");
                            System.out.println("Nhập sai, xin vui lòng lựa chọn lại!");
                            System.out.println("************************************");
                        }
                    }
                }
                case 2: {
                    while (true) {
                        System.out.println("Nhập để chọn\n" +
                                "1. Xoá học viên\n" +
                                "2. Xoá giảng viên\n" +
                                "0. Quay lại");
                        try {
                            int choice = Integer.parseInt(scanner.nextLine());
                            switch (choice) {
                                case 0:
                                    menu();
                                    break;
                                case 1:
                                    studentService.remove();
                                    break;
                                case 2:
                                    teacherService.remove();
                                    break;
                                default:
                                    System.out.println("**********************************************");
                                    System.out.println("Không có chức năng này, xin vui lòng nhập lại!");
                                    System.out.println("**********************************************");
                            }
                        } catch (NumberFormatException numberFormatException) {
                            System.out.println("**************************************");
                            System.out.println("Nhập sai, xin vui lòng lựa chọn lại!");
                            System.out.println("**************************************");
                        }
                    }
                }
                case 3: {
                    while (true) {
                        System.out.println("Nhập để chọn\n" +
                                "1. Xem danh sách học viên\n" +
                                "2. Xem danh sách giảng viên\n" +
                                "0. Thoát");
                        try {
                            int choice = Integer.parseInt(scanner.nextLine());
                            switch (choice) {
                                case 0:
                                    menu();
                                case 1:
                                    studentService.display();
                                    break;
                                case 2:
                                    teacherService.display();
                                    break;
                                default:
                                    System.out.println("**********************************************");
                                    System.out.println("Không có chức năng này vui, xin lòng chọn lại!");
                                    System.out.println("**********************************************");
                            }
                        } catch (NumberFormatException numberFormatException) {
                            System.out.println("**************************************");
                            System.out.println("Nhập sai, xin vui lòng lựa chọn lại!");
                            System.out.println("**************************************");
                        }
                    }
                }
                default:
                    System.out.println("**********************************************");
                    System.out.println("Không có chức năng này vui, xin lòng chọn lại!");
                    System.out.println("**********************************************");
            }
        }
    }
}

