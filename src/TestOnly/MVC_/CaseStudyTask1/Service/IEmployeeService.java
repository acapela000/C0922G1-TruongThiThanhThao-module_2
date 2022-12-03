package TestOnly.MVC_.CaseStudyTask1.Service;

import TestOnly.MVC_.CaseStudyTask1.Model.Employee;

import java.util.List;

import static TestOnly.MVC_.CaseStudyTask1.Service.EmployeeServiceImpl.employeeList;

public interface IEmployeeService extends IService {
    void add(Employee employee);

    @Override
    void add();

    @Override
    void edit();

    void edit(String code, Employee employee);

    @Override
    default List<Employee> display() {
        return employeeList;
    };

    @Override
    void delete();

    @Override
    void search();

    void manageContractDeadline();
}
