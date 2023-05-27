package ss10.bai_lam_them.quan_ly_sinh_vien.model.codegym_person;

import ss10.bai_lam_them.quan_ly_sinh_vien.model.CodegymPerson;

public class CodegymTeacher extends CodegymPerson {
    private String specializing;

    public CodegymTeacher(String id, String name, boolean gender, String specializing) {
        super(id, name, gender);
        this.specializing = specializing;
    }

    public String getSpecializing() {
        return specializing;
    }

    public void setSpecializing(String specializing) {
        this.specializing = specializing;
    }

    @Override
    public String toString() {
        return "Thông tin giảng viên: " +
                super.toString() +
                ", dạy môn: " + specializing;
    }

    @Override
    public String getInfoToFileCSV() {
        return super.getInfoToFileCSV() + "," + this.specializing;
    }
}
