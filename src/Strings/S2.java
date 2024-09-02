package Strings;
//

//public class S2 {
//	public static void main(String[] args) {
////		int a = 4, b = 17, c = 9;
////		System.out.println(a>b?(a>c?:c):(b>c?b:c));
//	}
//}

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

	static boolean isPalindrome(String s, int start, int end) {
		                           //bcbc  1 3
		for (int i = start, j = end; i < j; i++, j--)//123  321
			if (s.charAt(i) != s.charAt(j))
				return false;
		return true;
	}

	public static int palindromeIndex(String s) {//bcbc
		int n = s.length();//4
		int start = -1, end = -1;

		StringBuilder sb=new StringBuilder();
		sb.isEmpty();
		
		for (int i = 0; i < n / 2; i++) {//i<2
			if (s.charAt(i) != s.charAt(n - 1 - i)) {//4-1-0
				start = i;//0
				end = n - 1 - i;//4-1-0=3
				break;
			}
		}

		if (start != -1) {
			if (isPalindrome(s, start + 1, end))//bcbc  1 3
				return start;
			else
				return end;
		}

		return -1;
	}

}

public class S2 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int q = Integer.parseInt(bufferedReader.readLine().trim());

		IntStream.range(0, q).forEach(qItr -> {
			try {
				String s = bufferedReader.readLine();

				int result = Result.palindromeIndex(s);

				bufferedWriter.write(String.valueOf(result));
				bufferedWriter.newLine();
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		bufferedReader.close();
		bufferedWriter.close();
	}
}
