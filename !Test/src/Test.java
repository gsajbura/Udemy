public class Test extends Inter {


//	Test(){
//		System.out.println("Utworzono test");
//	}
	
	
	@Override
	public void metoda() {
		super.metoda();
		System.out.println("A to dalsza czêœæ");
	}

	public static void main(String[] args) {
		Test test = new Test();
		test.metoda();
		System.out.println(test.getWiek());
	}


}


