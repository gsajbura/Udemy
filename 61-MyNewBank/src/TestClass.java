import java.util.Scanner;

public class TestClass {

	private static Scanner scanner = new Scanner(System.in);
	private static Bank bank = new Bank();

	public static void main(String[] args) {

		boolean quit = false;
		printActions();
		while (!quit) {
			System.out.print("\nEnter action (0 to show available actions): ");
			int action = scanner.nextInt();
			scanner.nextLine();

			switch (action) {
			case 9:
				System.out.println("\nShutting down...");
				quit = true;
				break;

			case 1:
				bank.printBranches();
				break;

			case 2:
				System.out.println("ADD NEW BRANCH");
				addNewBranch();
				break;

			case 3:
				System.out.println("ADD NEW CUSTOMER");
				addNewCustomer();
				break;

			case 4:
				System.out.println("SHOW CUSTOMERS IN BRANCH");
				printCustomers();
				break;

			case 5:
				System.out.println("ADD TRANSACTION");
				addNewTransaction();
				break;
			case 6:
				System.out.println("PRINT TRANSACTIONS");
				printTransactions();
				break;
			case 0:
				printActions();
				break;
			default:
				System.out.println("Wrong number");
			}
		}
	}

	public static void printActions() {
		System.out.println("\nPress");
		System.out.println("1  - to print branches\n" + "2  - to add a new branch\n" + "3  - to add new customer\n"
				+ "4  - to print customers in existing branch\n" + "5  - to add transaction\n"
				+ "6  - to print transactions\n" + "0  - to shutdown");
	}

	public static void addNewBranch() {
		System.out.print("Type branch name: ");
		String branchName = scanner.nextLine();
		if (bank.addBranch(branchName)) {
			System.out.println("New branch added");
		} else {
			System.out.println("Branch already exists");
		}
	}

	public static void addNewCustomer() {
		System.out.print("Type branch name: ");
		String branchName = scanner.nextLine();
		System.out.print("Type customer name: ");
		String newCustomerName = scanner.nextLine();
		System.out.println("Do you want to add transaction? 1 - YES, 0 - NO");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			System.out.print("Type amount: ");
			double amount = scanner.nextDouble();
			if (bank.addCustomer(newCustomerName, branchName, amount)) {
				System.out.println("New customer added with initial transaction");
			} else {
				System.out.println("Branch doesn't exist");
			}
			break;
		case 0:
			if (bank.addCustomer(newCustomerName, branchName)) {
				System.out.println("New customer added");
			} else {
				System.out.println("Branch doesn't exist");
			}
			break;
		}


	}

	public static void printCustomers() {
		System.out.print("Type branch name: ");
		String branchName = scanner.nextLine();
		if (!bank.printCustomers(branchName)) {
			System.out.println("Branch doesn't exist");
		}
	}
	
	public static void addNewTransaction() {
		System.out.print("Type branch, name and amount: ");
		String branchName = scanner.nextLine();
		String customerName = scanner.nextLine();
		double amount = scanner.nextDouble();
		if(bank.addTransaction(branchName, customerName, amount)) {
			System.out.println("Added");
		}else {
			System.out.println("Not added");
		}
	}
	
	public static void printTransactions() {
		System.out.print("Type branch and name: ");
		String branchName = scanner.nextLine();
		String customerName = scanner.nextLine();
		if (!bank.printTransactions(branchName, customerName)) {
			System.out.println("Something is wrong");
		}
	}

}
