
public class Printer {

	private int tonerLevel = 100;
	private boolean isDuplex;
	private int pagesPrinted = 0;

	public Printer(int tonerLevel, boolean isDuplex) {
		super();
		if (tonerLevel >= 0 && tonerLevel <= 100)
			this.tonerLevel = tonerLevel;
		this.isDuplex = isDuplex;

	}

	public void fillUpTonner(int ammount) {

		if (tonerLevel + ammount <= 100) {
			tonerLevel += ammount;
			System.out.println("Ammount is " + tonerLevel);
		} else
			System.out.println("Toner level cannto exeed 100. Current amount is: " + tonerLevel);
	}

	public void printing(boolean isPrintingDuplex) {

		if (this.isDuplex == false && isPrintingDuplex == true) {
			System.out.println("Not printing, this printer is not duplex");
		} else {
			System.out.println("Printing");
			this.pagesPrinted++;
		}
	}
	
	public void howManyPages() {
		System.out.println("Printer has printed " + this.pagesPrinted + " so far...");
	}

}
