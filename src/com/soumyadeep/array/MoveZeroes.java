package com.soumyadeep.array;

public class MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]={0,0,0,3,12};
		moveZeroes1(nums);
		
	}
	
	/**My Solution below O(N) with space O(1) but faster approach is below method */
	
	public static void moveZeroes(int[] nums) {
		int length= nums.length;
		int zeroCount=0;
		int currentZeroIndex=0;
		for(int i=0;i<length;i++){
			if(nums[i]==0){
				zeroCount++;
				currentZeroIndex=i;
			}
			if(zeroCount!=0 && nums[i]!=0){
				currentZeroIndex=i-zeroCount;
				nums[currentZeroIndex]=nums[i];
				nums[i]=0;
				currentZeroIndex++;
			}
		}
		System.out.print("[");
		for(int i=0;i<length-1;i++){
			System.out.print(nums[i]+",");
		}
		System.out.println(nums[length-1]+"]");
    }
	
	/**Solution below O(N) with space O(1) but faster approach is below method 
	 * Less the if block less time it takes.*/
	
	public static void moveZeroes1(int[] nums) {
		int length= nums.length;
		int currentZeroIndex=0;
		for(int i=0;i<length;i++){
			if(nums[i]!=0){
				nums[currentZeroIndex++]=nums[i];
			}
		}
		for(int i=currentZeroIndex;i<length;i++){
			nums[i]=0;
		}
		System.out.print("[");
		for(int i=0;i<length-1;i++){
			System.out.print(nums[i]+",");
		}
		System.out.println(nums[length-1]+"]");
    }


}
