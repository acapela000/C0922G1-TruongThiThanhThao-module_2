package TestOnly.MVC_.CaseStudyTask1.Service;

import TestOnly.MVC_.CaseStudyTask1.Model.Customer;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class CustomerServiceImpl implements ICustomerService {
    static List<Customer> customerList = new LinkedList<>();

    @Override
    public void add(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public void add() {

    }

    @Override
    public void edit(String code,Customer customer) {
        for (int i = 0; i < customerList.size(); i++) {
           if (Objects.equals(customerList.get(i).getPersonalCode(), code)) {
               customerList.get(i).setPersonalCode(Integer.parseInt(code));
           }
        }
    }

    @Override
    public void edit() {

    }

    @Override
    public List<Customer> display() {

        return customerList;
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
