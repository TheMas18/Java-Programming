package Java8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LearnStreams {
	/**
	 * 
	 * Sequence of elements that we get from converting arrays or collections into
	 * streams so that we can perform declarative and fucntional programming
	 * 
	 **/

	public static void main(String[] args) {
		// this is an imperative approach
//		int [] arr= {1,2,3,4,5};
//		int sum=0;
//		
//		for (int i = 0; i < arr.length; i++) {
//			if(arr[i]%2==0) {
//				sum+=arr[i];
//			}
//		}
//		
//		//now lets see declarative approach
//		int [] arr2= {1,2,3,4,5};
//		 Arrays.stream(arr2).filter(n->n%2==0);

		// How to create Stream

		/*
		List<String> list = Arrays.asList("apple", "banana", "cherry");

		// convert collection to stream

		Stream<String> stream = list.stream();

		// convert array to stream;

		String[] arr = { "apple", "banana", "cherry" };

		Stream<String> arrayStream = Arrays.stream(arr);

		// we can convert directly also
		Stream<Integer> direct = Stream.of(1, 2, 3, 4);

		// we can do it using iterator also.
		// generate values in range
		// first arg is seed . as we used 0 it means start from 0 and go till the limit.
		// if we dont use limit it will create inifinte stream

		Stream<Integer> limit = Stream.iterate(0, n -> n + 1).limit(20);

		// this is also another way to generate.
		// hello will be generated till the limit we mentioned
		Stream<String> limit2 =  Stream.generate(() -> "hello").limit(5);
			
		*/
		/*
		 * // Streams Operations
		 * 
		 * List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 5, 6);
		 * 
		 * List<Integer> evenNumber =
		 * list.stream().filter(x->x%2==0).collect(Collectors.toList());
		 * 
		 * System.out.println(evenNumber);
		 * 
		 * List<Integer> mappedList =
		 * evenNumber.stream().map(x->x/2).collect(Collectors.toList());
		 * 
		 * System.out.println(mappedList);
		 * 
		 * // we can do something like this also
		 * 
		 * List<Integer> filteredList = list.stream().filter(x -> x % 2 == 0).map(x -> x
		 * / 2).collect(Collectors.toList());
		 * 
		 * System.out.println(filteredList);
		 * 
		 * //we can use distinct to remove duplicates 
		 * //we can use sorted to make it sort 
		 * //we can pass a comparator to sort it in descending order 
		 * //if we want 2  elements we limit it 
		 * //limit is like how many elements you want from start
		 * // skip means how many element you want to skip from start 
		 * 
		 * List<Integer> list2 =  Arrays.asList(1, 2, 3, 4, 5, 5, 6,0,0,10,2,2,5,9,8,8);
		 * 
		 * List<Integer> filteredList2 = list2.stream() .filter(x -> x % 2 == 0) .map(x
		 * -> x / 2) .distinct() .sorted((a,b)->b-a) .limit(5) .skip(2)
		 * .collect(Collectors.toList());
		 * 
		 * System.out.println(filteredList2);
		 * 
		 * List<Integer> collect1 = Stream .iterate(0, x->x+1) .limit(101) .skip(1)
		 * .filter(x->x%2==0) .map(x->x/10) .distinct() .peek(x->System.out.print(x))
		 * .collect(Collectors.toList());
		 *  System.out.println(collect1);
		 * 
		 * //min max and count 
		 * Integer integer = Stream .iterate(0, x->x+1) .limit(101)
		 * .map(x->x/20) .distinct() .peek(x->System.out.print(x)) .max((a,b)->a-b)
		 * .get(); System.out.println(integer);
		 * 
		 * List<Integer> list=Arrays.asList(1,2,3,4,5,6,7); Integer integer1 =
		 * list.stream().max((a,b)->b-a).get(); Integer integer2 =
		 * list.stream().min((a,b)->a-b).get(); long integer3 = list.stream().count();
		 * System.out.println(integer1); System.out.println(integer2);
		 * System.out.println(integer3);
		 * 
		 * //These are terminal operations
		 */
	
	}
}
