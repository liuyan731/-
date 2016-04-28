/*
 * Q086GetMinStack.java
 *	含有getMin()方法的栈
 *  Created on: 2016年4月28日
 *      Author: liuyan
 */

package 面试题.Algorithm;

import java.util.Stack;

public class Q086GetMinStack {
	//思路使用一个辅助栈来保存最小元素
	private Stack<Integer> stack;
	private Stack<Integer> minStack;
	
	public void push(int o) {
		stack.push(o);
		if(minStack.isEmpty() || o <= minStack.peek()) {//保证最小的元素在栈顶
			minStack.push(o);
		}
	}
	
	public boolean pop() {
		if(stack.isEmpty()) {
			return false;
		} else {
			if(minStack.peek() == stack.peek()) {	//如果原始栈中的栈顶元素等于minStack的栈顶元素，则将该元素弹出
				minStack.pop();
			}
			stack.pop();
			return true;
		}
	}
	
	public int getMin() {
		if(minStack.isEmpty()) {
			System.out.println("没有最小元素");
			return -999;
		} else {
			return minStack.peek();
		}
	}
}
	