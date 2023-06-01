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
        for (String str : list) {
            info = str.split(",");
            employeeList.add(new Employee(info[0], info[1], info[2], info[3],
                    info[4], info[5], info[6], info[7], info[8], Long.parseLong(info[9])));
        }
        return employeeList;
    }

    @Override
    public void add(String newEmployeeStr) {
        List<String> stringList = new ArrayList<>();
        stringList.add(newEmployeeStr);

        FileData.writeToFile(stringList, EMPLOYEE_PATH, true);
    }

    @Override
    public Employee getEmployeeById(String checkId) {
        employeeList = getAll();

        for (Employee employee : employeeList) {
            if (employee.getId().equals(checkId)) {
                return employee;
            }
        }
        return null;
    }
}
