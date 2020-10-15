package com.soumyadeep.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PairProgram {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 5 };
		int sum = 9;
		//int[] found = HasPairThenReturnThePair(arr, sum);
		System.out.println(HasPairThenReturnTrueOrFalse2(arr, sum));
		/*if(found.length==0){
			System.out.println("Not Found");
		}else 
			System.out.println(found[0] + " " + found[1]);
		*/
	}
	
	public static boolean HasPairThenReturnTrueOrFalse(int arr[], int sum) {
		Set<Integer> complementSet = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			int comp = sum - arr[i];
			if (complementSet.contains(comp)) {
				return true;
			}
			complementSet.add(arr[i]);
		}
		return false;
	}
	public static boolean HasPairThenReturnTrueOrFalse2(int arr[], int sum) {
		Set<Integer> complementSet = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			int comp = sum - arr[i];
			if (complementSet.contains(arr[i])) {
				return true;
			}
			complementSet.add(comp);
		}
		return false;
	}
	 
	public static int[] HasPairThenReturnThePair(int nums[], int target) {
			boolean valid = true;
			int a[] = {};
			int k = 0;
			if (nums.length <= 1 && nums.length >= 100000) {
				valid = false;
			}
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] <= -1000000000 && nums[i] >= 1000000000) {
					valid = false;
					break;
				}
			}
			if (target <= -1000000000 && target >= 1000000000) {
				valid = false;
			}
	
			if (valid) {
				
				HashMap<Integer, Integer> complementMap = new HashMap<>(nums.length);
				for (int i = 0; i < nums.length; i++) {
					int comp = target - nums[i];
					if (complementMap.get(comp) != null) {
						a= new int[2];
						a[k] = complementMap.get(comp);
						k++;
						a[k] = i;
					}
					complementMap.put(nums[i], i);
				}
			}
	
			return a;
	}

}
