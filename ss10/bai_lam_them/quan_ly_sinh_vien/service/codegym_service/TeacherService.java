package ss10.bai_lam_them.quan_ly_sinh_vien.service.codegym_service;

import ss10.bai_lam_them.quan_ly_sinh_vien.cotroller.MainController;
import ss10.bai_lam_them.quan_ly_sinh_vien.model.codegym_person.CodegymTeacher;
import ss10.bai_lam_them.quan_ly_sinh_vien.repositori.codegym_repository.TeacherRepository;
import ss10.bai_lam_them.quan_ly_sinh_vien.service.ICodegymService;

import java.util.List;
import java.util.Scanner;

public class TeacherService implements ICodegymService {
    private static Scanner scanner = new Scanner(System.in);
    private static TeacherRepository teacherRepository = new TeacherRepository();

    private boolean flag;

    @Override
    public void add() {//Thêm giảng viên
        //Kiểm tra mã giản viên đã tồn tại hay chưa
        System.out.print("Nhập mã giảng viên:");
        String newId = scanner.nextLine();

        List<CodegymTeacher> teachers = teacherRepository.getAll();

        for (CodegymTeacher teacher : teachers) {
            if (teacher.equals(newId)) {
                flag = true;
            }
        }

        if (!flag) { //Nếu mã giảng viên đã tồn tại
            System.out.print("Nhập tên giảng viên: ");
            String newName = scanner.nextLine();
            boolean gender = false;

            while (true) {
                System.out.print("Chọn giới tính\n" +
                        "1. Nam\n" +
                        "2. Nữ");
                try {
                    int chose = Integer.parseInt(scanner.nextLine());

                    if (chose == 1) {
                        gender = true;
                        break;
                    } else if (chose != 2) {
                        System.out.println("Hạy lựa chọn 1 hoặc 2!");
                    }else {
                        break;
                    }
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("**************************************");
                    System.out.println("Nhập sai định dạng, vui lòng nhập lại!");
                    System.out.println("**************************************");

                }
            }

            //Nhập tên bộ môn
            System.out.print("Nhập bộ môn: ");
            String specializing = scanner.nextLine();

            //Tạo tạo 1 đối tượng teacher dựa vào những dữ liệu nhập vào
            CodegymTeacher newTeacher = new CodegymTeacher(newId, newName, gender, specializing);
            //Thêm giảng viên mới vào danh sách
            teacherRepository.add(newTeacher);
        }
    }

    @Override
    public void display() {
        List<CodegymTeacher> teachers = teacherRepository.getAll();
        for (CodegymTeacher teacher : teachers) {
            System.out.println(teacher);
        }
    }

    @Override
    public void remove() {//Xoá giảng viên
        //Kiểm tra id của giảng viên
        while (true) {
            try {
                System.out.print("Nhập mã giảng viên cần xoá: ");
                CodegymTeacher teacher = null;
                String checkId = scanner.nextLine();
                teacher = (CodegymTeacher) teacherRepository.getById(checkId);
                while (true) {
                    System.out.println("Bạn có muốn xoá giảng viên " + teacher.getName() + " có id là: " + checkId);
                    System.out.println("1. Yes\n" +
                            "2. No");
                    int chose = 0;
                    try {
                        chose = Integer.parseInt(scanner.nextLine());
                        if (chose == 1) {
                            teacherRepository.remove(teacher);
                            break;
                        } else if (chose != 2) {
                            System.out.println("Hãy lựa chọn 1 hoặc 2!");
                        }else {
                            MainController.menu();
                            break;
                        }
                    } catch (NumberFormatException numberFormatException) {
                        System.out.println("**************************************");
                        System.out.println("Nhập sai định dạng, vui lòng nhập lại!");
                        System.out.println("**************************************");

                    }

                }
                break;
            } catch (NullPointerException nullPointerException) {
                System.out.println("*************************");
                System.out.println("Giảng viên không tồn tại!");
                System.out.println("*************************");
            }


        }
    }

//            if (teacher == null) {
//                System.out.println("Không có giảng viên này!");
//            } else {
//
//                System.out.println("Bạn có muốn xoá giảng viên " + teacher.getName() + " có id là: " + checkId);
//                System.out.println("1. Yes\n" +
//                        "Khác 1. No");
//                int chose = Integer.parseInt(scanner.nextLine());
//
//                if (chose == 1) {
//                    teacherRepository.remove(teacher);
//                }
//
//            }
}


