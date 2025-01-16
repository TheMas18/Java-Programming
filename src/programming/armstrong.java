package programming;

public class armstrong {

	public static int CountD(int n) {
		int count = 0;
		while (n != 0) {
			count++;
			n = n / 10;
		}
		return count;
	}

	public static int power(int d, int count) {
		int fact = 1;
		for (int i = 1; i <= count; i++) {
			fact = fact * d;
		}
		return fact;
	}

	public static void main(String[] args) {
		int n = 153;
		int temp = n;
		int count = CountD(n);
		int sum = 0;

		while (n != 0) {

			int d = n / 10;

			sum = sum + power(d, count);
		}
		if (sum == n) {
			System.out.println("Given Num is Armstrong number" + sum);
		} else {
			System.out.println("Is not a armstrong number");
		}
	}
}