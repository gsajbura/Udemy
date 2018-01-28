
public class HealthyHamburger extends Hamburger {
	
	private String addition5name;
	private String addition6name;
	private double addition5price;
	private double addition6price;

	public HealthyHamburger(double price) {
		super("HB", "Brown rye", "Chicken", price);
	}

	public void setAddition5(String addition5name, double addition5price) {
		this.addition5name = addition5name;
		this.addition5price = addition5price;
	}

	public void setAddition6(String addition6name, double addition6price) {
		this.addition6name = addition6name;
		this.addition6price = addition6price;
	}

	@Override
	public double showPrice() {
		double totalPrice = super.showPrice();
		if (addition5name != null) {
			System.out.println(addition5name + ": " + addition5price);
			totalPrice += addition5price;
		}
		if (addition6name != null) {
			System.out.println(addition6name + ": " + addition6price);
			totalPrice += addition6price;
		}
		return totalPrice;
	}
	
	
}
