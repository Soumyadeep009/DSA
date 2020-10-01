package com.soumyadeep.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] array= {12,3,1,2,-6,5,-8,6};
		int[] array= {1, 2, 3};
		int targetSum= 6;
		List<Integer[]> answer = threeNumberSum(array, targetSum);
		for(Integer[] ar: answer){
			for(int i=0;i<ar.length;i++){
				System.out.print(ar[i]+ " ");
			}
			System.out.println();
		}
	}
	public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
	    // Write your code here.
		Arrays.sort(array);
		List<Integer[]> listOfTriplets= new ArrayList<>();
		for(int i = 0;i<array.length-2;i++){
			int leftPointer = i+1;
			int rightPointer= array.length-1;
			while(leftPointer<rightPointer){
				if(array[i] + array[leftPointer] + array[rightPointer] == targetSum){
					Integer[] tripleArray = {array[i],array[leftPointer],array[rightPointer]};
					listOfTriplets.add(tripleArray);
					leftPointer++;
					rightPointer--;
				}else if(array[i] + array[leftPointer] + array[rightPointer]<targetSum){
					leftPointer++;
				}else{
					rightPointer--;
				}
			}
		}
		return listOfTriplets;
	  }

}
