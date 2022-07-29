package entities;

public class Entrepreneur extends Applicant{
    private String firstName;
    private String lastName;
    private String nationalIdentity;

    public Entrepreneur(String firstName, String lastName, String nationalIdentity) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalIdentity = nationalIdentity;
    }

    public Entrepreneur(int id, String userName, String password, String firstName, String lastName, String nationalIdentity) {
        super(id, userName, password);
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalIdentity = nationalIdentity;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalIdentity() {
        return nationalIdentity;
    }

    public void setNationalIdentity(String nationalIdentity) {
        this.nationalIdentity = nationalIdentity;
    }
}
