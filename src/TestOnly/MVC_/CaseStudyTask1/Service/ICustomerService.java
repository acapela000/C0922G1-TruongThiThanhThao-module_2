package TestOnly.MVC_.CaseStudyTask1.Service;

import TestOnly.MVC_.CaseStudyTask1.Model.Employee;

import java.util.List;

public interface ICustomerService extends IService {
    @Override
    void add();

    @Override
    void edit();

    @Override
    List<Employee> display();

    @Override
    void delete();

    @Override
    void search();

    void manageFeedback();
}
