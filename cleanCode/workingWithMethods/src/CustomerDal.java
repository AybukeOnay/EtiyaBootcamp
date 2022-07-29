public class CustomerDal {
    public void add(Customer customer){
        System.out.println(customer.getFirstName() + " "+ customer.getLastName() +" : Eklendi");
    }

    public boolean customerExist(Customer customer){
        return true;
    }

}
