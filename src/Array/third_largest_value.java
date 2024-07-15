package Array;

public class third_largest_value {
	public static void main(String[] args) {
//		int a[] = { 10, 17, 28, 35, 73, 2, 110, 30, 45, 240 };
		int a[] = { 10, -17, -28, -35, -73, 2, -110, 3, 5, -240 };
		int large = a[0];
		int second_large = 0;
		int third_large = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > large) {
				third_large = second_large;
				second_large = large;
				large = a[i];

			} else if (a[i] > second_large && a[i] != large) {
				third_large = second_large;
				second_large = a[i];

			} 
			else if (a[i] > third_large && a[i] != second_large) {

				third_large = a[i];
			}

		}
		System.out.println("Third Largest Value In The Array Is :" + third_large);
	}
}
