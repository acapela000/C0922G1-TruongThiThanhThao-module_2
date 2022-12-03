package TestOnly.MVC_.CaseStudyTask1.Service;

import TestOnly.MVC_.CaseStudyTask1.Model.Employee;

import java.util.List;

public interface IService {
    void add();
    void edit();
    List<Employee> display();
    void delete();
    void search();
}
