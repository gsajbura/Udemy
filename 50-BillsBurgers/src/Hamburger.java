
public class Hamburger {

	private String name;
	private String rollType;
	private String meat;
	private double price;

	private String addition1name;
	private String addition2name;
	private String addition3name;
	private String addition4name;
	private double addition1price;
	private double addition2price;
	private double addition3price;
	private double addition4price;

	public Hamburger(String name, String rollType, String meat, double price) {
		this.name = name;
		this.rollType = rollType;
		this.meat = meat;
		this.price = price;
	}

	public void setAddition1(String addition1name, double addition1price) {
		this.addition1name = addition1name;
		this.addition1price = addition1price;
	}

	public void setAddition2(String addition2name, double addition2price) {
		this.addition2name = addition2name;
		this.addition2price = addition2price;
	}

	public void setAddition3(String addition3name, double addition3price) {
		this.addition3name = addition3name;
		this.addition3price = addition3price;
	}

	public void setAddition4(String addition4name, double addition4price) {
		this.addition4name = addition4name;
		this.addition4price = addition4price;
	}

	public double showPrice() {
		double totalPrice = this.price;
		System.out.println("Hamburger " + name + " on a " + rollType + " with " + meat + " is: " + totalPrice);
		if (addition1name != null) {
			System.out.println(addition1name + ": " + addition1price);
			totalPrice += addition1price;
		}
		if (addition2name != null) {
			System.out.println(addition2name + ": " + addition2price);
			totalPrice+= addition2price;
		}
		if (addition3name != null) {
			System.out.println(addition3name + ": " + addition3price);
			totalPrice += addition3price;
		}
		if (addition4name != null) {
			System.out.println(addition4name + ": " + addition4price);
			totalPrice += addition4price;
		}
		return totalPrice;
	}

}
