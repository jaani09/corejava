package Demonthread1;



public class Account {
	private int balance = 0 ;
	public void setBalance(int balance) {
	
	try {
		Thread.sleep(200);
	} catch (InterruptedException e) {
	  e.printStackTrace();
	}	
	this.balance=balance;
		
	}
	public int getbalance() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return balance;
	}
	public synchronized void deposie(String name, int amount) {
		int total =getbalance()+amount;
		setBalance(total);
		System.out.println(name+"balance"+getbalance());
	}

}
