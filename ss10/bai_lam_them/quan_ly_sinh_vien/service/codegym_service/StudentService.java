package ss10.bai_lam_them.quan_ly_sinh_vien.service.codegym_service;

import ss10.bai_lam_them.quan_ly_sinh_vien.cotroller.MainController;
import ss10.bai_lam_them.quan_ly_sinh_vien.model.codegym_person.CodegymStudent;
import ss10.bai_lam_them.quan_ly_sinh_vien.repositori.ICodegymRepository;
import ss10.bai_lam_them.quan_ly_sinh_vien.repositori.codegym_repository.StudentRepository;

import ss10.bai_lam_them.quan_ly_sinh_vien.service.ICodegymService;
import ss16.bai_tap.bai_1.exception.InputIsToLong;
import ss16.bai_tap.bai_1.exception.InputIsToShort;

import java.util.List;
import java.util.Scanner;

public class StudentService implements ICodegymService {
    private static Scanner scanner = new Scanner(System.in);
    private static ICodegymRepository studentRepository = new StudentRepository();
    private boolean flag;

    @Override
    public void add() {
        //Kiểm tra mã học viên đã tồn tại chưa
        String newId = null;
        while (true) {
            System.out.print("Nhập mã học viên: ");
            try {
                newId = scanner.nextLine();
                if (newId.length() < 6) {
                    throw new InputIsToShort();
                }
                if (newId.length() > 10) {
                    throw new InputIsToLong();
                }
                break;
            } catch (InputIsToLong e) {
                System.out.println("Mã quá dài!");
            } catch (InputIsToShort e) {
                System.out.println("Mã quá ngắn!");
            }
        }
        List<CodegymStudent> students = studentRepository.getAll();

        for (CodegymStudent student : students) {
            if (student.getId().equals(newId)) {
                flag = true;
            }
        }

        if (!flag) {//Nếu mã học viên chưa tồn tại
            //Nhập tên học viên
            String newName = null;
            while (true) {
                System.out.print("Nhập tên học viên: ");
                try {
                    newName = scanner.nextLine();
                    if (newName.length() < 3) {
                        throw new InputIsToShort();
                    }
                    if (newName.length() > 100) {
                        throw new InputIsToLong();
                    }
                    break;
                } catch (InputIsToLong e) {
                    System.out.println("Tên quá dài!");

                } catch (InputIsToShort e) {
                    System.out.println("Tên quá ngắn!");
                }
            }
            //Nhập giới tính cho học viên
            boolean gender = false;
            while (true) {
                System.out.print("Nhập giới tính học viên\n" +
                        "1. Nam\n" +
                        "2. Nữ\n" +
                        "Chọn: ");
                try {
                    int chose = Integer.parseInt(scanner.nextLine());
                    if (chose == 1) {
                        gender = true;
                        break;
                    } else if (chose == 2) {
                        gender = false;
                        break;
                    }

                } catch (NumberFormatException numberFormatException) {
                    System.out.println("**************************************");
                    System.out.println("Nhập sai định dạng, vui lòng nhập lại!");
                    System.out.println("**************************************");
                }
            }

            //Nhập lớp học viên
            String newClasses = null;
            while (true) {
                System.out.print("Nhập lớp: ");
                try {
                    newClasses = scanner.nextLine();
                    if (newClasses.length() < 7) {
                        throw new InputIsToShort();
                    }
                    if (newClasses.length() > 15) {
                        throw new InputIsToLong();
                    }
                    break;
                } catch (InputIsToLong e) {
                    System.out.println("Tên lớp quá dài!");
                } catch (InputIsToShort e) {
                    System.out.println("Tên lớp quá ngắn!");
                }
            }
            //Nhập điểm của học viên
            float score = 0;
            while (true) {
                System.out.println("Nhập điểm: ");
                try {
                    score = Float.parseFloat(scanner.nextLine());
                    break;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("****************************************");
                    System.out.println("Nhập sai định dạng, vui lòng nhập lại!!!");
                    System.out.println("****************************************");
                }
            }

            //tạo học viên mới dựa trên những dữ liệu nhập vào!
            CodegymStudent newStudent = new CodegymStudent(newId, newName, gender, newClasses, score);
            studentRepository.add(newStudent); //Thêm học viên mới vào danh sách!
            System.out.println("Thêm học viên thành công!!!");
        } else {
            //Nếu đã tồn tại id của học viên
            System.out.println("****************************");
            System.out.println("Mã id này đã được đăng kí!!!");
            System.out.println("****************************");
            add();
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
        while (true) {
            System.out.print("Nhập mã học viên cần xoá: ");
            String checkId = null;
            try {
                checkId = scanner.nextLine();
                if (checkId.length() < 7) {
                    throw new InputIsToShort();
                }
                if (checkId.length() > 10) {
                    throw new InputIsToLong();
                }
            } catch (InputIsToLong e) {
                System.out.println("Mã quá dài, vui lòng nhập lại!");
                remove();
            } catch (InputIsToShort e) {
                System.out.println("Mã quá ngắn, vui lòng nhập lại!");
                remove();
            }
            try {
                CodegymStudent student = (CodegymStudent) studentRepository.getById(checkId);
                while (true) {
                    System.out.println("Bạn có muốn xoá học viên " + student.getName() + " có id là: " + checkId);
                    System.out.println("1. Yes\n" +
                            "2. No");
                    try {
                        int chose = Integer.parseInt(scanner.nextLine());
                        if (chose == 1) {
                            studentRepository.remove(student);
                            System.out.println("Đã xoá học viên có tên là: " + student.getName() + " với id: " + student.getId());
                            break;
                        } else if (chose == 2) {
                            MainController.menu();
                            break;
                        } else {
                            System.out.println("**********************");
                            System.out.println("Hãy lựa chọn 1 hoặc 2!");
                            System.out.println("**********************");
                        }
                    } catch (NumberFormatException numberFormatException) {
                        System.out.println("********************************");
                        System.out.println("Nhập sai, xin vui lòng nhập lại!");
                        System.out.println("********************************");
                    }
                }
                break;
            } catch (NullPointerException nullPointerException) {
                System.out.println("*****************************************");
                System.out.println("Không có học viên này, vui lòng nhập lại!");
                System.out.println("*****************************************");
            }
        }
    }
}


