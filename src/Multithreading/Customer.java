package Multithreading;

class Bank extends Thread {

	static int balance = 5000;
	static int withDraw;

	Bank(int withDraw) {
		this.withDraw = withDraw;
	}

	
	public static synchronized void Withdraw() {
		String name = Thread.currentThread().getName();
		if (withDraw <= balance) {
			System.out.println(name + " WithDrawn amount");
			balance = balance - withDraw;

		} else {
			System.out.println(name +" Insufficient Balance");
		}
	}
	
	public void run() {
		Withdraw();
	}

}

public class Customer {
	public static void main(String[] args) {
		Bank bank1=new Bank(5000);
		Thread t1=new Thread(bank1,"Mas");
		Thread t2 =new Thread(bank1,"Goku");
		
		Bank bank2=new Bank(5000);
		Thread t3=new Thread(bank2,"Mas");
		Thread t4 =new Thread(bank2,"Goku");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
