/*
 * Q089ReverseStackOrderByAnotherStack.java
 *	有两个相同的栈A和B，在栈A中存放着从大到小的数：1,2,3,4,5，栈顶为最小数1，另外一个栈B为空的。现在要求不使用其他的数据结构，将栈A中的数字顺序倒过来，使其栈顶的数为最大值5。
 *  Created on: 2016年4月27日
 *      Author: liuyan
 */

package 面试题.Algorithm;

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
	 * 我们首先需要将栈顶的最小值1取出来存放在临时变量temp中，然后将剩下的四个数字2,3,4,5转移到栈B中去，再将刚才存
	 * 放在临时变量中的1插入到栈A中，最后将栈B中的数字转移回到栈A，此时栈A中有一个书是排序好的，就是栈底的1。然后对剩余的栈中数据重复操作。
	 * */
	public static void reverseStackOrderByAnotherStack(Stack<Integer> stack) {
		Stack<Integer> tmpStack = new Stack<>();
		int size = stack.size();
		for (int i = 0; i < size; i++) {
			int tmp = stack.pop();	//保存原始栈的栈顶元素
			while(stack.size() > i) { //已经逆置的元素不动
				tmpStack.push(stack.pop());
			}
			stack.push(tmp);
			while(tmpStack.size() > 0) {
				stack.push(tmpStack.pop());
			}
		}
	}
}
