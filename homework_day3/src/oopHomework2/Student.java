package oopHomework2;

public class Student extends User {

	private String adress;
	private String cityName;

	public Student() {

	}

	public Student(String adress, String cityName, int id, String firstName, String lastName, String email,
			String password) {
		super(id, firstName, lastName, email, password);
		this.adress = adress;
		this.cityName = cityName;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

}
