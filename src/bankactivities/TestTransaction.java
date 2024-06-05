package bankactivities;

public class TestTransaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account acc = new Account();
		acc.setAccname("Pinkesh Yadav");
		acc.setEmail("acc@gmail.com");
		acc.setBalance(500000);
		
		Transaction tcs = new Transaction();
		tcs.deposite(acc, 30000);
		
		System.out.println(acc);
		
		tcs.withdraw(acc, 10000);
		
		System.out.println(acc);

	}

}
