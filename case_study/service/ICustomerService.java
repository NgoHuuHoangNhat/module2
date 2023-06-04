package case_study.service;

import case_study.model.impl_person.impl.Customer;

public interface ICustomerService extends IService<Customer> {
    void edit();

    void remove();

    void search();
    public String enterInfo(String checkID);
}
