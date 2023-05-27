package ss10.bai_lam_them.quan_ly_sinh_vien.model;

import java.util.Objects;

public abstract class CodegymPerson {
    private String id;
    private String name;
    private boolean gender;


    public CodegymPerson(String id, String name, boolean gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "id: " + id + '\'' +
                ", tên: '" + name + '\'' +
                ", giới tính: " + (gender ? "Nam" : "Nữ");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CodegymPerson that = (CodegymPerson) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public String getInfoToFileCSV() {
        return this.id + "," + this.name + "," + (this.gender ? "Nam" : "Nữ");
    }
}
