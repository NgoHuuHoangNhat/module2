package case_study.service.impl;

import case_study.common.FileData;
import case_study.common.InfoInput;
import case_study.common.ChoiceException;
import case_study.common.Regex;
import case_study.model.impl_person.impl.Customer;
import case_study.repository.ICustomerRepository;
import case_study.repository.impl.CustomerRepository;
import case_study.service.ICustomerService;

import java.io.File;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    private static Scanner scanner = new Scanner(System.in);
    private static ICustomerRepository customerRepository = new CustomerRepository();

    @Override
    public void display() {
        List<Customer> customerList = customerRepository.getAll();
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    @Override
    public void create() {
        while (true) {
            System.out.print("Enter customer id: ");
            String checkId = scanner.nextLine();
            if (!Regex.checkIdCustomer(checkId)) {
                System.out.println("Id code is wrong format, please re-input!");
            } else {
                Customer customer = customerRepository.getById(checkId);
                if (customer != null) {
                    System.out.println("This customer is already in the list, please re-input!");
                } else {
                    String customerStr = enterInfo(checkId);
                    customerRepository.add(customerStr);
                    System.out.println("This customer has been added to the list!");
                    break;
                }
            }

        }

    }

    @Override
    public void edit() {
        while (true) {
            System.out.print("Enter customer id: ");
            String checkId = scanner.nextLine();
            if (!Regex.checkIdCustomer(checkId)) {
                System.out.println("Id code is wrong format, please re-input!");
            } else {
                Customer customer = customerRepository.getById(checkId);
                if (customer == null) {
                    System.out.println("Id code is not ready in list, please re-input!");
                } else {
                    System.out.print("Do you relly want edit this customer?\n" +
                            "Enter yes to agree: ");
                    String option = scanner.nextLine();
                    if (option.toLowerCase().equals("yes")) {
                        String customerStr = enterInfo(checkId);
                        customerRepository.edit(customer, customerStr);
                        System.out.println("This customer has been edited!");
                        break;
                    }
                }
            }
        }
    }

    @Override
    public void remove() {
        while (true) {
            System.out.print("Enter customer id: ");
            String checkId = scanner.nextLine();
            if (!Regex.checkIdCustomer(checkId)) {
                System.out.println("Id is wrong format, please re-input!");
            } else {
                Customer customer = customerRepository.getById(checkId);
                if (customer == null) {
                    System.out.println("This id is not already in the list, please re-input!");
                } else {
                    System.out.print("Do you want remove this customer?\n" +
                            "Enter yes to agree: ");
                    String option = scanner.nextLine();
                    if (option.toLowerCase().equals("yes")) {
                        customerRepository.remove(customer);
                        System.out.println("This deleted the customer!");
                        break;
                    }
                }
            }
        }
    }

    @Override
    public void search() {
        while (true) {
            System.out.print("Enter customer name: ");
            String name = scanner.nextLine();

            List<Customer> customerList = customerRepository.getByName(name);
            if (customerList == null) {
                System.out.println("This name does not exist, please re-input!");
            } else {
                for (Customer customer : customerList) {
                    System.out.println(customer);
                }
                break;
            }
        }
    }

    @Override
    public String enterInfo(String checkID) {
        String name = InfoInput.enterName();

        String dateOFBirth = InfoInput.enterDateOfBirth();

        String gender = InfoInput.enterGender();

        String passPort = InfoInput.enterPassPort();

        String numberPhone = InfoInput.enterNumberPhone();

        String email = InfoInput.enterEmail();

        String typeOfGuest = InfoInput.enterTypeOfGuest();

        String address = InfoInput.enterAddress();

        String customer = checkID + "," + name + "," + dateOFBirth + "," + gender + "," +
                passPort + "," + numberPhone + "," + email + "," + typeOfGuest + "," + address;

        return customer;
    }
}
