/*
 * Q089ReverseStackOrderByAnotherStack.java
 *	��������ͬ��ջA��B����ջA�д���ŴӴ�С������1,2,3,4,5��ջ��Ϊ��С��1������һ��ջBΪ�յġ�����Ҫ��ʹ�����������ݽṹ����ջA�е�����˳�򵹹�����ʹ��ջ������Ϊ���ֵ5��
 *  Created on: 2016��4��27��
 *      Author: liuyan
 */

package ������.Algorithm;

import java.util.Stack;

public class Q089ReverseStackOrderByAnotherStack {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(5);
		stack.push(4);
		stack.push(3);
		stack.push(2);
		stack.push(1);
		
		while (stack.size() != 0) {
			System.out.println(stack.pop());
		}
		
		
		stack.push(5);
		stack.push(4);
		stack.push(3);
		stack.push(2);
		stack.push(1);
		
		reverseStackOrderByAnotherStack(stack);
		
		while (stack.size() != 0) {
			System.out.println(stack.pop());
		}

	}
	
	/**
	 * ����������Ҫ��ջ������Сֵ1ȡ�����������ʱ����temp�У�Ȼ��ʣ�µ��ĸ�����2,3,4,5ת�Ƶ�ջB��ȥ���ٽ��ղŴ�
	 * ������ʱ�����е�1���뵽ջA�У����ջB�е�����ת�ƻص�ջA����ʱջA����һ����������õģ�����ջ�׵�1��Ȼ���ʣ���ջ�������ظ�������
	 * */
	public static void reverseStackOrderByAnotherStack(Stack<Integer> stack) {
		Stack<Integer> tmpStack = new Stack<>();
		int size = stack.size();
		for (int i = 0; i < size; i++) {
			int tmp = stack.pop();	//����ԭʼջ��ջ��Ԫ��
			while(stack.size() > i) { //�Ѿ����õ�Ԫ�ز���
				tmpStack.push(stack.pop());
			}
			stack.push(tmp);
			while(tmpStack.size() > 0) {
				stack.push(tmpStack.pop());
			}
		}
	}
}
