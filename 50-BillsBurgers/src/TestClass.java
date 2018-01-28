
public class TestClass {

	public static void main(String[] args) {
		Hamburger hamburger = new Hamburger("Burger", "White bread", "Beef", 5.99);
		hamburger.setAddition1("Tomato", 0.99);
		hamburger.setAddition2("Letuce", 0.49);
		hamburger.setAddition4("Cheese", 1.49);
		System.out.println("Total price is: " + hamburger.showPrice());
		System.out.println();
		
		HealthyHamburger hb = new HealthyHamburger(8.99);
		hb.setAddition1("Tomato", 0.99);
		hb.setAddition5("Letuce", 0.49);
		hb.setAddition6("Cheese", 1.49);
		System.out.println("Total price is: " + hb.showPrice());
		System.out.println();
		
		DeluxBurger db = new DeluxBurger(8.99);
		db.setAddition1("Tomato", 0.99);
		db.setAddition3("Letuce", 0.49);
		db.setAddition4("Cheese", 1.49);
		System.out.println("Total price is: " + db.showPrice());
		System.out.println();
	}

}
