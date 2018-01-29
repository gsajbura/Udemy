import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

	Scanner scanner = new Scanner(System.in);
	private static ArrayList<Contact> contacts = new ArrayList<Contact>();

	public void useMobielPhone() {
		boolean quit = false;
		printOptionList();
		while (!quit) {
			System.out.print("Choose option: ");
			int choice = scanner.nextInt();
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

	private void printOptionList() {
		System.out.println("\nPress");
		System.out.println("\t0 - Print options");
		System.out.println("\t1 - Print list of contacts");
		System.out.println("\t2 - Add new contact");
		System.out.println("\t3 - Modify contact");
		System.out.println("\t4 - Remove contact");
		System.out.println("\t5 - Serch for contact");
		System.out.println("\t9 - Quit");
	}

	private void addContact() {
		Scanner input = new Scanner(System.in);
		System.out.print("Type name: ");
		String name = input.nextLine();
		System.out.print("Type number: ");
		String number = input.nextLine();
		contacts.add(new Contact(name, number));
		System.out.println("New contact added");
	}

	private void printContacts() {
		System.out.println("List of contacts:");
		int i = 1;
		for (Contact x : contacts) {
			System.out.println(i + ". " + x.getName() + " " + x.getNumber());
			i++;
		}
	}

}
