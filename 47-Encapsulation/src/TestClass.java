
public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Printer printer = new Printer(90, true);
		printer.fillUpTonner(5);
		printer.printing(true);
		printer.printing(true);
		printer.printing(false);
		printer.printing(false);
		
		printer.howManyPages();
	}

}
