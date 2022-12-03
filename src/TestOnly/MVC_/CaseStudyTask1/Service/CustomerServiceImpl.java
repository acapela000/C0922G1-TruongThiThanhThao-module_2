package TestOnly.MVC_.CaseStudyTask1.Service;

import TestOnly.MVC_.CaseStudyTask1.Model.Employee;

import java.util.List;

import static TestOnly.MVC_.CaseStudyTask1.Service.EmployeeServiceImpl.employeeList;

public class CustomerServiceImpl implements ICustomerService {

    @Override
    public void add() {

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
    public void manageFeedback() {

    }
}
