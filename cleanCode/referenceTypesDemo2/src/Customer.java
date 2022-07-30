public class Customer extends Person{
    private String creditCardNo;

    public Customer() {
    }

    public Customer(int id, String firstName, String lastName, String creditCardNo) {
        super(id, firstName, lastName);
        this.creditCardNo = creditCardNo;
    }

    public String getCreditCardNo() {
        return creditCardNo;
    }

    public void setCreditCardNo(String creditCardNo) {
        this.creditCardNo = creditCardNo;
    }
}
