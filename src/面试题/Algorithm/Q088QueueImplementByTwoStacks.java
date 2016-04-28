/*
 * QueueImplementByTwoStacks.java
 *	使用两个栈来实现一个队列
 *  Created on: 2016年4月28日
 *      Author: liuyan
 */

package 面试题.Algorithm;

import java.util.Stack;

public class Q088QueueImplementByTwoStacks {
	// 使用两个栈来实现一个队列，思路：插入操作使用Stack1来完成，删除操作使用Satck2，当Stack2为空的时候，将Stack1中所有的数据转移到Stack2中
	private Stack<Integer> stack1;
	private Stack<Integer> stack2;

	public Q088QueueImplementByTwoStacks() {
		stack1 = new Stack<>();
		stack2 = new Stack<>();
	}

	public void offer(int o) { // 入队操作在stack1中进行
		stack1.push(o);
	}

	public int poll() { // 出队操作
		int ret = 0;
		if (!stack2.isEmpty()) { //不为空的时候直接弹出stack2的栈顶
			ret = stack2.pop();
		} else {  //为空的时候将stack1中所有数据转移到stack2中
			while(!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
			if(!stack2.isEmpty()) {
				ret = stack2.pop();
			}
		}
		return ret;
	}
}
