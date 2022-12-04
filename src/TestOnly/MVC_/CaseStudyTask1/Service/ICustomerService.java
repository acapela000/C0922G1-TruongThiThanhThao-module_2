package TestOnly.MVC_.CaseStudyTask1.Service;

import TestOnly.MVC_.CaseStudyTask1.Model.Customer;

import java.util.List;

public interface ICustomerService extends IService {
    @Override
    void add();

    void edit(String code, Customer customer);

    @Override
    void edit();

    void add(Customer customer);

    @Override
    List<Customer> display();

    @Override
    void delete();

    @Override
    void search();

    void manageFeedback();
}
