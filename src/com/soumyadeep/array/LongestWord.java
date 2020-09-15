package com.soumyadeep.array;

import java.util.HashMap;

public class LongestWord {
	
	class LongestWordData{
		int length;
		String word;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(LongestWord("hello world"));
	}
	
	public static String LongestWord(String sen) {
	    // code goes here  
		String[] wordArray= sen.trim().replaceAll("[^a-zA-Z0-9 ]", "").split(" ");
		String longestWordReturn=null;
		LongestWord lw=new LongestWord();
		LongestWord.LongestWordData data=lw.new LongestWordData();
		
		if(wordArray.length==1){
			return wordArray[0];
		}else if(wordArray.length >1){
			data.length= wordArray[0].length();
			data.word=wordArray[0];
			
			for(int i=0;i<wordArray.length;i++){
				if(wordArray[i].length()>data.length){
					data.length= wordArray[i].length();
					data.word=wordArray[i];
					longestWordReturn=data.word;
				}else if(wordArray[i].length()==data.length){
					longestWordReturn=data.word;
				}
			}
		}
	    return longestWordReturn;
	}
	
	public static String LongestWord1(String sen){
		String longestWord=null;
		if(sen.equals("") || sen != null){
			String[] wordArray= sen.trim().replaceAll("[^a-zA-Z0-9 ]", "").split(" ");
			longestWord=wordArray[0];
					for (int i = 1; i < wordArray.length; i++) {
						if (longestWord.length() < wordArray[i].length())
							longestWord = wordArray[i];
					}
		}
	    return longestWord;
	}

}
