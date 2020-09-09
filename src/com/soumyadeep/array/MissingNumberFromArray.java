/**
 * 
 */
package com.soumyadeep.array;

/**
 * @author y0qtjag
 * Given an array C of size N-1 and given that there are numbers from 1 to N with one element missing, the missing number is to be found.

Input:
The first line of input contains an integer T denoting the number of test cases. For each test case first line contains N(size of array). The subsequent line contains N-1 array elements.

Output:
Print the missing number in array.

Constraints:
1 ≤ T ≤ 200
1 ≤ N ≤ 107
1 ≤ C[i] ≤ 107

Example:
Input:
2
5
1 2 3 5
10
1 2 3 4 5 6 7 8 10

Output:
4
9

Explanation:
Testcase 1: Given array : 1 2 3 5. Missing element is 4.
 */
public class MissingNumberFromArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]={1,9,3,4,5,6,7,8,10};
		//int nums[]={1,2,3,5};
		
		System.out.println(findMissingNumber(nums,nums.length+1));
	}
	
	public static int findMissingNumber(int nums[],int originalArrayLength){
		
		int sumOfSeries = originalArrayLength*(originalArrayLength+1)/2;
		int sumOfArray = 0;
		for(int i=0;i<nums.length;i++){
			sumOfArray=sumOfArray+nums[i];
		}
		
		return sumOfSeries-sumOfArray;
	}

}
