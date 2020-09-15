package com.soumyadeep.recursion;

public class NumberReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(123,0));
	}
	
	public static int reverse(int num,int rev){
		
		if(num >0){
			reverse(num/10,rev);
			rev=rev + num%10*10;
		}
		return rev;
	}

}
