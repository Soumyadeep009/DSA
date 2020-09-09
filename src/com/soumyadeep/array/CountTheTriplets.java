/**
 * 
 */
package com.soumyadeep.array;

import java.util.HashSet;

/**
 * @author y0qtjag
 * Given an array of distinct integers. The task is to count all the triplets such that sum of two elements equals the third element.

Input:
The first line of input contains an integer T denoting the number of test cases. 
Then T test cases follow. Each test case consists of two lines. 
First line of each test case contains an Integer N denoting size of array and the second line contains N space separated elements.

Output:
For each test case, print the count of all triplets, in new line. If no such triplets can form, print "-1".

Constraints:
1 <= T <= 100
3 <= N <= 105
1 <= A[i] <= 106

Example:
Input:
2
4
1 5 3 2
3
3 2 7
Output:
2
-1

Explanation:
Testcase 1: There are 2 triplets: 1 + 2 = 3 and 3 +2 = 5
 *
 */
public class CountTheTriplets {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,5,3,2};
		System.out.println(countThetriplets(arr));
	}
	
	public static int countThetriplets(int nums[]){
		HashSet<Integer> lookupSet=addToLookupTable(nums);
		int tripletCount=0;
		for(int i=0;i<nums.length;i++){
			for(int j=i+1;j<nums.length;j++){
				if(lookupSet.contains(nums[i]+nums[j])){
					tripletCount++;
				}
			}
		}
		return tripletCount>0?tripletCount:-1;
	}
	
	public static HashSet<Integer> addToLookupTable(int nums[]){
		HashSet<Integer> lookupSet=new HashSet<>();
		for(int num : nums){
			lookupSet.add(num);
		}
		return lookupSet;
	}

}
