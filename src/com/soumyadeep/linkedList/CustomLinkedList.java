package com.soumyadeep.linkedList;

public class CustomLinkedList {

	int value;
	CustomLinkedList next;

	CustomLinkedList(int value) {
		this.value = value;
		this.next = null;
	}

	/** add() method adds new node at the end of the LinkedList */
	public static CustomLinkedList add(CustomLinkedList list, int value) {
		while (list.next != null) {
			list = list.next;
		}
		CustomLinkedList newNode = new CustomLinkedList(value);
		list.next = newNode;
		return list;
	}

	/** prepend() method adds new node at the beginning of the LinkedList */

	public static CustomLinkedList prepend(CustomLinkedList list, int value) {
		CustomLinkedList newNode = new CustomLinkedList(value);
		newNode.next = list;
		return newNode;
	}

	/**
	 * insert() method adds new node at the a given position of the LinkedList.
	 * Position is always index+1. First node of a list has index=0 and
	 * position=1
	 */

	public static CustomLinkedList insert(CustomLinkedList list, int value, int position) {
		CustomLinkedList head = list;
		if (position > listLength(list)) {
			list = add(list, value);
		} else {
			CustomLinkedList newNode = new CustomLinkedList(value);
			int i = 1;
			while (i < position - 1) {
				list = list.next;
				i++;
			}
			newNode.next = list.next;
			list.next = newNode;
		}
		return head;
	}
	
	/** Deletes the last node of the LinkedList */
	public static CustomLinkedList deleteFromLast(CustomLinkedList list){
		CustomLinkedList head=list;
		if(list!=null){
			while(list.next.next!=null){
				list=list.next;
			}
			list.next=null;
		}
		return head;
	}

	
	/** listLength() method fetches the length of the LinkedList*/
	public static int listLength(CustomLinkedList list) {
		int length = 0;
		while (list != null) {
			length++;
			list = list.next;
		}
		return length;
	}

	public static void printList(CustomLinkedList myList) {
		if(myList!=null){
			while (myList.next != null) {
				System.out.print(myList.value + "->");
				myList = myList.next;
			}
			System.out.println(myList.value);
		}
	}

	public static void main(String args[]) {
		CustomLinkedList myLinkedList = new CustomLinkedList(10);

		/** Head is the pointer to the first node of the List */
		CustomLinkedList head = myLinkedList;
		// System.out.println(myLinkedList.value);

		/**
		 * Note if we change the value of head, the value of the first node
		 * changes too.
		 */
		/*
		 * head.value = 20; System.out.println(myLinkedList.value);
		 * System.out.println(head.value);
		 * System.out.println(myLinkedList.length);
		 */
		for (int i = 1; i <= 8; i++) {
			myLinkedList = add(head, i * 2);
		}
		printList(head);

		myLinkedList = prepend(head, 73);
		head = myLinkedList;
		printList(head);

		myLinkedList = insert(head, 74, 2);
		myLinkedList = insert(head, 75, 5);
		myLinkedList = insert(head, 74, 6);
		myLinkedList = insert(head, 1001, 99);
		head = myLinkedList;
		printList(head);
		
		myLinkedList = deleteFromLast(head);
		printList(myLinkedList);
		
	}

}
