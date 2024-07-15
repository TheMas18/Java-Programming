package Multithreading;
//By Using Thread Class
class Thread1 extends Thread {
	Thread1(String name) {
		super(name);
	}
	@Override
	public void run() {

		for (int i = 0; i < 3; i++) {
			System.out.println("Inside"+Thread.currentThread()+ " " + i);
		}
	}
}
//By Using Runnable

//class Thread2 implements  Runnable {
//	
//}
public class ThreadTester {
	public static void main(String[] args) {
//		Thread1 thread1 = new Thread1("Thread1");
//		thread1.start();
		/*
		When we are using Thread class to Create thread we are 
		basically overriding the run method
		
		But in case of runnable, we are implemeneting it, becasue in the declaration
		their is runnable object which is target . which is running ,method
		target.run().
		
		
		diff is that when we use runnable we can implement more things
		but thread class cannot extend more classes
			
		Thread thread2=new Thread(new Thread2(),"Thread2");
		thread2.start();
		*/
		Thread thread2=new Thread(()->{
			for (int i = 0; i < 3; i++) {
				System.out.println("Inside"+Thread.currentThread()+ " " + i);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		},"Thread2");
		thread2.start();
	}
}
