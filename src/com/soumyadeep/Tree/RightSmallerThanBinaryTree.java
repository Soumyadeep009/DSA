package com.soumyadeep.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RightSmallerThanBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> input = new ArrayList<Integer>(Arrays.asList(8,5,11,-1,3,4,2));
		List<Integer> output = rightSmallerThan(input);
		for(Integer i: output){
			System.out.print(i+ " ");
		}
	}

	public static List<Integer> rightSmallerThan(List<Integer> array) {
		// Write your code here.
		List<Integer> output = new ArrayList<>(Collections.nCopies(array.size(), 0));
		for(int i=0;i<array.size();i++){
			for(int j =i; j<array.size();j++ ){
				if(array.get(j)<array.get(i)){
					output.set(i,output.get(i)+1);
				}
			}
		}
		return output;
	}

}
