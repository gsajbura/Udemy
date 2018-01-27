
public class TestClass {

	public static void main(String[] args) {

		Printer printer = new Printer(90, false);
		printer.fillUpTonner(5);
		printer.fillUpTonner(5);
		printer.fillUpTonner(5);
		printer.printing(true);
		printer.printing(true);
		printer.printing(false);
		printer.printing(false);
		
		printer.howManyPages();
		
	}

}
