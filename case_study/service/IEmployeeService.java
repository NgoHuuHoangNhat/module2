package case_study.service;

import case_study.model.impl_person.impl.Employee;

public interface IEmployeeService extends IService<Employee> {
    void edit();

    void remove();

    void search();
    public String enterInfo(String checkID);
}
