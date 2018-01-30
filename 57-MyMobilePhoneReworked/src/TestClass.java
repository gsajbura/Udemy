import java.util.Scanner;

public class TestClass {
	private static MobilePhone mobilePhone = new MobilePhone();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		useMobielPhone();
	}

	private static void useMobielPhone() {
		boolean quit = false;
		printOptionList();
		while (!quit) {
			System.out.print("\nChoose option (0 - Print option list): ");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 0:
				printOptionList();
				break;
			case 1:
				mobilePhone.printContacts();
				break;
			case 2:
				System.out.println("ADD CONTACT");
				phoneAddContact();
				break;
			case 3:
				System.out.println("MODIFY CONTACT");
				phoneModifyContact();
				break;
			case 4:
				System.out.println("REMOVE CONTACT");
				phoneRemoveContact();
				break;
			case 5:
				System.out.println("SEARCH");
				phoneSearchForContact();
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

	private static void printOptionList() {
		System.out.println("\nPress number");
		System.out.println("\t0 - Print options");
		System.out.println("\t1 - Print list of contacts");
		System.out.println("\t2 - Add new contact");
		System.out.println("\t3 - Modify contact");
		System.out.println("\t4 - Remove contact");
		System.out.println("\t5 - Serch for contact");
		System.out.println("\t9 - Quit");
	}

	private static void phoneAddContact() {
		System.out.print("Type name: ");
		String name = scanner.nextLine();

		if (mobilePhone.findContact(name)) {
			System.out.println("Contact already on the list");
			return;
		}

		System.out.print("Type number: ");
		String number = scanner.nextLine();
		Contact newContact = new Contact(name, number);
		mobilePhone.addContact(newContact);
		System.out.println("New contact " + name + " added with number " + number);

	}

	private static void phoneModifyContact() {
		System.out.print("Type name of a contact to modify: ");
		String name = scanner.nextLine();
		if (mobilePhone.findContact(name)) {
			System.out.println("Contact " + name + " found");
			System.out.print("Type new name: ");
			String newName = scanner.nextLine();
			System.out.print("Type new number: ");
			String newNumber = scanner.nextLine();
			mobilePhone.modifyContact(name, newName, newNumber);
			System.out.println("Contact " + newName + " modified, phone number: " + newNumber);
		} else {
			System.out.println("Contact " + name + " not found");
		}

	}

	private static void phoneRemoveContact() {
		System.out.print("Type name of a contact to remove: ");
		String name = scanner.nextLine();
		if (mobilePhone.findContact(name)) {
			System.out.println("Contact " + name + " found");
			System.out.print("Do you want to remove this contact? 1-YES, 0-NO: ");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				mobilePhone.removeContact(name);
				System.out.println("Contact removed");
				break;
			case 0:
				System.out.println("Aborted");
				break;
			default:
				System.out.println("Wrong option number");
				break;
			}
		} else {
			System.out.println("Contact " + name + " not found");
		}
	}

	private static void phoneSearchForContact() {
		System.out.print("Type name of a contact to search for: ");
		String name = scanner.nextLine();
		if (mobilePhone.findContact(name)) {
			String number = mobilePhone.searchForContact(name);
			System.out.println("Contact " + name + " found. Phone number: " + number);
		} else {
			System.out.println("Contact " + name + " not found");
		}
	}

}
