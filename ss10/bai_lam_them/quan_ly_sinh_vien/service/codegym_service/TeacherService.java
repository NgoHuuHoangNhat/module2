package ss10.bai_lam_them.quan_ly_sinh_vien.service.codegym_service;

import ss10.bai_lam_them.quan_ly_sinh_vien.model.codegym_person.CodegymStudent;
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
    public void add() {
        System.out.print("Nhập mã giảng viên:");
        String newId = scanner.nextLine();

        List<CodegymTeacher> teachers = teacherRepository.getAll();

        for (CodegymTeacher teacher : teachers) {
            if (teacher.equals(newId)) {
                flag = true;
            }
        }

        if (!flag) {
            System.out.print("Nhập tên giảng viên: ");
            String newName = scanner.nextLine();
            System.out.print("Chọn giới tính\n" +
                    "1. Nam\n" +
                    "2. Nữ");
            int chose = Integer.parseInt(scanner.nextLine());
            boolean gender;
            if (chose == 1) {
                gender = true;
            } else {
                gender = false;
            }
            System.out.print("Nhập bộ môn: ");
            String specializing = scanner.nextLine();

            CodegymTeacher newTeacher = new CodegymTeacher(newId, newName, gender, specializing);
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
    public void remove() {
        System.out.print("Nhập mã giảng viên cần xoá: ");
        String checkId = scanner.nextLine();

        CodegymTeacher teacher = (CodegymTeacher) teacherRepository.getById(checkId);

        if (teacher == null) {
            System.out.println("Không có giảng viên này!");
        } else {

            System.out.println("Bạn có muốn xoá giảng viên " + teacher.getName() + " có id là: " + checkId);
            System.out.println("1. Yes\n" +
                    "2. No");
            int chose = Integer.parseInt(scanner.nextLine());

            if (chose == 1) {
                teacherRepository.remove(teacher);
            }

        }
    }
}
