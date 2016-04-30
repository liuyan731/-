/*
 * Q086GetMinStack.java
 *	����getMin()������ջ
 *  Created on: 2016��4��28��
 *      Author: liuyan
 */

package ������.Algorithm;

import java.util.Stack;

public class Q086GetMinStack {
	//˼·ʹ��һ������ջ��������СԪ��
	private Stack<Integer> stack;
	private Stack<Integer> minStack;
	
	public Q086GetMinStack() {
		stack = new Stack<>();
		minStack = new Stack<>();
	}
	
	public void push(int o) {
		stack.push(o);
		if(minStack.isEmpty() || o <= minStack.peek()) {//��֤��С��Ԫ����ջ��
			minStack.push(o);
		}
	}
	
	public boolean pop() {
		if(stack.isEmpty()) {
			return false;
		} else {
			//���ԭʼջ�е�ջ��Ԫ�ص���minStack��ջ��Ԫ�أ��򽫸�Ԫ�ص���
			if(minStack.peek().equals(stack.peek())) { //����ʹ��equals�ȽϺ���
				minStack.pop();
			}
			stack.pop();
			return true;
		}
	}
	
	public int getMin() {
		if(minStack.isEmpty()) {
			System.out.println("û����СԪ��");
			return -999;
		} else {
			return minStack.peek();
		}
	}
}
	