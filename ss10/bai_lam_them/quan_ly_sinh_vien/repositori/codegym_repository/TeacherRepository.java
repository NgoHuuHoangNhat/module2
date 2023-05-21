package ss10.bai_lam_them.quan_ly_sinh_vien.repositori.codegym_repository;


import ss10.bai_lam_them.quan_ly_sinh_vien.model.codegym_person.CodegymTeacher;
import ss10.bai_lam_them.quan_ly_sinh_vien.repositori.ICodegymRepository;

import java.util.ArrayList;
import java.util.List;

public class TeacherRepository implements ICodegymRepository {
    private static List<CodegymTeacher> teachersList = new ArrayList<>();

    static {
        teachersList.add(new CodegymTeacher("T-01", "Chánh", true, "Module 3"));
        teachersList.add(new CodegymTeacher("T-02", "Hải", true, "Module 2"));
    }


    @Override
    public void add(Object o) {
        teachersList.add((CodegymTeacher) o);
    }

    @Override
    public List getAll() {
        return teachersList;
    }

    @Override
    public Object getById(String checkId) {
        for (CodegymTeacher teacher : teachersList) {
            if(teacher.getId().equals(checkId) ){
                return teacher;
            }
        }
        return null;
    }

    @Override
    public void remove(Object obj) {
        teachersList.remove(obj);
    }
}
