public class EfCustomerDal implements CustomerDal{
    @Override
    public void add(Customer customer) {
        System.out.println(customer.getFirstName() + ": kullanicisi entity framework kullanilarak veritabanına eklendi");
    }

    @Override
    public boolean customerExist(Customer customer) {
        return true;
    }
}
