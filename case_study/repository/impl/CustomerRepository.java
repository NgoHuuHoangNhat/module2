package case_study.repository.impl;

import case_study.common.FileData;
import case_study.model.impl_person.impl.Customer;
import case_study.repository.ICustomerRepository;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static List<Customer> customerList = new ArrayList<>();
    private static final String CUSTOMER_PATH = "case_study/file/customer.csv";

    @Override
    public Customer getById(String checkId) {
        customerList = getAll();

        try {
            for (Customer customer : customerList) {
                if (customer.getId().equals(checkId)) {
                    return customer;
                }
            }
        } catch (NullPointerException nullPointerException) {

        }
        return null;
    }

    @Override
    public List getAll() {
        List<String> stringList = FileData.readFromFile(CUSTOMER_PATH);
        customerList.clear();

        String[] info;
        try {
            for (String str : stringList) {
                info = str.split(",");
                customerList.add(new Customer(info[0], info[1], info[2], info[3], info[4], info[5], info[6], info[7], info[8]));
            }
        }catch (NullPointerException nullPointerException){

        }
        return customerList;
    }

    @Override
    public void add(String customer) {
        List<String> stringList = new ArrayList<>();
        stringList.add(customer);
        FileData.writeToFile(stringList, CUSTOMER_PATH, true);
    }

    //    String customer = checkID + "," + name + "," + dateOFBirth + "," + gender + "," +
//            passPort + "," + numberPhone + "," + email + "," + typeOfGuest + "," + address;
    @Override
    public void edit(Customer customer, String customerStr) {
        customerList = getAll();
        String[] arr = customerStr.split(",");
        for (Customer element : customerList) {
            if (element.equals(customer)) {
                element.setName(arr[1]);
                element.setDateOfBirth(arr[2]);
                element.setGender(arr[3]);
                element.setPassport(arr[4]);
                element.setNumberPhone(arr[5]);
                element.setEmail(arr[6]);
                element.setTypeOfGuest(arr[7]);
                element.setAddress(arr[8]);
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Customer e : customerList) {
            stringList.add(e.getId() + "," + e.getName() + "," + e.getDateOfBirth() + "," + e.getGender() + "," +
                    e.getPassport() + "," + e.getNumberPhone() + "," + e.getEmail() + "," + e.getTypeOfGuest() + "," + e.getAddress());
        }
        FileData.writeToFile(stringList, CUSTOMER_PATH, false);
    }

    @Override
    public void remove(Customer customer) {
        customerList = getAll();

        for (Customer element : customerList) {
            if (element.equals(customer)) {
                customerList.remove(customer);
                break;
            }
        }

        List<String> stringList = new ArrayList<>();
        for (Customer e : customerList) {
            stringList.add(e.getId() + "," + e.getName() + "," + e.getDateOfBirth() + "," + e.getGender() + "," +
                    e.getPassport() + "," + e.getNumberPhone() + "," + e.getEmail() + "," + e.getTypeOfGuest() + "," + e.getAddress());
        }
        FileData.writeToFile(stringList, CUSTOMER_PATH, false);
    }

    @Override
    public List<Customer> getByName(String name) {
        List<Customer> customers = new ArrayList<>();
        customerList = getAll();
        for (Customer customer : customerList) {
            if (customer.getName().toLowerCase().contains(name.toLowerCase())) {
                customers.add(customer);
            }
        }
        if (customers.size() == 0) {
            return null;
        }
        return customers;
    }


}
