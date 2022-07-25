public class Address {
    private int id;
    private Customer customer;
    private String cityName;
    private String countryName;
    private String districtName;
    private String addressDetail;

    public Address() {
    }

    public Address(int id, Customer customer, String cityName, String countryName, String districtName, String addressDetail) {
        this.id = id;
        this.customer = customer;
        this.cityName = cityName;
        this.countryName = countryName;
        this.districtName = districtName;
        this.addressDetail = addressDetail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }
}
