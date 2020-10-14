package com.soumyadeep.stacks;

import java.util.Stack;

public class MyStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack ms = new MyStack();
		ms.push(8);
		ms.push(9);
		ms.push(1);
		System.out.println(ms.getMin());
		System.out.println(ms.pop());
		System.out.println(ms.getMin());
	}

	int minEle;
	Stack<Integer> s;

	public MyStack() {
		s = new Stack<>();
	}

	int getMin() {
		return minEle;
	}

	int pop() {
		if (s.isEmpty())
			return -1;
		int top = s.pop();
		if (top < minEle) {
			int currentMin = minEle;
			minEle = 2 * minEle - top;
			return currentMin;
		} else {
			return top;
		}
	}

	void push(int x) {
		if (s.isEmpty()) {
			minEle = x;
			s.push(x);
		} else if (x >= minEle) {
			s.push(x);
		} else {
			s.push(2 * x - minEle);
			minEle = x;
		}
	}

}
