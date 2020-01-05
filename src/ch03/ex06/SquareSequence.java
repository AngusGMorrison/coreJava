package ch03.ex06;

import java.math.BigInteger;

public class SquareSequence implements Sequence<BigInteger> {
	private BigInteger i;
	
	public BigInteger next() {
		i.add(BigInteger.valueOf(1));
		return i;
	}
}
