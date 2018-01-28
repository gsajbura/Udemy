import java.util.ArrayList;

public class MobilePhone {
	private ArrayList<Contact> contacts = new ArrayList<Contact>();
	

	
	public void addNewContact(String name, String number) {
		contacts.add(new Contact(name, number));
		System.out.println("New contact added");
	}
	
	
	

}
