package programming;

public class perfect_numb {
	public static void main(String[] args) {
		int n = 6;
		int sum = 0;// 6

		int i = 1;

		while (i <= n / 2) {
			if (n % i == 0) {
				sum = sum + i;
			}
			i++;
		}
		if (sum == n) {

			System.out.println(n + " is a perfect number.");
		} else

			System.out.println(n + " is not a perfect number.");
	}
}
