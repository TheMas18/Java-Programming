package Java8.InterviewQuestions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q1 {

	
//Question 2: Find Duplicate Elements in a List using Java 8
	  public static void main(String[] args) {
	        List<Integer> list = Arrays.asList(1, 2, 3, 4, 2, 5, 3, 6);

	 
	        
	        Set<Integer> duplicates = list.stream()
	            .collect(Collectors.groupingBy(
	                Function.identity(),           // Group by the element itself (1, 2, 3, ...)
	                Collectors.counting()          // Count how many times each appears
	            ))
	            .entrySet().stream()               // Convert the map to a stream of entries
	            .filter(entry -> entry.getValue() > 1)  // Keep only those with count > 1
	            .map(Map.Entry::getKey)           // Get the number (not the count)
	            .collect(Collectors.toSet());     // Collect the result in a Set

	        System.out.println("Duplicate elements: " + duplicates);
	    }
	
// Find the First Non-Repeating Character in a String
	
//	public static void main(String[] args) {
//		String input = "aabbcdeff";
//
//		Optional<Character> result = input.chars() // Step 1: Convert string to stream of characters (as ints)
//				.mapToObj(c -> (char) c) // Step 2: Convert int to Character (wrapper class)
//				.collect(Collectors.groupingBy(Function.identity(), // Step 3: Group by character itself, like 'a', 'b'
//																	// etc.
//						LinkedHashMap::new, // Step 4: Use LinkedHashMap to keep insertion order
//						Collectors.counting() // Step 5: Count how many times each character appears
//				)).entrySet().stream() // Step 6: Get the entries (character → count)
//				.filter(entry -> entry.getValue() == 1) // Step 7: Only keep characters that appeared once
//				.map(Map.Entry::getKey) // Step 8: Get just the character
//				.findFirst(); // Step 9: Get the first one
//
//		if (result.isPresent()) {
//			System.out.println("First non-repeating character: " + result.get());
//		} else {
//			System.out.println("No non-repeating character found.");
//		}
//	}
}
