package Basic;

public class GCD {
	public static void main(String[] args) {

		System.out.println(findGCD(4, 8));
	}

	private static int findGCD(int a, int b) {
		if (a == 0) {
			return b;
		}
		return findGCD(b % a, a);
	}
}
