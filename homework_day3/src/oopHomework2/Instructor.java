package oopHomework2;

public class Instructor extends User {

	private String autobiography;

	public Instructor() {

	}

	public Instructor(int id, String firstName, String lastName, String email, String password) {

		super(id, firstName, lastName, email, password);
	}

	public Instructor(String autobiography) {
		this.autobiography = autobiography;
	}

	public String getAutobiography() {
		return autobiography;
	}

	public void setAutobiography(String autobiography) {
		this.autobiography = autobiography;
	}

}
