
public class Inter {
	
	public int wiek;
	public String name;
	
	
	
	
	public Inter() {
	}
	public int getWiek() {
		return wiek;
	}
	private void test() {
		System.out.println("To jest test");
	}
	
	void metoda(){
		System.out.println("To jest metoda default");
		test();
	}
	
	public static void statyczna() {
		System.out.println("To jest metoda statyczna");
	}
}