package com.soumyadeep.array;

public class MergeTwoArrays {

	public static void main(String[] args) {
		int a[]={0,3,4,31};
		int b[]={4,6,30};
		System.out.println();
		int c[]= mergeTwoArrays(a,b);
		for(int i=0; i<c.length;i++){
			System.out.print(c[i]+" ");
		}
	}
	
	public static int[] mergeTwoArrays(int[] a, int[] b){
		
		int resultantLength = a.length + b.length;
		int mergedArray[] = new int[resultantLength];
		
		int aIndex=0,bIndex=0,resultIndex=0;
		while(aIndex<a.length && bIndex<b.length){
			if(a[aIndex] <= b[bIndex]){
				mergedArray[resultIndex++] = a[aIndex++];
			}else
				mergedArray[resultIndex++] = b[bIndex++];
		}
		while(aIndex<a.length){
			mergedArray[resultIndex++] = a[aIndex++];
		}
		while(bIndex<b.length){
			mergedArray[resultIndex++] = b[bIndex++];
		}
		return mergedArray;
	}

}
