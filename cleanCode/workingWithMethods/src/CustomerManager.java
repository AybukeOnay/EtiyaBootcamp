public class CustomerManager {

    //Metot içerisinde birden çok parametre vermek yerine nesneyi göndermek daha sağlıklıdır.
    public void add(Customer customer) throws Exception {
        //technical debt --> teknik borçlanma kodu ilerde düzelticez
        validateFirstNameIfEmpty(customer);
        validateLastNameIfEmpty(customer);
        validateNationalIdentityIfEmpty(customer);

        CustomerDal customerDal = new CustomerDal();
        checkCustomerExist(customer);
        customerDal.add(customer);
    }

    public void addByOtherBusiness(Customer customer) throws Exception {
        validateFirstNameIfEmpty(customer);
        validateLastNameIfEmpty(customer);
        validateNationalIdentityIfEmpty(customer);
        validateFirstNameLength(customer);

        CustomerDal customerDal = new CustomerDal();
        checkCustomerExist(customer);
        customerDal.add(customer);

    }

    //Metot içerisinde çok fazla parametre gönderimine örnek kötü bir kod
    public void add2(int id,String firstName,String lastName,String nationalIdentity){
        System.out.println("Eklendi");
    }

    private void validateFirstNameIfEmpty(Customer customer) throws Exception {
          if ((customer.getFirstName().trim().isEmpty())){
                throw new Exception("First name cannot be empty");
            }
    }

    private void validateLastNameIfEmpty(Customer customer) throws Exception {
        if (((customer.getLastName().trim().isEmpty()))){
            throw new Exception("Last name cannot be empty");
        }
    }

    private void validateNationalIdentityIfEmpty(Customer customer) throws Exception {
        if ((customer.getNationalIdentity().trim().isEmpty())){
            throw new Exception("National idendtity cannot be empty");
        }
    }
    private void validateFirstNameLength(Customer customer) throws Exception {
        if ((customer.getFirstName().length() <= 2)){
            throw new Exception("First name must be at least two characters");
        }
    }
    private void checkCustomerExist(Customer customer){
        CustomerDal customerDal = new CustomerDal();
        if (customerDal.customerExist(customer)){
            System.out.println("Customer is already exist");
        }
    }
}
