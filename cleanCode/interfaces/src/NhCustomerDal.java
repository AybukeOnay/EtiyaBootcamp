public class NhCustomerDal implements CustomerDal{

    @Override
    public void add(Customer customer) {
        System.out.println(customer.getFirstName() + ": kullanicisi Nhibernate kullanilarak veritabanına eklendi");
    }

    @Override
    public boolean customerExist(Customer customer) {
        return true;
    }
}
