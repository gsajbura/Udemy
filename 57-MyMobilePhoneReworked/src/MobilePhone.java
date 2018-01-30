import java.util.ArrayList;

public class MobilePhone {
	
	private ArrayList<Contact> contacts = new ArrayList<Contact>();
	
	public void printContacts() {
		System.out.println("List of contacts:");
		int i = 1;
		for (Contact x : contacts) {
			System.out.println(i + ". " + x.getName() + " " + x.getNumber());
			i++;
		}
	}

	public void addContact(Contact contact) {
		contacts.add(contact);
	}

	public boolean findContact(String name) {
		if (search(name) >= 0)
			return true;
		return false;
	}
	
	public void modifyContact(String name, String newName, String newNumber) {
		int position = search(name);
		contacts.set(position, new Contact(newName, newNumber));
	}

	public void removeContact(String name) {
		int position = search(name);
		contacts.remove(position);
	}
	

	public String searchForContact(String name) {
		int position = search(name);
		return contacts.get(position).getNumber();
	}
	
	private int search(String name) {
		for (Contact x : contacts) {
			if (x.getName().equals(name)) {
				return  contacts.indexOf(x);
			}
		}
		return -1;
	}

}
