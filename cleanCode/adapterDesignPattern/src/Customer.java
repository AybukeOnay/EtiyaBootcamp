public class Customer extends Person{
    private int cityId;

    public Customer() {
    }

    public Customer(int id, String firstName, String lastName, String nationalIdentity, int yearOfBirth, int cityId) {
        super(id, firstName, lastName, nationalIdentity, yearOfBirth);
        this.cityId = cityId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
