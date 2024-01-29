package Multithreading;



class MyThread1 extends Thread{
	@Override
	public void run() {
		System.out.println("My Thread 1 is Running...");
	}
	
}
class MyThread2 extends Thread{
	@Override
	public void run() {
		System.out.println("My Thread 2 is Running...");
	}
}
public class M1 {
	public static void main(String[] args) {
		MyThread1 t1=new MyThread1();
		MyThread2 t2=new MyThread2();
		t1.start();
		
		t2.start();
	}
}
