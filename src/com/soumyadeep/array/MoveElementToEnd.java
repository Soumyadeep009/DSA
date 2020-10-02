package com.soumyadeep.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveElementToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> array = new ArrayList<Integer>(Arrays.asList(2, 1, 2, 2, 2, 3, 4, 2));
		int toMove = 2;
		array = moveElementToEnd(array, toMove);
		for(Integer i : array){
			System.out.print(i+ " ");
		}
	}
	
	public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
	    // Write your code here.
		
		int currentIndexOfNumberToBeMoved=0;
		for(int i=0;i<array.size();i++){
			if(array.get(i)!=toMove){
				array.set(currentIndexOfNumberToBeMoved++, array.get(i));
			}
		}
		for(int i=currentIndexOfNumberToBeMoved;i<array.size();i++){
			array.set(i, toMove);
		}

		return array;
	  }

}
