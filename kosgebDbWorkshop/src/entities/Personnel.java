package entities;

public class Personnel extends User{
    private String firstName;
    private String lastName;
    private String officeId;
    private String registrationNumber;

    public Personnel() {
    }

    public Personnel(String firstName, String lastName, String officeId, String registrationNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.officeId = officeId;
        this.registrationNumber = registrationNumber;
    }

    public Personnel(int id, String userName, String password, String firstName, String lastName, String officeId, String registrationNumber) {
        super(id, userName, password);
        this.firstName = firstName;
        this.lastName = lastName;
        this.officeId = officeId;
        this.registrationNumber = registrationNumber;
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

    public String getOfficeId() {
        return officeId;
    }

    public void setOfficeId(String officeId) {
        this.officeId = officeId;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}
