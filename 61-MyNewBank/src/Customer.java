import java.util.ArrayList;

public class Customer {
	private String customerName;
	private ArrayList<Double> transactionsArrayList = new ArrayList<Double>();
	
	public Customer(String customerName) {
		this.customerName = customerName;
	}
	
	public Customer(String customerName, double transaction) {
		this(customerName);
		this.transactionsArrayList.add(transaction);
	}
	
	public ArrayList<Double> getTransactionsArrayList() {
		return transactionsArrayList;
	}

	public String getCustomerName() {
		return customerName;
	}
	
}
