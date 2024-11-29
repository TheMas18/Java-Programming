package DSA;

public class BitManipulation {

	public static void main(String[] args) {

		// Given Number odd or even
//		int n=3;
//		System.out.println(isOdd(n) ?"Odd":"Even");

		// Find Unique
//		int arr[]= {1,1,2,3,4,5,5,4,3,7,2};
//		System.out.println(findUnique(arr));

		// Magic Number
//		int n = 6;
//		System.out.println(findMagicNumber(n));

		// No of Digits
//		int n=34567;
//		int b=10;
//		int ans=(int)(Math.log(n)/Math.log(b)) +1;
//		System.out.println(ans);

		// ith bit of no
//		int num = 182; // Binary: 1101
//		int n = 2; // We want the 2nd bit (0-indexed from the right)
//
//		int nthBit = findNthBit(num, n);
//		System.out.println("The " + n + "th bit of " + num + " is: " + nthBit);

		// find if number is power of 2

//		int n = 17;
//		System.out.println(powerOf2(n));

		// calculate a^b

//		int base = 2;
//		int power = 4;
//		System.out.println(calculatePowerOfa(base, power));

		// find xor of nunber from 0 to a
		for (int a = 0; a <= 10; a++) {
			System.out.println("XOR(0 to " + a + ") = " + xorFromZeroToA(a));
		}
	}

	private static boolean isOdd(int n) {
		return (n & 1) == 1;
	}

	private static int findUnique(int[] arr) {
		int unique = 0;
		for (int n : arr) {
			unique ^= n;
		}

		return unique;
	}

	// Magic Number
	private static int findMagicNumber(int n) {
		int ans = 0;
		int base = 5;
		while (n > 0) {
			int last = n & 1;
			n = n >> 1;
			ans += base * last;
			base = base * 5;
		}
		return ans;
	}

	// find ith bit of a no
	private static int findNthBit(int num, int n) {
		return (num >> n) & 1;
	}

	// toggle ith bit
	private static int toggleIthBit(int num, int i) {
		int mask = 1 << i; // Create a mask with a `1` at the i-th position
		return num ^ mask; // XOR the number with the mask to toggle the bit
	}

	// find if number is power of 2

	private static boolean powerOf2(int n) {
		return (n & (n - 1)) == 0;
	}

	// calculate a^b

	private static int calculatePowerOfa(int base, int power) {
		int ans = 1;
		while (power > 0) {
			if ((power & 1) == 1) {
				ans *= base;
			}

			base *= base;

			power = power >> 1;
		}
		return ans;
	}

	// find xor of number from 0 to a
	public static int xorFromZeroToA(int a) {
		if (a % 4 == 0)
			return a;
		else if (a % 4 == 1)
			return 1;
		else if (a % 4 == 2)
			return a + 1;
		else
			return 0;
	}

}
