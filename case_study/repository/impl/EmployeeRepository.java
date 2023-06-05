package case_study.repository.impl;

import case_study.common.FileData;
import case_study.model.impl_person.impl.Employee;
import case_study.repository.IEmployeeRepository;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private static List<Employee> employeeList = new ArrayList<>();
    private static final String EMPLOYEE_PATH = "case_study\\file\\employee.csv";

    //    static {
//        employeeList.add(new Employee("E-001","Nhat","31/03/1996","Nam","123456",
//                "0123456789", "hoangnhat3103@gmail.com","2",30000000));
//
//        employeeList.add(new Employee("E-002","Tan","28/02/2002","Nam","123457",
//                "0123456689", "tan@gmail.com","1",20000000));
//
//    }
    @Override
    public List<Employee> getAll() {
        List<String> list = FileData.readFromFile(EMPLOYEE_PATH);

        employeeList.clear();
        String[] info;
        try {
            for (String str : list) {
                info = str.split(",");
                employeeList.add(new Employee(info[0], info[1], info[2], info[3],
                        info[4], info[5], info[6], info[7], info[8], Long.parseLong(info[9])));
            }
        }catch (NullPointerException nullPointerException){

        }
        return employeeList;
    }

    @Override
    public void add(String newEmployeeStr) {
        List<String> stringList = new ArrayList<>();
        stringList.add(newEmployeeStr);

        FileData.writeToFile(stringList, EMPLOYEE_PATH, true);
    }

    //    String id, String name, String dateOfBirth, String gender,
//    String passport, String numberPhone, String email, String level,String position, long wage
    @Override
    public void edit(Employee employee, String employeeStr) {
        List<String> stringList = new ArrayList<>();
        employeeList.clear();
        employeeList = getAll();
        String[] arr = employeeStr.split(",");

        for (Employee e : employeeList) {
            if (e.equals(employee)) {
                e.setName(arr[1]);
                e.setDateOfBirth(arr[2]);
                e.setGender(arr[3]);
                e.setPassport(arr[4]);
                e.setNumberPhone(arr[5]);
                e.setEmail(arr[6]);
                e.setLevel(arr[7]);
                e.setPosition(arr[8]);
                e.setWage(Long.parseLong(arr[9]));
            }
        }

        for (Employee e : employeeList) {
            stringList.add(e.getId() + "," + e.getName() + "," + e.getDateOfBirth() + "," + e.getGender() + "," + e.getPassport() +
                    "," + e.getNumberPhone() + "," + e.getEmail() + "," + e.getLevel() + "," + e.getPosition() + "," + e.getWage());
        }
        FileData.writeToFile(stringList, EMPLOYEE_PATH, false);
    }

    @Override
    public void remove(Employee employee) {
        List<String> stringList = new ArrayList<>();
        employeeList.clear();
        employeeList = getAll();
        for (Employee e : employeeList) {
            if (e.equals(employee)) {
                employeeList.remove(e);
                break;
            }
        }
        for (Employee e : employeeList) {
            stringList.add(e.getId() + "," + e.getName() + "," + e.getDateOfBirth() + "," + e.getGender() + "," + e.getPassport() +
                    "," + e.getNumberPhone() + "," + e.getEmail() + "," + e.getLevel() + "," + e.getPosition() + "," + e.getWage());
        }
        FileData.writeToFile(stringList, EMPLOYEE_PATH, false);

    }

    @Override
    public List<Employee> getByName(String name) {
        List<Employee> employees = new ArrayList<>();
        employeeList = getAll();
        for (Employee e : employeeList) {
            if (e.getName().toLowerCase().contains(name.toLowerCase())) {
                employees.add(e);
            }
        }
        if (employees.size() != 0) {
            return employees;
        }
        return null;
    }

    @Override
    public Employee getById(String checkId) {
        employeeList = getAll();

        try {
            for (Employee employee : employeeList) {
                if (employee.getId().equals(checkId)) {
                    return employee;
                }
            }
        } catch (NullPointerException nullPointerException) {

        }
        return null;
    }
}
