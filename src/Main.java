import business.abstracts.CustomerService;
import business.concretes.CustomerManager;
import dataAccess.concretes.NHCustomerDao;
import entities.Customer;

public class Main {

    public static void main(String[] args) {
        CustomerService customerService = new CustomerManager(new NHCustomerDao());

        Customer customer = new Customer(1, "nissan0159", "123456789", "furkan@gmail.com", "furkan", "artar", "12345678910");
        customerService.add(customer);
    }
}
