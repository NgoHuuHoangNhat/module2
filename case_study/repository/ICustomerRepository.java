package case_study.repository;

import case_study.model.impl_person.impl.Customer;

import java.util.List;

public interface ICustomerRepository extends IRepository<Customer> {
    void edit(Customer t,String obj);

    void remove(Customer obj);

    List<Customer> getByName(String name);
}
