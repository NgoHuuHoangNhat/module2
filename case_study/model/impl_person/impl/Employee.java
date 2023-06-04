package case_study.model.impl_person.impl;

import case_study.model.impl_person.Person;

public class Employee extends Person {
    private String level;
    private String position;
    private long wage;

    public Employee(String id, String name, String dateOfBirth, String gender,
                    String passport, String numberPhone, String email, String level,String position, long wage) {
        super(id, name, dateOfBirth, gender, passport, numberPhone, email);
        this.position = position;
        this.level = level;
        this.wage = wage;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public long getWage() {
        return wage;
    }

    public void setWage(long wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() +
                ", level= " + level +
                ", position= " + position +
                ", wage= " + wage +
                '}';
    }
}
