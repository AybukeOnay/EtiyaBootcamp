public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager =new CustomerManager(new NhCustomerDal());
        customerManager.add(new Customer(1,06,"Aybuke","Onay","0123456790"));
    }
}
