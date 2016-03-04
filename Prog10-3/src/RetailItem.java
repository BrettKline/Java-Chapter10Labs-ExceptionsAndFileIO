
public class RetailItem {
	private String description;
	private int unitsOnHand;
	private double price;
	
	public String getDescription() {
		return description;
	}
	public int getUnitsOnHand() {
		return unitsOnHand;
	}
	public double getPrice() {
		return price;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setUnitsOnHand(int unitsOnHand) throws NegativeQuantity {
		if (unitsOnHand < 0) {
			throw new NegativeQuantity();
		}
		this.unitsOnHand = unitsOnHand;
	}
	public void setPrice(double price) throws NegativePrice {
		if (price < 0) {
			throw new NegativePrice();
		}
		this.price = price;
	}
	@Override
	public String toString() {
		return "RetailItem [description=" + description + ", unitsOnHand=" + unitsOnHand + ", price=" + price + "]";
	}
}
