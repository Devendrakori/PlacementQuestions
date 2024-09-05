package com.mathematical;

public class PrimeNumber {

	public void checkPrime(int n) {
		int count = 0;
		for (int i = 2; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 1) {
			System.out.println("Number is prime.");
		} else
			System.out.println("Number is not prime..");
	}

	public boolean checkPrime2(int n) {
		boolean b = true;
		if (n == 0 || n == 1) {
			b = false;
			return b;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				b = false;
				break;
			}
		}
		return b;
	}

	public static void main(String[] args) {
		PrimeNumber pn = new PrimeNumber();
		pn.checkPrime(1);
		if (pn.checkPrime2(17)) {
			System.out.println("Number is prime.");
		} else
			System.out.println("Number is not prime");
	}
}
