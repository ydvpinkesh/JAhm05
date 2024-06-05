package bankactivities;

public class Transaction implements Bank {
	
	public void deposite(Account acc,int amt) {
		int newbal = acc.getBalance() + amt;
		acc.setBalance(newbal);
		
		System.out.println("Balance deposite");
	}
	
	public void withdraw(Account acc,int amt) {
		
		int newbal = acc.getBalance() + amt;
		acc.setBalance(newbal);
		
		System.out.println("Balance updated");
	}
	
	
}
