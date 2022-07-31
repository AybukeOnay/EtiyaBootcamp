import business.concretes.CustomerManager;
import core.utilities.adapters.KpsServiceAdapter;
import dataAccess.concretes.NhCustomerDal;
import entities.Customer;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager=new CustomerManager(new NhCustomerDal(),new KpsServiceAdapter());
        customerManager.add(new Customer(1,"Aybuke","Onay","01234567890",1997,06));
    }
}
