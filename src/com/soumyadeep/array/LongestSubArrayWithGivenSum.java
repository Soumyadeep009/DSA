/**
 * 
 */
package com.soumyadeep.array;

/**
 * @author y0qtjag
 *
 *
 *Question:
 *Given an unsorted array A of size N of non-negative integers, 
 *find a continuous sub-array which adds to a given number S.

Input:
The first line of input contains an integer T denoting the number of test cases.
Then T test cases follow. Each test case consists of two lines.
The first line of each test case is N and S, where N is the size of array and S is the sum. The second line of each test case contains N space separated integers denoting the array elements.

Output:
For each testcase, in a new line, print the starting and ending positions(1 indexing) of first such occuring subarray from the left if sum equals to subarray, else print -1.

Constraints:
1 <= T <= 100
1 <= N <= 107
1 <= Ai <= 1010

Example:
Input:
2
5 12
1 2 3 7 5
10 15
1 2 3 4 5 6 7 8 9 10
Output:
2 4
1 5

Explanation :
Testcase1: sum of elements from 2nd position to 4th position is 12
Testcase2: sum of elements from 1st position to 5th position is 15
 */
public class LongestSubArrayWithGivenSum {
	public static void main(String args[]){
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		//int arr[] = {1,2,3,7,5};
		findLongestArrayHavingEqualSum(arr, 15);
	}
	
	public static void findLongestArrayHavingEqualSum(int nums[], int sum){
		
		int longestArrayLength=0;
		int fromIndex = -1;
		int toIndex=-1;
		int sumOfArray=0;
		for(int i=0;i<nums.length;i++){
			for(int j=i; j<nums.length;j++){
				sumOfArray = sumOfArray + nums[j];
				if(sumOfArray==sum){
					int current= j-i+1;
					if(current > longestArrayLength){
						longestArrayLength=j-i+1;
						fromIndex=i;
						toIndex=j;
					}
				}
			}
			sumOfArray=0;
		}
		if(longestArrayLength>0){
			System.out.println("sum of elements from "+(fromIndex+1)+" position to "+(toIndex+1)+" position is "+sum);
		}else{
			System.out.println("-1");
		}
	}
}
