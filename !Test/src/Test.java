import java.util.Scanner;

public class Test {
	
	private static Scanner scanner = new Scanner(System.in);


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Podaj swoje imiê: ");
		String imie = scanner.nextLine();
		System.out.print("Podaj nazwisko: ");
		String nazwisko = scanner.nextLine();
		System.out.println(imie + " " + nazwisko);

	}

}
