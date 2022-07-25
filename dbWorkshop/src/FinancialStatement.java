import java.time.LocalDate;

public class FinancialStatement {

    private int id;
    private Customer customer;
    private LocalDate date;
    private double amount;

    public FinancialStatement() {
    }

    public FinancialStatement(int id, Customer customer, LocalDate date, double amount) {
        this.id = id;
        this.customer = customer;
        this.date = date;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
