package case_study.repository;

import case_study.model.impl_person.impl.Employee;

import java.util.List;

public interface IEmployeeRepository extends IRepository<Employee> {
    void edit(Employee t,String obj);

    void remove(Employee obj);

    List<Employee> getByName(String name);
}
