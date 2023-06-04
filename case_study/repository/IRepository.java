package case_study.repository;

import case_study.model.impl_person.impl.Employee;

import java.util.List;

public interface IRepository<T> {
    public T getById(String checkId);
    public List<T> getAll();

    void add(String obj);


}
