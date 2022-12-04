package TestOnly.MVC_.CaseStudyTask1.Service;

import TestOnly.MVC_.CaseStudyTask1.Model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EmployeeServiceImpl implements IEmployeeService {
    static List<Employee> employeeList = new ArrayList<>();

    @Override
    public void add(Employee employee) {
        employeeList.add(employee);
    }

    @Override
    public void add() {

    }

    @Override
    public void edit(String code, Employee employee) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (Objects.equals(employeeList.get(i).getPersonalCode(), code)) {
                employeeList.get(i).setPersonalCode(Integer.parseInt(code));
            }
        }
    }

    @Override
    public void edit() {

    }

    @Override
    public List<Employee> display() {

        return employeeList;
    }

    @Override
    public void delete() {

    }

    @Override
    public void search() {

    }
    @Override
    public void manageContractDeadline() {

    }

}
