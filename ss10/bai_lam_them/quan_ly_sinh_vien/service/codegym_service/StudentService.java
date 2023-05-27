package ss10.bai_lam_them.quan_ly_sinh_vien.service.codegym_service;

import ss10.bai_lam_them.quan_ly_sinh_vien.model.codegym_person.CodegymStudent;
import ss10.bai_lam_them.quan_ly_sinh_vien.repositori.ICodegymRepository;
import ss10.bai_lam_them.quan_ly_sinh_vien.repositori.codegym_repository.StudentRepository;

import ss10.bai_lam_them.quan_ly_sinh_vien.service.ICodegymService;

import java.util.List;
import java.util.Scanner;

public class StudentService implements ICodegymService {
    private static Scanner scanner = new Scanner(System.in);
    private static ICodegymRepository studentRepository = new StudentRepository();
    private boolean flag;

    @Override
    public void add() {
        System.out.print("Nhập mã học viên: ");
        String newId = scanner.nextLine();

        List<CodegymStudent> students = studentRepository.getAll();

        for (CodegymStudent student : students) {
            if (student.getId().equals(newId)) {
                flag = true;
            }
        }

        if (!flag) {
            System.out.print("Nhập tên học viên: ");
            String newName = scanner.nextLine();
            boolean gender = false;
            while (true) {
                System.out.print("Nhập giới tính học viên\n" +
                        "1. Nam\n" +
                        "Khác 1. Nữ");
                try {
                    int chose = Integer.parseInt(scanner.nextLine());
                    if (chose == 1) {
                        gender = true;
                    }
                    break;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Nhập sai");
                }
            }
            System.out.print("Nhập lớp: ");
            String newClasses = scanner.nextLine();
            float score;
            while (true) {
                System.out.println("Nhập điểm: ");
                try {
                    score = Float.parseFloat(scanner.nextLine());
                    break;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Nhập sai!!!");
                }
            }
            CodegymStudent newStudent = new CodegymStudent(newId, newName, gender, newClasses, score);
            studentRepository.add(newStudent);
            System.out.println("Thêm học viên thành công!!!");
        } else {
            System.out.println("Mã id này đã được đăng kí!!!");
        }
    }

    @Override
    public void display() {
        List<CodegymStudent> students = studentRepository.getAll();
        for (CodegymStudent student : students) {
            System.out.println(student);
        }
    }

    @Override
    public void remove() {
        System.out.print("Nhập mã học viên cần xoá: ");
        String checkId = scanner.nextLine();

        CodegymStudent student = (CodegymStudent) studentRepository.getById(checkId);

        if (student == null) {
            System.out.println("Không có học viên này");
        } else {

            System.out.println("Bạn có muốn xoá học viên " + student.getName() + " có id là: " + checkId);
            System.out.println("1. Yes\n" +
                    "Khác. No");
            int chose = Integer.parseInt(scanner.nextLine());

            if (chose == 1) {
                studentRepository.remove(student);
            }

        }
    }
}

