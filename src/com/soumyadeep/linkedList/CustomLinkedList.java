package com.soumyadeep.linkedList;

public class CustomLinkedList {

	int value;
	CustomLinkedList next;
	int length;

	CustomLinkedList(int value) {
		this.value = value;
		this.next = null;
		this.length++;
	}

	public static void main(String args[]) {
		CustomLinkedList myLinkedList = new CustomLinkedList(10);

		/** Head is the pointer to the first node of the List */
		CustomLinkedList head = myLinkedList;
		System.out.println(myLinkedList.value);

		/**
		 * Tail is the pointer to the end of the List. Since there is only one
		 * node, so the first node is the last node.
		 */
		CustomLinkedList tail = head;

		/**
		 * Note if we change the value of head, the value of the first node
		 * changes too.
		 */
		head.value = 20;//
		System.out.println(myLinkedList.value);
		System.out.println(head.value);
		System.out.println(myLinkedList.length);
	}

}
