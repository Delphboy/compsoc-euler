import java.util.ArrayList;

public class Euler010 {
	public static void main(String[] args) {
		boolean isPrime;
		long total = 0;
		ArrayList<Integer> listOfPrimes = new ArrayList();
		listOfPrimes.add(2);
		
		for (int i = 3; i < 2000000; i++) {
			isPrime = true;
			
			if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0){
				isPrime = false;
				continue;
			}
			
			for (int primes : listOfPrimes) {
				if (i % primes == 0) {
					isPrime = false;
					break;
				}
				if (primes > Math.sqrt(i)) {
					break;
				}
			}
			
			if (isPrime) {
				listOfPrimes.add(i);
			}
		}
		
		for (int prime : listOfPrimes) {
			total += prime;
		}
		System.out.println("Sum of primes bellow 2000000: " + total);
	}
}
