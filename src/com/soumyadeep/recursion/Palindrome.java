package com.soumyadeep.recursion;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palinCheck= "12321";
		System.out.println(isPalindrom(palinCheck, 0, palinCheck.length()-1));
	}
	
	public static boolean isPalindrom(String str,int first,int last){
		if(first==last){
			System.out.println(str);
			return true;
		}else if(str.charAt(first)!=str.charAt(last)){
			return false;
		}else{
			System.out.println(str);
			str=str.substring(first+1, str.length()-1);
			first=0;
			last= str.length()-1;
			return isPalindrom(str, first, last);
		}
	}

}
