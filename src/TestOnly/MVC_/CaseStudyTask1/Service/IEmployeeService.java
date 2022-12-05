package TestOnly.MVC_.CaseStudyTask1.Service;

import TestOnly.MVC_.CaseStudyTask1.Model.Employee;

import java.util.Collection;

import static TestOnly.MVC_.CaseStudyTask1.Service.EmployeeServiceImpl.employeeList;

public interface IEmployeeService extends IService<Employee> {

    void manageContractDeadline();
}
