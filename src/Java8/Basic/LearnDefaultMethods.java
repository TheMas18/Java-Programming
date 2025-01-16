package Java8.Basic;
/*
interface Parent {
	default void sayHello() {
		System.out.println("Hello Parent");
	}
}

class Child implements Parent {
	// directly sayhello method will run when you implement parent
	// we can override also
	//here child method will run
	@Override
	public void sayHello() {
		System.out.println("Hello Child");
	}

}

public class LearnDefaultMethods {

	public static void main(String[] args) {
//		Child c = new Child();
//		c.sayHello();
		
		//supose i create parent obj
		Parent c=new Child();
		c.sayHello();//still it will run child 
	}
}
*/

interface A {
	default void sayHello() {
		System.out.println("Hello Parent");
	}
}

interface B  {
	default void sayHello(){
		System.out.println("Hello Child");
	}
}

public class LearnDefaultMethods implements A,B{
	public static void main(String[] args) {
			LearnDefaultMethods m=new LearnDefaultMethods();
			m.sayHello();	
	}
	//compiler will confuse which method to pick
	public void sayHello() {
		A.super.sayHello();
	}
}
