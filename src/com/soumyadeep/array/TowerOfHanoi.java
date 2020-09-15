package com.soumyadeep.array;

public class TowerOfHanoi {

	public static void main(String[] args) {
		printTower(3,"A","C","B");
	}
	
	public static void printTower(int numOfDisk, String fromTower,String toTower, String auxTower){
		if(numOfDisk == 1){
			System.out.println("Move disk "+numOfDisk+" from "+fromTower +" -> "+ toTower);
		}else{
			printTower(numOfDisk-1,fromTower,auxTower,toTower);
			System.out.println("Move disk "+(numOfDisk)+" from "+fromTower +" -> "+ toTower);
			printTower(numOfDisk-1,auxTower,toTower,fromTower);
		}
	}

}
