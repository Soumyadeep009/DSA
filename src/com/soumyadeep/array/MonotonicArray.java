package com.soumyadeep.array;

public class MonotonicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] {-1, -5, -10, -1100, -1100, -1101, -1102, -9001}; // -- true
		//int[] array = new int[] {}; // -- true
		//int[] array = new int[] {1, 1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 8, 9, 10, 11}; //-- true
		//int[] array = new int[] {1,2,1}; // -- false
		System.out.println(isMonotonic(array));
	}
	
	public static boolean isMonotonic(int[] array) {
	    // Write your code here	
		if(array.length<=2){
			return true;
		}
		int nonIncreasingCount=0;
		int nonDecreasingCount=0;
		int zeroDifferenceCount=0;
		for(int i=1;i<array.length;i++){
			if(array[i-1]-array[i] > 0){
				nonIncreasingCount++;
			}else if(array[i-1]-array[i] == 0){
				zeroDifferenceCount++;
			}else{
				nonDecreasingCount++;
			}
		}	
		if((nonIncreasingCount==(array.length-1-zeroDifferenceCount) && nonDecreasingCount==0) || (nonIncreasingCount==0 && (nonDecreasingCount==array.length-1-zeroDifferenceCount))){
			return true;
		}
		else{
			return false;
		}
	  }

}
