
public class DeluxBurger extends Hamburger {

	public DeluxBurger(double price) {
		super("Delux", "Whole grain bread", "Cow and chicken", price);
		super.setAddition1("Drink", 3.99);
		super.setAddition2("Fries", 1.99);
	}

	@Override
	public void setAddition1(String addition1name, double addition1price) {
		System.out.println("Cannot do that");
	}

	@Override
	public void setAddition2(String addition1name, double addition1price) {
		System.out.println("Cannot do that");
	}

	@Override
	public void setAddition3(String addition1name, double addition1price) {
		System.out.println("Cannot do that");
	}

	@Override
	public void setAddition4(String addition1name, double addition1price) {
		System.out.println("Cannot do that");
	}

	
	
	

}
