package Multithreading;

class Company {
	int n;
	boolean check;
	
	synchronized public void produceItem(int n) throws InterruptedException {
		if(check) {
			wait();
		}
		this.n = n;
		System.out.println("Produced : " + this.n);
		check=true;
		notify();
	}

	synchronized public int consumeItem() throws InterruptedException {
		if(!check) {
			wait();
		}
		System.out.println("Consumed : " + this.n);
		check=false;
		notify();
		return this.n;

	}
}

class Producer extends Thread {
	Company c;

	Producer(Company c) {
		this.c = c;
	}

	@Override
	public void run() {
		int i = 1;
		while (true) {
			try {
				this.c.produceItem(i);
				i++;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
			}
		}
	}
}

class Consumer extends Thread {
	Company c;

	Consumer(Company c) {
		this.c = c;
	}

	@Override
	public void run() {

		while (true) {
			try {
				this.c.consumeItem();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
			}
		}
	}
}

public class ThreadOP {
	public static void main(String[] args) {
		Company c=new Company();
		Producer p=new Producer(c);
		Consumer con=new Consumer(c);
		p.start();
		con.start();
	}
}
