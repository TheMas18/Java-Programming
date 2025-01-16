package Java8.Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UseComparator {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
//		Collections.sort(list,new MyClass());
		Collections.sort(list, (a, b) -> b - a);
		System.out.println(list);

	}
}

class MyClass implements Comparator<Integer> {

	public int compare(Integer a, Integer b) {
		return b - a; // descending order
	}
}