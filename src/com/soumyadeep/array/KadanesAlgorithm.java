package com.soumyadeep.array;

/**
 * Given an array arr of N integers. Find the contiguous sub-array with maximum sum.

Input:
The first line of input contains an integer T denoting the number of test cases. The description of T test cases follows. The first line of each test case contains a single integer N denoting the size of array. The second line contains N space-separated integers A1, A2, ..., AN denoting the elements of the array.

Output:
Print the maximum sum of the contiguous sub-array in a separate line for each test case.

Constraints:
1 ≤ T ≤ 110
1 ≤ N ≤ 106
-107 ≤ A[i] <= 107

Example:
Input
2
5
1 2 3 -2 5
4
-1 -2 -3 -4
Output
9
-1

Explanation:
Testcase 1: Max subarray sum is 9 of elements (1, 2, 3, -2, 5) which is a contiguous subarray.
 * */


public class KadanesAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int num[]={1,2,3,-2,5};
		int num[]={-1,-2,-3,-4};
		System.out.println(maxSubArray1(num));
	}
	
	public static int maxSubArray1(int[] nums) {
		int arrLength=nums.length;
        int maxSum=0;
        if(arrLength!=0){
            int currMax = nums[0];
            maxSum = nums[0];
            for(int i=1;i<nums.length;i++){
                currMax = nums[i]>(currMax+nums[i])?nums[i]:(currMax+nums[i]);
                if(currMax>maxSum){
                    maxSum = currMax;
                }
            }   
        }
        return maxSum;
	}

}
