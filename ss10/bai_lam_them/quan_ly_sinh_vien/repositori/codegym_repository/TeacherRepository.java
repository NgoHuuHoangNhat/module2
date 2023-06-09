package ss10.bai_lam_them.quan_ly_sinh_vien.repositori.codegym_repository;


import ss10.bai_lam_them.quan_ly_sinh_vien.common.FileCSV;
import ss10.bai_lam_them.quan_ly_sinh_vien.model.codegym_person.CodegymTeacher;
import ss10.bai_lam_them.quan_ly_sinh_vien.repositori.ICodegymRepository;

import java.util.ArrayList;
import java.util.List;

public class TeacherRepository implements ICodegymRepository {
    private static List<CodegymTeacher> teachersList = new ArrayList<>();
    private static FileCSV fileCSV = new FileCSV();
    private static final String TEACHER_LIST_PATH = "ss10\\bai_lam_them\\quan_ly_sinh_vien\\common\\teacher_list.csv";

    static {
        teachersList.add(new CodegymTeacher("T-01", "Chánh", true, "Module 3"));
        teachersList.add(new CodegymTeacher("T-02", "Hải", true, "Module 2"));
    }


    @Override
    public void add(Object obj) {
        teachersList = fileCSV.readFileFromFileCSV(TEACHER_LIST_PATH);
        teachersList.add((CodegymTeacher) obj);
        fileCSV.writeToFileCSV(teachersList, TEACHER_LIST_PATH);
    }

    @Override
    public List getAll() {
        teachersList = fileCSV.readFileFromFileCSV(TEACHER_LIST_PATH);
        return teachersList;
    }

    @Override
    public Object getById(String checkId) {
        teachersList = fileCSV.readFileFromFileCSV(TEACHER_LIST_PATH);
        for (CodegymTeacher teacher : teachersList) {
            if (teacher.getId().equals(checkId)) {
                return teacher;
            }
        }
        return null;
    }

    @Override
    public void remove(Object obj) {
        teachersList = fileCSV.readFileFromFileCSV(TEACHER_LIST_PATH);
        teachersList.remove(obj);
        fileCSV.writeToFileCSV(teachersList, TEACHER_LIST_PATH);
    }
}
