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


    public List<Customer> edit(Customer customer) {
        for (int i = 0; i < customerList.size(); i++) {
            if (Objects.equals(customerList.get(i).getPersonalCode(), customer.getPersonalCode())) {
                //customerList.get(i).setPersonalCode(customer.getPersonalCode()); id will not change
                customerList.get(i).setPhoneNumber(customer.getPhoneNumber());
                customerList.get(i).setDateOfBirth(customer.getDateOfBirth());
                customerList.get(i).setGender(customer.getGender());
                customerList.get(i).setFirstName(customer.getFirstName());
                customerList.get(i).setLastName(customer.getLastName());
                customerList.get(i).setAddress(customer.getAddress());
                customerList.get(i).setEmail(customer.getEmail());
            }
        }
        return customerList;
    }


        @Override
        public void delete(Customer customer) {
            List<Customer> customerList1 = customerList;
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getPersonalCode().equals(customer.getPersonalCode())) {
                customerList.remove(customer.getPersonalCode());
            }
        }
    }


    @Override
    public List<Customer> display() {
        return customerList;
    }

    @Override
    public Customer search(Customer customer) {
        for (Customer searchCode : customerList) {
            if (searchCode.getPersonalCode().equals(customer.getPersonalCode())) {
                return searchCode;
            }
        }
        return null;
    }

    @Override
    public void manageFeedback() {

    }
}
