package com.soumyadeep.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[]={9,2,5,8};
		int arr[]={9,8,7,6,5,4};
		sort(arr);
	}

	public static void sort(int arr[]){
		for(int i =0;i<arr.length;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]= arr[j+1];
					arr[j+1]=temp;
				}
			}
			
			/** Below loop displays the array after every iteration.
			 * The last element of the array after every iteration is the largest element of the remaining
			 * elements of the array.*/
			for(int k=0;k<arr.length;k++){
				System.out.print(arr[k]+" ");
			}
			System.out.println();
		}
		
	}
}
