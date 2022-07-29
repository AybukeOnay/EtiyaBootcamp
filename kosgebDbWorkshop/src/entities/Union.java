package entities;

public class Union extends Applicant{
    private String name;

    public Union(String name) {
        this.name = name;
    }

    public Union(int id, String userName, String password, String name) {
        super(id, userName, password);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
