package ch06.ex15;

import java.util.HashSet;
import java.util.Set;

public class SieveOfErathostenes {
	public static void main(String[] args) {
		Set<Integer> primes = sieve(300);
		for (int prime : primes) {
			System.out.println(prime);
		}
	}
	
	public static Set<Integer> sieve(int n) {		
		Set<Integer> primes = new HashSet<>();
		for (int i = 2; i <= n; i++) {
			primes.add(i);
		}
		
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (primes.contains(i)) {
				for (int j = i * i; j <= n; j += i) {
					primes.remove(j);
				}
			}
		}
		
		return primes;		
	}
}
