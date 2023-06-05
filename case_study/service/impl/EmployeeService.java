package case_study.service.impl;

import case_study.common.InfoInputPerson;
import case_study.common.Regex;
import case_study.model.impl_person.impl.Employee;
import case_study.repository.IEmployeeRepository;
import case_study.repository.impl.EmployeeRepository;
import case_study.service.IEmployeeService;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {

    private static Scanner scanner = new Scanner(System.in);
    private static IEmployeeRepository employeeRepository = new EmployeeRepository();

    @Override
    public void display() {
        List<Employee> employeeList = employeeRepository.getAll();

        for (Employee e : employeeList) {
            System.out.println(e.toString());
        }
    }

    @Override
    public void create() {

        while (true) {
            String checkId = "";
            System.out.print("Enter employee id: ");
            checkId = scanner.nextLine();

            if (!Regex.checkIdEmployee(checkId)) {
                System.out.println("Id code is wrong format, please re-input!");
            } else {
                Employee employee = employeeRepository.getById(checkId);

                if (employee != null) {
                    System.out.println("This employee is already on the list, please re-input!");
                } else {
                    String employeeStr = enterInfo(checkId);
                    employeeRepository.add(employeeStr);
                    System.out.println("This employee has been added to the list!");
                    break;
                }

            }
        }
    }

    @Override
    public void edit() {
        while (true) {
            System.out.print("Enter employee id: ");
            String checkID = scanner.nextLine();
            if (!Regex.checkIdEmployee(checkID)) {
                System.out.println("Id code is wrong format, please re-input!");
            } else {
                Employee employee = employeeRepository.getById(checkID);
                if (employee == null) {
                    System.out.println("This employee is not already in the list, please re-input!");
                } else {
                    System.out.print("Do you really want to change?\n" +
                            "Enter yes to agree: ");
                    String option = scanner.nextLine();
                    if (!option.toLowerCase().equals("yes")) {
                        break;
                    } else {
                        String employeeStr = enterInfo(checkID);
                        employeeRepository.edit(employee, employeeStr);
                        System.out.println("This employee has been edited!");
                        break;
                    }

                }
            }
        }
    }

    @Override
    public void remove() {
        while (true) {
            System.out.print("Enter employee id: ");
            String checkId = scanner.nextLine();
            if (!Regex.checkIdEmployee(checkId)) {
                System.out.println("Id input is wrong format, please re-input");
            } else {
                Employee employee = employeeRepository.getById(checkId);
                if (employee == null) {
                    System.out.println("This employee is not already in the list, please re-input!");
                } else {
                    System.out.print("Do you really want to change?\n" +
                            "Enter yes to agree: ");
                    String option = scanner.nextLine();
                    if (!option.toLowerCase().equals("yes")) {
                        break;
                    } else {
                        employeeRepository.remove(employee);
                        System.out.println("You deleted the employee!");
                        break;
                    }
                }
            }
        }
    }

    @Override
    public void search() {
        while (true) {
            System.out.print("Enter employee name: ");
            String checkName = scanner.nextLine();

            List<Employee> employeeList = employeeRepository.getByName(checkName);
            if (employeeList == null) {
                System.out.println("This name does not exist, please re-input!");
            } else {
                for (Employee e : employeeList) {
                    System.out.println(e);
                }
                break;
            }
        }
    }


    @Override
    public String enterInfo(String checkID) {
        String name = InfoInputPerson.enterName();

        String dateOFBirth = InfoInputPerson.enterDateOfBirth();

        String gender = InfoInputPerson.enterGender();

        String passPort = InfoInputPerson.enterPassPort();

        String numberPhone = InfoInputPerson.enterNumberPhone();

        String email = InfoInputPerson.enterEmail();

        String level = InfoInputPerson.enterLevel();

        String position = InfoInputPerson.enterPosition();

        long wage = InfoInputPerson.enterWage();

        String employee = checkID + "," + name + "," + dateOFBirth + "," + gender + "," +
                passPort + "," + numberPhone + "," + email + "," + level + "," + position + "," + wage;
        return employee;
    }
}
