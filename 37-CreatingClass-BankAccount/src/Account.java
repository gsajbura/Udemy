
public class Account {

	private int accountNumber;
	private int balance;
	private String custommerName;
	private String email;
	private String phoneNumber;
	
	public Account() {
		this(0,0,"Unknown","Unknown","000 000 000");
		System.out.println("Empty constructor called");
	}

	public Account(int accountNumber, int balance, String custommerName, String email, String phoneNumber) {
		System.out.println("Constructor with parameteres called");
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.custommerName = custommerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}



	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getCustommerName() {
		return custommerName;
	}

	public void setCustommerName(String custommerName) {
		this.custommerName = custommerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void deposit(int deposit) {
		balance += deposit;
		System.out.println("You have deposited " + deposit + " balance is now: " + balance);
	}

	public void withdraw(int withdraw) {

		if (withdraw > balance) {
			System.out.println("You don't have enough funds, balance is: " + balance);
		} else {
			balance -= withdraw;
			System.out.println("You have withdrown " + withdraw + " balance is now " + balance);
		}
	}
}
