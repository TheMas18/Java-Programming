package OopsConcepts;

//By using abstract class

//abstract class A {
//	abstract public void add(int a, int b);
//}
//
//class B extends A {
//	public void add(int a, int b) {
//		System.out.println(a + b);
//	}
//}
//
//public class abstraction {
//	public static void main(String[] args) {
//
//		A ref = new B();
//		ref.add(5, 3);
//
//	}
//}

// By Using Interface

interface A {
	void add(int a, int b);
	public static void minus(int a, int b) {
		System.out.println("Hello"+(b-a));
	}
}

class B implements A {
	public void add(int a, int b) {
		System.out.println(a + b);
	}
}

public class abstraction {
	public static void main(String[] args) {

		A ref = new B();
		ref.add(5, 3);
		A.minus(10, 20);

	}
}