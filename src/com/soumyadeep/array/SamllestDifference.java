package com.soumyadeep.array;

import java.util.Arrays;

public class SamllestDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayOne= {-1, 5, 10, 20, 28, 3};
		int[] arrayTwo= {26, 134, 135, 15, 17};
		int[] closestPair= smallestDifference(arrayOne, arrayTwo);
		System.out.println(closestPair[0]+" "+closestPair[1]);
	}
	
	public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
	    // Write your code here.
		Arrays.sort(arrayOne);
		Arrays.sort(arrayTwo);
		int firstArrayPointer= 0;
		int secondArrayPointer= 0;
		int currentMinimumDifference=999999999;
		int[] closestPairToZero= new int[2];
		while(firstArrayPointer < arrayOne.length && secondArrayPointer < arrayTwo.length){
			int absoluteDifference= Math.abs(arrayOne[firstArrayPointer] - arrayTwo[secondArrayPointer]);
			if(absoluteDifference < currentMinimumDifference){
				currentMinimumDifference = absoluteDifference;
				closestPairToZero[0]=arrayOne[firstArrayPointer];
				closestPairToZero[1]=arrayTwo[secondArrayPointer];
			}
			if(arrayOne[firstArrayPointer]<=arrayTwo[secondArrayPointer]){
				firstArrayPointer++;
			}else{
				secondArrayPointer++;
			}
		}
		
	    return closestPairToZero;
	  }

}

