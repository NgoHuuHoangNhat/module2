package case_study.model.impl_person.impl;

import case_study.model.impl_person.Person;

public class Employee extends Person {
    private String level;
    private float wage;

    public Employee(String id, String name, String dateOfBirth, String gender,
                    String passport, String numberPhone, String email, String level, float wage) {
        super(id, name, dateOfBirth, gender, passport, numberPhone, email);
        this.level = level;
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() +
                "level= " + level +
                ", wage= " + wage +
                '}';
    }
}
