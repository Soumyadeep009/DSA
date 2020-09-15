package com.soumyadeep.recursion;

public class Permutation {
	

	//Driver Code 
	public static void main(String[] args) 
	{ 
		int exp=5;
		int num=2;
		System.out.println(power(num,exp));
	} 
	
	public static int power(int num,int exp){
		if(exp==0){
			return 1;
		}else{
			if(exp%2==0){
				return 	power(num,exp/2) * power(num, exp/2);
			}else
				return 	power(num,exp/2) * power(num, exp/2)* num;
				
		}
	}
}

