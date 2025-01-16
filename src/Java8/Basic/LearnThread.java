package Java8.Basic;

import java.util.Iterator;

class MyThread1 implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			System.out.println("Hello " + i);
		}
	}
}

//public class LearnThread {
//	public static void main(String[] args) {
//
//		MyThread1 t1 = new MyThread1();
//		Thread t = new Thread(t1);// giving implementation class of runnable interface
//		t.start();
//	}
//}

//now lets do it directly without implementation class
public class LearnThread {
	public static void main(String[] args) {
		Runnable runnable = () -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println("Hello " + i);
			}
		};
		Thread t = new Thread(runnable);
		t.start();
	}
}