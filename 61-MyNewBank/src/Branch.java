import java.util.ArrayList;

public class Branch {
	private String branchName;
	private ArrayList<Customer> customersArrayList = new ArrayList<Customer>();
	
	public Branch(String branchName) {
		this.branchName = branchName;
	}

	public String getBranchName() {
		return branchName;
	}
	
	public ArrayList<Customer> getCustomersArrayList() {
		return customersArrayList;
	}

	public boolean addCustomer(String customerName) {
		Customer existingCustomer = findCustomer(customerName);
		if (existingCustomer == null) {
			customersArrayList.add(new Customer(customerName));
			return true;
		}
		return false;
	}
	
	public boolean addCustomer(String customerName, double transaction) {
		Customer existingCustomer = findCustomer(customerName);
		if (existingCustomer == null) {
			customersArrayList.add(new Customer(customerName, transaction));
			return true;
		}
		return false;
	}
	
	public boolean addTransaction (String customerName, double transaction) {
		Customer existingCustomer = findCustomer(customerName);
		if (existingCustomer != null) {
			existingCustomer.getTransactionsArrayList().add(transaction);
			return true;
		}
		return false;
	}
	
	public Customer findCustomer (String customerName) {
		for (Customer customer : customersArrayList) {
			if (customer.getCustomerName().equals(customerName))
				return customer;
		}
		return null;
	}


}
