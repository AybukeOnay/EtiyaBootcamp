package gameProject.entities.concretes;

public class Campaign {

	private int id;
	private String name;
	private double discountedRate;
	
	public Campaign() {
	}

	public Campaign(int id, String name, double discountedRate) {
		this.id = id;
		this.name = name;
		this.discountedRate = discountedRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDiscountedRate() {
		return discountedRate;
	}

	public void setDiscountedRate(double discountedRate) {
		this.discountedRate = discountedRate;
	}
	
	
	
	
}
