import java.time.LocalDate;

public class CommercialActivity {
    private int id;
    private IndividualCustomer individualCustomer;
    private LocalDate startedDate;

    public CommercialActivity() {
    }

    public CommercialActivity(int id, IndividualCustomer individualCustomer, LocalDate startedDate) {
        this.id = id;
        this.individualCustomer = individualCustomer;
        this.startedDate = startedDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public IndividualCustomer getIndividualCustomer() {
        return individualCustomer;
    }

    public void setIndividualCustomer(IndividualCustomer individualCustomer) {
        this.individualCustomer = individualCustomer;
    }

    public LocalDate getStartedDate() {
        return startedDate;
    }

    public void setStartedDate(LocalDate startedDate) {
        this.startedDate = startedDate;
    }
}
