package bankactivities;

public interface Bank {
	
	int MIN_BAL = 1000;
	int DEPODITE_LIMIT = 20000;
	int WITHFROW_LIMIT = 10000;
	
	void deposite(Account acc,int amt);
	void withdraw(Account acc,int amt);
	

}
