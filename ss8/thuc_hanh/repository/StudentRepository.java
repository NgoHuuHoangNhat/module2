package ss8.thuc_hanh.repository;

import ss8.thuc_hanh.model.Student;

public class StudentRepository {

    private static Student[] studentList = new Student[100];

    static {
        studentList[0] = new Student("hv-00","Nhật",28,true);
        studentList[1] = new Student("hv-01","Quân",25,true);
        studentList[2] = new Student("hv-02","Huy",33,true);
        studentList[3] = new Student("hv-03","Minh",33,true);
    }

    public static Student[] getStudentList(){
        return studentList;
    }
}
