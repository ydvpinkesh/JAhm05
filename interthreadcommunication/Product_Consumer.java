package interthreadcommunication;


class Q{
	int num;

	public int getNum() {
		System.out.println("consumer number"+num);
		return num;
	}

	public void setNum(int num) {
		
		System.out.println("product number"+num);
		this.num = num;
	}
	
}

class Product implements Runnable{
	Q q;
	

	public Product(Q q) {
		
		this.q = q;
		
		Thread t1 = new Thread(this,"Product");
		t1.start();
	}


	@Override
	public void run() {
		int i=0;
		while(true) {
			q.setNum(i++);
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}


class Consumer implements Runnable{
	
	Q q;
	
	

	public Consumer(Q q) {
		
		this.q = q;
		

		Thread t1 = new Thread(this,"Consumer");
		t1.start();
	}



	@Override
	public void run() {
		
		while(true) {
			q.getNum();
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}


public class Product_Consumer {

	public static void main(String[] args) {
		
		Q q = new Q();
		new Product(q);
		new Consumer(q);

	}

}
