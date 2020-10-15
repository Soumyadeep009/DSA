package com.soumyadeep.array;

public class MaxProfitAfterBuySell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] stock={10, 7, 5, 8, 11, 9}; 
		int[] stock1={2, 3, 10, 6, 1, 14, 1}; 
		int[] stock2={100, 180, 260, 310, 40, 535, 695}; 
		System.out.println(findMaxProfit(stock2));
	}
	
	public static int findMaxProfit(int stock[]){
		int stockSpan= stock.length;
		int maxProf= 0;
		int currentMin=stock[0];
		int currentMax=stock[0];
		boolean bought=false;
		boolean sold= false;
		for(int i=0;i<stockSpan-1;i++){
			if(!bought){
				if(stock[i]>stock[i+1])
					continue;
				else{
					currentMin=stock[i];
					bought=true;
					sold=false;
				}
			}
			if(bought && !sold){
				if(stock[i]<stock[i+1] && i!=stockSpan-2)
					continue;
				else{
					currentMax=stock[i];
					bought=false;
					sold=true;
				}
				maxProf = (currentMax - currentMin) >  maxProf ? (currentMax - currentMin):maxProf;
			}
		}
		return maxProf;
	}

}
