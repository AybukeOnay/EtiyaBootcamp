public class CustomerManager {
    private CustomerDal customerDal;

    public CustomerManager(CustomerDal customerDal) {
        this.customerDal = customerDal;
    }

    public void add(Customer customer){
        validateFirstNameEmpty(customer);
        validateLastNameEmpty(customer);
        validateNationalIdentityIfEmpty(customer);
        checkCustomerExist(customer);
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
    private void checkCustomerExist(Customer customer){
        if (customerDal.customerExist(customer)){
            System.out.println("Customer is already exist");
        }
    }
}
