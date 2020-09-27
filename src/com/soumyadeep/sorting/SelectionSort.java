package com.soumyadeep.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[]={9,8,7,6,5,4};
		sort(arr);
	}
	
	/** Every Iteration the minimum element of the array is brought into the first index of the array */
	public static void sort(int a[]){
		int length= a.length;
		int minIndex=0;
		for(int i=0;i<length;i++){
			minIndex=i;
			for(int j=i+1;j<length;j++){
				if(a[minIndex]>a[j]){
					minIndex=j;
				}
			}
			int temp=a[i];
			a[i]=a[minIndex];
			a[minIndex]=temp;

			for(int k=0;k<length;k++){
				System.out.print(a[k]);
			}
			System.out.println();
		}
	}

}
