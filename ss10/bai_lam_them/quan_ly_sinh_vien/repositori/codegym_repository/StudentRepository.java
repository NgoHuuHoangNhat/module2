package ss10.bai_lam_them.quan_ly_sinh_vien.repositori.codegym_repository;

import ss10.bai_lam_them.quan_ly_sinh_vien.common.FileCSV;
import ss10.bai_lam_them.quan_ly_sinh_vien.model.codegym_person.CodegymStudent;
import ss10.bai_lam_them.quan_ly_sinh_vien.repositori.ICodegymRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements ICodegymRepository {
    private static List<CodegymStudent> studentsList = new ArrayList<>();
    private static FileCSV fileCSV = new FileCSV();
    private static String studentListPath = "ss10\\bai_lam_them\\quan_ly_sinh_vien\\common\\student_list.csv";

    static {
        studentsList.add(new CodegymStudent("HV-001", "Nhật", true, "C0323G1", 10));
        studentsList.add(new CodegymStudent("HV-002", "Duy", true, "C0323G1", 9));
    }


    @Override
    public void add(Object obj) {
        studentsList = fileCSV.readFileFromFileCSV(studentListPath);
        studentsList.add((CodegymStudent) obj);
        fileCSV.writeToFileCSV(studentsList, studentListPath);
    }

    @Override
    public List<CodegymStudent> getAll() {
        studentsList = fileCSV.readFileFromFileCSV(studentListPath);
        return studentsList;
    }

    @Override
    public CodegymStudent getById(String checkId) {
        studentsList = fileCSV.readFileFromFileCSV(studentListPath);
        for (CodegymStudent student : studentsList) {
            if (student.getId().equals(checkId)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void remove(Object obj) {
        studentsList = fileCSV.readFileFromFileCSV(studentListPath);
        studentsList.remove(obj);
        fileCSV.writeToFileCSV(studentsList,studentListPath);
    }


}

