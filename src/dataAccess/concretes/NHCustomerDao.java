package dataAccess.concretes;

import dataAccess.abstracts.CustomerDao;
import entities.Customer;

public class NHCustomerDao implements CustomerDao {
    @Override
    public void Add(Customer customer) {
        System.out.println(customer.getFirstName() + " adlı kullanıcı sisteme eklendi.");
    }
}
