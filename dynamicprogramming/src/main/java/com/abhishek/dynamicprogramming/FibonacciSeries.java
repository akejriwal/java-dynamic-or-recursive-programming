package com.abhishek.dynamicprogramming;

/**
 * 
 * @author Abhishek
 *
 */
public class FibonacciSeries 
{

	private long fibonacci(int n)
	{
		if(n <= 0)
		{
			return 0;
		}
		
		long output[] = new long[n];
		if(n == 1 || n == 2)
		{
			return 1;
		}
		output[0] = 1;
		output[1] = 1;
		for(int i = 2; i<n; i++)
		{
			output[i] = output[i-1] + output[i-2];
		}
		return output[n-1];
	}
	
	public static void main(String[] args) {
		long out = new FibonacciSeries().fibonacci(7);
		System.out.println(out);
	}

}
