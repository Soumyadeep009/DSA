package com.soumyadeep.recursion;

public class FloodFill {

	public static int matrix[][]={{0,0,1,1,1,1,3,3,3,0},
			{0,1,1,0,0,0,0,3,2,2},
			{0,0,0,2,2,2,3,2,1,0},
			{0,1,1,2,2,1,1,3,1,0},
			{0,1,1,1,2,1,0,3,1,2},
			{1,0,0,2,2,0,0,0,0,0},
			{1,1,0,0,2,2,0,0,0,0},
			{1,0,0,2,2,2,0,1,0,2},
			{1,0,1,1,0,0,0,1,1,2},
			{1,0,1,1,1,0,1,2,2,2}};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(matrix[0].length);
		
		System.out.println("Original Matrix");
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		floodFillTheBoardWithColor(5, 3, 4, 2);
		
		System.out.println("FloodFilled Matrix");
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}

	}
	
	public static void floodFillTheBoardWithColor(int targetColor, int xPos,int yPos,int sourceColor){
		
		if(xPos>=0 && xPos<= matrix.length-1 && yPos>=0 && yPos<= matrix[0].length-1){
			if(matrix[xPos][yPos]==sourceColor){
				matrix[xPos][yPos]=targetColor;
				floodFillTheBoardWithColor(targetColor, xPos, yPos+1, sourceColor);//North
				floodFillTheBoardWithColor(targetColor, xPos-1, yPos, sourceColor);//West
				floodFillTheBoardWithColor(targetColor, xPos+1, yPos, sourceColor);//East
				floodFillTheBoardWithColor(targetColor, xPos, yPos-1, sourceColor);//South
			}
			else
				return;
		}
	}

}
