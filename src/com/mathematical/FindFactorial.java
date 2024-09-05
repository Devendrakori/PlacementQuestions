package com.mathematical;

public class FindFactorial {

	public int showFact(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}

	public static void main(String[] args) {
		FindFactorial ff = new FindFactorial();
		System.out.println("Factorial of given numbe will be " + ff.showFact(5) + ".");
	}
}
