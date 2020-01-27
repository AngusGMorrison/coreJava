package ch08.ex16;

import java.math.BigInteger;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BigPrimes {

	public static void main(String[] args) {
		sequentialPrimes();
		parallelPrimes();
		sequentialPrimes();
	}
	
	public static void parallelPrimes() {
		int bits = BigInteger.valueOf(10).pow(49).bitLength();
		Stream<BigInteger> primeStream = Stream.generate(() -> BigInteger.probablePrime(bits, new Random()));
		
		long start = System.currentTimeMillis();
		primeStream.parallel().limit(500).collect(Collectors.toList());
		long end = System.currentTimeMillis();
		System.out.println("Parallel: " + (end - start));
	}
	
	public static void sequentialPrimes() {
		int bits = BigInteger.valueOf(10).pow(49).bitLength();
		Stream<BigInteger> primeStream = Stream.generate(() -> BigInteger.probablePrime(bits, new Random()));
		
		long start = System.currentTimeMillis();
		primeStream.limit(500).collect(Collectors.toList());
		long end = System.currentTimeMillis();
		System.out.println("Sequential: " + (end - start));
	}

}
