public class OracleCustomerDal implements CustomerDal{

    @Override
    public void add(Customer customer) {
        System.out.println(customer.getFirstName() + ": kullanicisi Oracle kullanilarak veritabanına eklendi");
    }

    @Override
    public boolean customerExist(Customer customer) {
        return false;
    }
}
