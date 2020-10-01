package com.soumyadeep.array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ValidSequenceCheck {

	public static void main(String[] args) {
		List<Integer> array=new ArrayList<>();// [5,1];
		array.add(5);
		array.add(1);
		array.add(22);
		array.add(25);
		array.add(6);
		array.add(-1);
		array.add(8);
		array.add(10);
		
		List<Integer> sequence = new ArrayList<>();
		sequence.add(1);
		sequence.add(6);
		sequence.add(-1);
		sequence.add(10);
		
		System.out.println(isValidSubsequence(array, sequence));

	}
	public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
	    // Write your code here.
			LinkedList<Integer> arrayList= new LinkedList<>(array);
			LinkedList<Integer> sequenceList = new LinkedList<>(sequence);
			int sequenceCount=0;
			int sequenceListSize= sequenceList.size();
			while(!arrayList.isEmpty() && !sequenceList.isEmpty()){
				if(arrayList.peekFirst() == sequenceList.peekFirst()){
					sequenceCount++;
					sequenceList.removeFirst();
				}
				arrayList.removeFirst();
			}
			return sequenceCount==sequenceListSize ? true:false;
	}

}
