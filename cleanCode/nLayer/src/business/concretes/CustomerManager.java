package business.concretes;

import business.abstracts.PersonService;
import core.utilities.adapters.KpsServiceAdapter;
import dataAccess.abstracts.CustomerDal;
import entities.Customer;
import entities.Person;

public class CustomerManager {
    private CustomerDal customerDal;
    private PersonService personService;

    public CustomerManager(CustomerDal customerDal, PersonService personService) {
        this.customerDal = customerDal;
        this.personService = personService;
    }

    public void add(Customer customer){
        validateFirstNameEmpty(customer);
        validateLastNameEmpty(customer);
        validateNationalIdentityIfEmpty(customer);
        checkPersonExist(customer);
        customerDal.add(customer);
    }

    private void validateFirstNameEmpty(Customer customer){
        if ((customer.getFirstName().trim().isEmpty())){
            System.out.println("First name cannot be empty");
        }
    }
    private void validateLastNameEmpty(Customer customer){
        if ((customer.getLastName().trim().isEmpty())){
            System.out.println("Last name cannot be empty");
        }
    }
    private void validateNationalIdentityIfEmpty(Customer customer) {
        if ((customer.getNationalIdentity().trim().isEmpty())){
            System.out.println("National idendtity cannot be empty");
        }
    }
    private void checkPersonExist(Person person){
        if (!personService.checkPerson(person)){
            System.out.println("Kişi bilgileri hatalı");
        }
    }
}
