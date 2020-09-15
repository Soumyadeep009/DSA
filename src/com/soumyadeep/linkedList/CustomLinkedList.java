package com.soumyadeep.linkedList;

public class CustomLinkedList {

	int value;
	CustomLinkedList next;
	int length;
	
	CustomLinkedList(int value) {
		this.value=value;
		this.next=null;
		this.length++;
	}
	
	public static void main(String args[]){
		CustomLinkedList myLinkedList = new CustomLinkedList(10);
		System.out.println(myLinkedList.value);
		System.out.println(myLinkedList.length);
	}

}
