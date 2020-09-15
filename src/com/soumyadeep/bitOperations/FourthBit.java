package com.soumyadeep.bitOperations;

public class FourthBit {

	static boolean LeastSignificantBit(int num) {
		boolean x = (num & (1 << (3))) != 0;
		return (x);
	}

	public static void main(String[] args) {
		int num = 77;
		if (LeastSignificantBit(num))
			System.out.println("1");
		else
			System.out.println("0");
	}

}
