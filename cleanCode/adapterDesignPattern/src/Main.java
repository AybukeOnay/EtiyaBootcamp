public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager=new CustomerManager(new NhCustomerDal(),new KpsServiceAdapter());
        customerManager.add(new Customer(1,"Aybuke","Onay","01234567890",1997,06));
    }
}
