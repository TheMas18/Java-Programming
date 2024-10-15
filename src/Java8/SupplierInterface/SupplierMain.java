package Java8.SupplierInterface;

import java.util.function.Supplier;

public class SupplierMain {
	public static void main(String[] args) {
		Supplier<Integer> supplier=()->1;
		System.out.println(supplier.get());
	}
}
