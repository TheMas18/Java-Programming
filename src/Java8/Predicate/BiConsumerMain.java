package Java8.Predicate;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BiConsumerMain {
	public static void main(String[] args) {
		Consumer<Integer> consumer = (x) -> System.out.println(x);

		consumer.accept(10);

		BiConsumer<Integer, Integer> biConsumer = (x, y) -> {
			System.out.println(x + y);
		};

		biConsumer.accept(1, 2);
	}
}
