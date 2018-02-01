import java.util.ArrayList;

public class Bank {
	private ArrayList<Branch> branchesArrayList = new ArrayList<Branch>();
	
	public boolean addBranch(String branchName) {
		Branch existingBranch = findBranch(branchName);
		if (existingBranch == null) {
			branchesArrayList.add(new Branch(branchName));
			return true;
		}
		return false;
		
	}

	public Branch findBranch (String branchName) {
		for (Branch branch : branchesArrayList) {
			if (branch.getBranchName().equals(branchName))
				return branch;
		}
		return null;
	}

	public ArrayList<Branch> getBranchesArrayList() {
		return branchesArrayList;
	}
	
	public boolean addCustomer(String customerName, String branchName) {
		Branch existingBranch = findBranch(branchName);
		if (existingBranch != null) {
			Customer existingCustomer = existingBranch.findCustomer(customerName);
			if(existingCustomer == null) {
				existingBranch.getCustomersArrayList().add(new Customer(customerName));
				return true;
			}
		}
		return false;
	}
	
	public boolean addCustomer(String customerName, String branchName, Double transaction) {
		Branch existingBranch = findBranch(branchName);
		if (existingBranch != null) {
			Customer existingCustomer = existingBranch.findCustomer(customerName);
			if(existingCustomer == null) {
				existingBranch.getCustomersArrayList().add(new Customer(customerName, transaction));
				return true;
			}
		}
		return false;
	}
	
	public void printBranches () {
		for (Branch branch : branchesArrayList) {
			System.out.println(branchesArrayList.indexOf(branch) + 1 + ". " + branch.getBranchName());
		}
	}
	
	public boolean addTransaction(String branchName, String customerName, double transaction) {
		Branch existingBranch = findBranch(branchName);
		if (existingBranch != null) {
			Customer existingCustomer = existingBranch.findCustomer(customerName);
			if(existingCustomer != null) {
				existingBranch.addTransaction(customerName, transaction);
				return true;
			}
		}
		return false;
	}
	
	public boolean printCustomers (String branchName) {
		Branch existingBranch = findBranch(branchName);
			if (existingBranch != null) {
				for (Customer customer : existingBranch.getCustomersArrayList()) {
					System.out.println(existingBranch.getCustomersArrayList().indexOf(customer)+ 1 + " ." + customer.getCustomerName());
				}
				return true;
			}
			return false;
	}
	
	public boolean printTransactions(String branchName, String customerName) {
		Branch existingBranch = findBranch(branchName);
		if (existingBranch != null) {
			Customer existingCustomer = existingBranch.findCustomer(customerName);
			for (double transaction : existingCustomer.getTransactionsArrayList() ) {
				System.out.println(existingCustomer.getTransactionsArrayList().indexOf(transaction) + 1 + ". " + transaction);
			}
			return true;
		}
		return false;
	}

}
