package ss8.thuc_hanh.service;

import ss8.thuc_hanh.model.Student;
import ss8.thuc_hanh.repository.StudentRepository;

import java.util.Scanner;

public class StudentService {
    Scanner scanner = new Scanner(System.in);
    private StudentRepository studentRepository;
    private Student[] studentList;

    public void displayStudent() {
        for (Student student : studentList) {
            if (student != null) {
                System.out.println(student);
            }
        }

    }

    public void addStudent() {
        studentRepository = new StudentRepository();
        studentList = studentRepository.getStudentList();

        System.out.print("nhập mã học viên: ");
        String checkID = scanner.nextLine();
        boolean flag = true;

        for (Student student : studentList) {
            if (student.getId().equals(checkID)) {
                flag = false;
                System.out.println("học viên này đã tồn tại");
                break;
            }
        }

        if (flag) {

            Student newStudent = new Student();


            for (int i = 0; i < studentList.length; i++) {
                if (studentList[i] == null) {
                    newStudent.setId(checkID);
                    System.out.print("nhập tên học viên: ");
                    newStudent.setName(scanner.nextLine());
                    System.out.print("nhập tuổi học viên: ");
                    newStudent.setAge(Integer.parseInt(scanner.nextLine()));

                    do {

                        System.out.print("nhập giới tính học viên: \n" +
                                "0. Nam\n" +
                                "1. Nữ");
                        int gender = Integer.parseInt(scanner.nextLine());
                        if (gender == 0) {
                            newStudent.setGender(true);
                            break;
                        } else if (gender == 1) {
                            newStudent.setGender(false);
                            break;
                        } else {
                            System.out.println("nhập sai, hãy nhập lại!!!");
                        }
                    } while (true);
                }
                studentList[i] = newStudent;
                break;
            }
        }
    }

}
