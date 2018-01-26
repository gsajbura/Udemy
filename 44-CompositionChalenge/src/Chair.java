
public class Chair {

	private int legs;
	private int armrests;

	public Chair(int legs, int armrests) {
		super();
		this.legs = legs;
		this.armrests = armrests;
	}

	public int getLegs() {
		return legs;
	}

	public int getArmrests() {
		return armrests;
	}

	public void printChair() {
		System.out.println("Chair has: " + legs + " legs and " + armrests + " armrests");
	}

}
