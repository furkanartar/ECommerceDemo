package business.concretes;

import business.abstracts.CustomerService;
import dataAccess.abstracts.CustomerDao;
import entities.Customer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomerManager implements CustomerService {
    CustomerDao customerDao;

    public CustomerManager(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public void add(Customer customer) {
        final String EMAIL_PATTERN =
                "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                        + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";

        final Pattern pattern = Pattern.compile(EMAIL_PATTERN);


        if(!(customer.getFirstName().isEmpty() && customer.getLastName().isEmpty() &&
        customer.getEmail().isEmpty() && customer.getPassword().isEmpty()))
        {
            if(customer.getPassword().length() >= 8 && isValid(customer.getEmail())
                    && customer.getFirstName().length() >= 2 && customer.getLastName().length() >= 2)
            {
               customerDao.Add(customer);
            }
            else
                System.out.println("Parola en az 8 karakter, email için formata dikkat edin ayrıca isim ve soy isim en az 2 karakter olmalı!");
        }
        else
            System.out.println("Ad, soyad, email ve parolanın girilmesi zorunludur.");
    }

    public static boolean isValid(final String email) {
        final String emailPattern =
                "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                        + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";

        final Pattern pattern = Pattern.compile(emailPattern);

        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}