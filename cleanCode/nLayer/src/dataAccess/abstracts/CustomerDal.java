package dataAccess.abstracts;

import entities.Customer;

public interface CustomerDal {
    void add(Customer customer);
    boolean customerExist(Customer customer);
}
