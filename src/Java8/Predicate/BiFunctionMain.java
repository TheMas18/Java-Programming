package Java8.Predicate;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionMain {
	public static void main(String[] args) {
		Function<String, Integer> function = str -> str.length();

		BiFunction<String, String, Integer> biFunc = (x, y) -> x.length() + y.length();

		System.out.println("Function : " + function.apply("Mas"));
		System.out.println("Bi Function for 2 parameters" + biFunc.apply("Mas", "Op"));
	}
}
