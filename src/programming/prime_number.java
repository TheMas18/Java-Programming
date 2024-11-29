package programming;

public class prime_number {

	public static void main(String[] args) {
		// Find a numeber is prime or not
		// isPrime(5);

		// prime number for range
		// findInRange();

		// Method 2 : Another way to do it
//		int n = 20;
//		for (int i = 1; i <= n; i++) {
//			System.out.println(i+" " + (isPrime(i) ? "Is Prime" : "Not Prime"));
//		
//		}

		// an optimized way to find prime numbers till n
		/*
		 * if you see it clearly the prime numbers , lets say 2 . 
		 * 2 is prime number so their multiple should get cancel because they are not prime numbers ,
		 * same goes with other. to taking an boolean array and marking the prime numbers are
		 * false and numbers which are not make it true
		 * It is also called as Sieve of Eratosthenes
		 */
		int n = 40;
		boolean[] primes = new boolean[n + 1];
		sieve(n, primes);

	}

	// Find a number is prime or not
//	private static void isPrime(int n) {
//		int count = 0;
//		for (int i = 1; i <= n; i++) {
//			if (n % i == 0) {
//				count++;
//			}
//		}
//		if (count == 2) {
//			System.out.println(n + " is Prime No");
//		} else {
//			System.out.println(count);
//			System.out.println(n + " is Not Prime No");
//		}
//
//	}
	// prime number for range
//	private static void findInRange() {
//		int total = 0;
//		for (int n = 1; n <= 8; n++) {
//			int count = 0;
//			for (int i = 1; i <= n; i++) {
//				if (n % i == 0) {
//					count++;
//				}
//
//			}
//			if (count == 2) {
//				total++;
//				System.out.println(n + " is Prime No");
//			}
//		}
//		System.out.println("Total No Of Prime Numbers :" + total);
//
//	}

//Method 2 : Another way to do it 
//	private static boolean isPrime(int n) {
//		if (n <= 1) {
//			return false;
//		}
//		int c = 2;
//		while (c * c <= n) {
//			if (n % c == 0) {
//				return false;
//			}
//			c++;
//		}
//		return true;
//	}

	// an optimized way to find prime numbers till n
	private static void sieve(int n, boolean[] primes) {
		for(int i=2;i*i<=n;i++) {
			if(!primes[i]) {
				for(int j=i*2; j<=n;j+=i) {
					primes[j]=true;
				}
				
			}
			
		}
		
		for(int i=2;i<=n;i++) {
			if(!primes[i]) {
				System.out.print(i + " ");
			}
		}

	}

	
	
	
	
	
	
	
	
	
}
