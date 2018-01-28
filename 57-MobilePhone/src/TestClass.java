import java.util.ArrayList;
import java.util.Scanner;

public class TestClass {
	private static Scanner scanner = new Scanner(System.in);
	private static ArrayList<Contact> contacts = new ArrayList<Contact>();
	private static MobilePhone mobilePhone = new MobilePhone();

	public static void main(String[] args) {
		printOptionList();
		boolean quit = false;

		while (!quit) {
			System.out.print("Choose option: ");
			int choice = scanner.nextInt();
//			scanner.nextLine();
			switch (choice) {
			case 0:
				printOptionList();
				break;
			case 1:
				printContacts();
				break;
			case 2:
				addContact();
				break;
			case 9:
				quit = true;
				break;
			default:
				break;
			}
		}
	}

	public static void addContact() {
		System.out.print("Type name: ");
		String name = scanner.nextLine();
		System.out.print("Type number: ");
		String number = scanner.nextLine();
		mobilePhone.addNewContact(name, number);
	}
	public static void printOptionList() {
		System.out.println("\nPress");
		System.out.println("\t0 - Print options");
		System.out.println("\t1 - Print list of contacts");
		System.out.println("\t2 - Add new contact");
		System.out.println("\t3 - Modify contact");
		System.out.println("\t4 - Remove contact");
		System.out.println("\t5 - Serch for contact");
		System.out.println("\t9 - Quit");
	}

	public static void useMobilePhone() {
		
	}
	
	public static void printContacts() {
		for (Contact x : contacts) {
			System.out.println(x.getName() + " " + x.getNumber());
		}
	}
}
