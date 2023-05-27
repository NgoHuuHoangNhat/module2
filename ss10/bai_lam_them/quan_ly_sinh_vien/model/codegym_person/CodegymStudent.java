package ss10.bai_lam_them.quan_ly_sinh_vien.model.codegym_person;

import ss10.bai_lam_them.quan_ly_sinh_vien.model.CodegymPerson;

public class CodegymStudent extends CodegymPerson {
    private String classes;
    private float score;


    public CodegymStudent(String id, String name, boolean gender, String classes, float score) {
        super(id, name, gender);
        this.classes = classes;
        this.score = score;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Thông tin học viên: " +
                super.toString() +
                ", lớp: " + classes + '\'' +
                ", điểm: " + score +
                '}';
    }

}
