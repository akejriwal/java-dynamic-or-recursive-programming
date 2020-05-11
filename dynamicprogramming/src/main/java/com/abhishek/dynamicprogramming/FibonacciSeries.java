package com.abhishek.dynamicprogramming;

import java.math.BigInteger;

/**
 * 
 * @author Abhishek
 *
 */
public class FibonacciSeries 
{

	private BigInteger fibonacci(long n)
	{
		if(n <= 0)
		{
			return BigInteger.ZERO;
		}
		
		if(n == 1 || n == 2)
		{
			return BigInteger.ONE;
		}
		BigInteger out1 = BigInteger.ONE;
		BigInteger out2 = BigInteger.ONE;
		BigInteger out = BigInteger.ZERO;
		for(int i = 2; i<n; i++)
		{
			out = out1.add(out2);
			out2 = out1;
			out1 = out;
		}
		return out;
	}
	
	public static void main(String[] args) {
		BigInteger out = new FibonacciSeries().fibonacci(500);
		System.out.println(out);
	}

}
