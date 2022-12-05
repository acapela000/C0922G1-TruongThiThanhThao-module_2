package TestOnly.MVC_.CaseStudyTask1.Service;

import TestOnly.MVC_.CaseStudyTask1.Model.Customer;
import TestOnly.MVC_.CaseStudyTask1.Model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements IEmployeeService {
    static List<Employee> employeeList = new ArrayList<>();

    @Override
    public List<Employee> display() {
        return employeeList;
    }

    @Override
    public void add(Employee employee) {
        employeeList.add(employee);
    }

    @Override
    public void delete(Employee employee) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getPersonalCode().equals(employee.getPersonalCode())) {
                employeeList.remove(employee.getPersonalCode());
            }
        }
    }

    public List<Employee> edit(Employee employee) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getPersonalCode().equals(employee.getPersonalCode())) {
                employeeList.get(i).setWorkHour(employee.getWorkHour());
                employeeList.get(i).setSalary(employee.getSalary());
                employeeList.get(i).setTypeOfContract(employee.getTypeOfContract());
                employeeList.get(i).setWorkAttitude(employee.getWorkAttitude());
                employeeList.get(i).setTypeOfDegree(employee.getTypeOfDegree());
                employeeList.get(i).setExtraPay(employee.isExtraPay());
                employeeList.get(i).setMarriageStatus(employee.isMarriageStatus());
            }
        }
        return employeeList;
    }

    @Override
    public Employee search(Employee employee) {
        for (Employee result : employeeList) {
            if (result.getPersonalCode().equals(employee.getPersonalCode())) {
                return result;
            }
        }
        return null;
    }

    @Override
    public void manageContractDeadline() {

    }

}
