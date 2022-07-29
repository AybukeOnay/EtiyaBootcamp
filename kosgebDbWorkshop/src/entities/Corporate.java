package entities;

public class Corporate extends Applicant{
    private String taxNumber;
    private String title;

    public Corporate(String taxNumber, String title) {
        this.taxNumber = taxNumber;
        this.title = title;
    }

    public Corporate(int id, String userName, String password, String taxNumber, String title) {
        super(id, userName, password);
        this.taxNumber = taxNumber;
        this.title = title;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
