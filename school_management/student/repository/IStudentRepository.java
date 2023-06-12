package school_management.student.repository;

import school_management.student.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> getAll();

    Student getById(String id);

    void addStudent(String studentStr);

    void remove(Student student);

    List<Student> getListByName(String name);

    void editStudent(Student student, String name, String gender, String classes, float score);
}
