package Demonthread1;

public class Racing extends Thread{
    String name = null ;
    
    static Account account = new Account();
    
    public Racing(String name) {
    	this.name=name;
    }
    @Override
    public void run() {
     for (int i = 0; i < 10; i++) {
		this.account.deposie(name, 1000);
	}
    	
    }
    
    
    
    
}
