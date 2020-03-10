package Collections;

public class Collection {
	
	private String name;
	private double amount;
	private String type;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Collection [name=" + name + ", amount=" + amount + ", type=" + type + "]";
	}
	
}
