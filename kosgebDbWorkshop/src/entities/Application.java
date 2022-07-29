package entities;

public class Application {
    private int id;
    private ApplicationStatus applicationStatus;
    private Applicant applicant;
    private Credit credit;

    public Application() {
    }

    public Application(int id, ApplicationStatus applicationStatus, Applicant applicant, Credit credit) {
        this.id = id;
        this.applicationStatus = applicationStatus;
        this.applicant = applicant;
        this.credit = credit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ApplicationStatus getApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(ApplicationStatus applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    public Applicant getApplicant() {
        return applicant;
    }

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

    public Credit getCredit() {
        return credit;
    }

    public void setCredit(Credit credit) {
        this.credit = credit;
    }
}
