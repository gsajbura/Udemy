import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

	private Scanner scanner = new Scanner(System.in);
	private static ArrayList<Contact> contacts = new ArrayList<Contact>();

	public void useMobielPhone() {
		boolean quit = false;
		printOptionList();
		while (!quit) {
			System.out.print("\nChoose option: ");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 0:
				printOptionList();
				break;
			case 1:
				printContacts();
				break;
			case 2:
				System.out.println("ADD CONTACT");
				addContact();
				break;
			case 3:
				System.out.println("MODIFY CONTACT");
				modifyContact();
				break;
			case 4:
				System.out.println("REMOVE CONTACT");
				removeContact();
				break;
			case 5:
				System.out.println("SEARCH");
				searchForContact();
				break;
			case 9:
				quit = true;
				break;
			default:
				System.out.println("Wrong option number");
				break;
			}
		}
	}

	private void printOptionList() {
		System.out.println("Press number");
		System.out.println("\t0 - Print options");
		System.out.println("\t1 - Print list of contacts");
		System.out.println("\t2 - Add new contact");
		System.out.println("\t3 - Modify contact");
		System.out.println("\t4 - Remove contact");
		System.out.println("\t5 - Serch for contact");
		System.out.println("\t9 - Quit");
	}

	private void addContact() {
		System.out.print("Type name: ");
		String name = scanner.nextLine();
		System.out.print("Type number: ");
		String number = scanner.nextLine();
		contacts.add(new Contact(name, number));
		System.out.println("New contact " + name + " added with number " + number);
	}

	private void printContacts() {
		System.out.println("List of contacts:");
		int i = 1;
		for (Contact x : contacts) {
			System.out.println(i + ". " + x.getName() + " " + x.getNumber());
			i++;
		}
	}

	private void modifyContact() {
		int position = findContact();
		if (position >= 0) {
			System.out.println("Type new name: ");
			String name = scanner.nextLine();
			System.out.println("Type new number: ");
			String number = scanner.nextLine();
			contacts.set(position, new Contact(name, number));
			System.out.println("Contact " + name + " modified, phone number: " + number);
		}
	}

	private void removeContact() {
		int position = findContact();
		if (position >= 0) {
			System.out.print("Do you want to remove this contact? 1-YES, 0-NO: ");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				contacts.remove(position);
				System.out.println("Contact removed");
				break;
			case 0:
				System.out.println("Aborted");
				break;
			default:
				System.out.println("Wrong option number");
				break;
			}
		}

	}

	private int findContact() {
		System.out.print("Type name of a contact: ");
		String name = scanner.nextLine();
		for (Contact x : contacts) {
			if (x.getName().equals(name)) {
				System.out.println("Contact " + x.getName() + " found");
				return contacts.indexOf(x);
			}
		}
		System.out.println("Contact " + name + " not found");
		return -1;

	}
	
	private void searchForContact() {
		int position = findContact();
			if (position >= 0) {
				Contact c = contacts.get(position);
				System.out.println("Phone number: " + c.getNumber());
			}
	}

}
