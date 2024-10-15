package Java8.Predicate;

import java.util.function.BiPredicate;

public class BiPredicateMain {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> biPredicate = (x, y) -> x % 2 == 0 && y % 2 == 0;
		System.out.println(biPredicate.test(2,4));
	}
}
