
public class BankAccountTester{

	public static void main(String[] args) {
		
		Account acc = new Account(1,1000,"Greg","g@gmail.com","123456");
		Account acc2 = new Account();
		
		// this is set by constructor:
		// acc.setAccountNumber(1);
		// acc.setBalance(1000);
		// acc.setCustommerName("Grzegorz");
		// acc.setEmail("g@gmail");
		// acc.setPhoneNumber("123456789");
		
		System.out.println(acc.getBalance());
		acc.deposit(500);
		System.out.println(acc.getBalance());
		acc.withdraw(1500);
		System.out.println(acc.getBalance());
		acc.deposit(4200);
		
		System.out.println(acc2.getCustommerName());
	}

}
