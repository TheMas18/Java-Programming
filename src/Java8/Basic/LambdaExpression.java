package Java8.Basic;

import java.util.function.BiConsumer;

public class LambdaExpression {
	
	   // Normal method
    public void sayHello(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        // Creating an instance of LambdaExample
    	LambdaExpression example = new LambdaExpression();

        // Calling the normal method
        example.sayHello(5, 3);  // Output: 8

        // Using a lambda expression to print "Hello World"
        Runnable helloWorldLambda = () -> {
            System.out.println("Hello World");
        };
        
        BiConsumer<Integer, Integer> sumLambda= (a,b)-> System.out.println(a + b);
        // Calling the lambda expression
        helloWorldLambda.run();  // Output: Hello World
        sumLambda.accept(5, 3); // Output: 8
        
        int a=7;
        int b=20;
        
        a=a^b;
        b=b^a;
        a=a^b;
        System.out.println(a+" "+b);
    }
}
