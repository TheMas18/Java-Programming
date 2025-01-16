package Java8.Basic;

import java.util.Arrays;
import java.util.List;

public class MethodReference {

	public static void print(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		List<String> students = Arrays.asList("Alice", "Bob", "Charlie");
//		students.forEach(x -> System.out.println(x));
		students.forEach(MethodReference::print);// This is method reference operatior className::Name Of Method
	}
}
