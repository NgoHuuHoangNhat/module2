package ss10.bai_lam_them.quan_ly_sinh_vien.repositori.codegym_repository;

import ss10.bai_lam_them.quan_ly_sinh_vien.model.codegym_person.CodegymStudent;
import ss10.bai_lam_them.quan_ly_sinh_vien.repositori.ICodegymRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements ICodegymRepository {
    private static List<CodegymStudent> studentsList = new ArrayList<>();

    static {
        studentsList.add(new CodegymStudent("HV-001", "Nhật", true, "C0323G1", 10));
        studentsList.add(new CodegymStudent("HV-002", "Duy", true, "C0323G1", 9));
    }


    @Override
    public void add(Object obj) {
        studentsList.add((CodegymStudent) obj);
    }

    @Override
    public List<CodegymStudent> getAll() {
        return studentsList;
    }

    @Override
    public CodegymStudent getById(String checkId) {
        for (CodegymStudent student : studentsList) {
            if(student.getId().equals(checkId)){
                return student;
            }
        }
        return null;
    }

    @Override
    public void remove(Object obj) {
        studentsList.remove(obj);
    }


}

