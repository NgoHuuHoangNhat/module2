package school_management.student.repository.imp;

import school_management.student.common.File;
import school_management.student.model.Student;
import school_management.student.repository.IStudentRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private static List<Student> studentList = new ArrayList<>();
    private static final String STUDENT_PATH = "school_management/student/file/student_list.csv";

    @Override
    public List<Student> getAll() {
        studentList.clear();
        List<String> stringList = File.readFromFile(STUDENT_PATH);
        String[] info;
        for (String str : stringList) {
            info = str.split(",");
            studentList.add(new Student(info[0], info[1], info[2], info[3], Float.parseFloat(info[4])));
        }
        if (stringList.size() == 0) {
            return null;
        }
        return studentList;
    }

    @Override
    public Student getById(String id) {
        studentList = getAll();
        try {
            for (Student student : studentList) {
                if (student.getId().equals(id)) {
                    return student;
                }
            }
        } catch (NullPointerException nullPointerException){

        }
        return null;
    }

    @Override
    public void addStudent(String studentStr) {
        List<String> stringList = new ArrayList<>();
        stringList.add(studentStr);
        File.writeToFile(stringList, STUDENT_PATH, true);
    }

    @Override
    public void remove(Student student) {
        studentList = getAll();
        for (Student s : studentList) {
            if (s.equals(student)) {
                studentList.remove(s);
                break;
            }
        }
        List<String> list = new ArrayList<>();
        for (Student s : studentList) {
            list.add(s.getId() + "," + s.getName() + "," + s.getGender() + "," + s.getClasses() + "," + s.getScore());
        }
        File.writeToFile(list, STUDENT_PATH, false);
    }

    @Override
    public List<Student> getListByName(String name) {
        studentList = getAll();
        List<Student> students = new ArrayList<>();
        for (Student student : studentList) {
            if (student.getName().toLowerCase().contains(name.toLowerCase())) {
                students.add(student);
            }
        }
        if (students.size() == 0) {
            return null;
        }
        return students;
    }

    @Override
    public void editStudent(Student student, String name, String gender, String classes, float score) {
        studentList = getAll();
        for (Student s:studentList) {
            if(s.equals(student)){
                s.setName(name);
                s.setGender(gender);
                s.setClasses(classes);
                s.setScore(score);
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Student s : studentList) {
            stringList.add(s.getId()+","+s.getName()+","+s.getGender()+","+s.getClasses()+","+s.getScore());
        }
        File.writeToFile(stringList,STUDENT_PATH,false);
    }
}
