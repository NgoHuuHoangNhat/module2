package school_management.student.service.imp;

import case_study.model.impl_person.impl.Employee;
import school_management.student.model.Student;
import school_management.student.repository.IStudentRepository;
import school_management.student.repository.imp.StudentRepository;
import school_management.student.service.IStudentService;

import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private static Scanner scanner = new Scanner(System.in);
    private static IStudentRepository studentRepository = new StudentRepository();

    @Override
    public void display() {
        List<Student> studentList = studentRepository.getAll();
        if (studentList == null) {
            System.out.println("Student list is empty!");
        } else {
            for (Student student : studentList) {
                System.out.println(student);
            }
        }
    }

    @Override
    public void add() {
        do {
            System.out.print("Enter id: ");
            String id = scanner.nextLine();
            if (!id.matches("^S-\\d{2}$")) {
                System.out.println("Id is wrong format, please re-input!");
            } else {
                Student student = studentRepository.getById(id);
                if (student != null) {
                    System.out.println("This student is already in the list, please re-input!");
                } else {
                    String name = enterName();
                    String gender = enterGender();
                    String classes = enterClass();
                    float score = enterScore();

                    String studentStr = id + "," + name + "," + gender + "," + classes + "," + score;
                    studentRepository.addStudent(studentStr);
                    System.out.println("Student has added in the list!");
                    break;
                }
            }
        } while (true);
    }

    @Override
    public void remove() {
        do {
            System.out.print("Enter id: ");
            String id = scanner.nextLine();
            if (!id.matches("^S-\\d{2}$")) {
                System.out.println("Id is wrong format, please re-input!");
            } else {
                Student student = studentRepository.getById(id);
                if (student == null) {
                    System.out.println("This student is not already in the list, please re-input!");
                } else {
                    System.out.print("You really want to delete this student?\n" +
                            "Enter yes to delete: ");
                    String option = scanner.nextLine();
                    if (option.toLowerCase().equals("yes")) {
                        studentRepository.remove(student);
                        System.out.println("You deleted this student!");
                    }
                    System.out.println("Thank you!");
                    break;
                }
            }

        } while (true);
    }

    @Override
    public void search() {

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        List<Student> studentList = studentRepository.getListByName(name);
        if (studentList == null) {
            System.out.println("This student is not on the list!");
        } else {
            for (Student student : studentList) {
                System.out.println(student);
            }
        }

    }

    @Override
    public void edit() {
        do {
            System.out.print("Enter id: ");
            String id = scanner.nextLine();
            if (!id.matches("^S-\\d{2}$")) {
                System.out.println("Id is wrong format, please re-input!");
            } else {
                Student student = studentRepository.getById(id);
                if (student == null) {
                    System.out.println("This student is not already in the list, please re-input!");
                } else {
                    String name = enterName();
                    String gender = enterGender();
                    String classes = enterClass();
                    float score = enterScore();

                    studentRepository.editStudent(student,name,gender,classes,score);
                    System.out.println("Student has edited in the list!");
                    break;
                }
            }
        }while (true);
    }

    private float enterScore() {
        float score = 0;
        do {
            System.out.print("Enter score: ");
            try {
                score = Float.parseFloat(scanner.nextLine());
                if (score < 0 || score > 10) {
                    System.out.println("Score has greater than 0 and less than 10, please re-input!");
                } else {
                    return score;
                }
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Score is wrong format, please re-input!");
            }
        } while (true);
    }

    private String enterClass() {
        String classes = "";
        do {
            System.out.print("Enter class: ");
            classes = scanner.nextLine();
            if (!classes.matches("^C\\d{4}G1$")) {
                System.out.println("Classes is wrong format, please re-input!");
            } else {
                return classes;
            }
        } while (true);
    }

    private String enterGender() {
        String gender = "";
        do {
            System.out.print("Enter gender: ");
            gender = scanner.nextLine();
            if (gender.toLowerCase().equals("nam")) {
                gender = "Nam";
                break;
            } else if (gender.toLowerCase().equals("nu")) {
                gender = "Nữ";
                break;
            } else {
                System.out.println("Gender is wrong format, please re-input!");
            }
        } while (true);
        return gender;
    }

    private String enterName() {
        String name = "";
        do {
            System.out.print("Enter name: ");
            name = scanner.nextLine();
            if (!name.matches("^(([A-Z][a-z]+|[A-Z])(\\s+|$))+$")) {
                System.out.println("Name is wrong format, please re-input!");
            } else {
                break;
            }
        } while (true);
        return name;
    }
}
