/*
 * StackImplementByTwoQueues.java
 *	使用两个队列实现一个栈
 *  Created on: 2016年4月28日
 *      Author: liuyan
 */

package 面试题.Algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class Q087StackImplementByTwoQueues {
	private Queue<Integer> queue1;
	private Queue<Integer> queue2;
	public Q087StackImplementByTwoQueues() {
		queue1 = new LinkedList<>();
		queue2 = new LinkedList<>();
	}
	
	public void push(int o) { //push操作只在非空的队列中进行
		if(queue1.isEmpty() && queue2.isEmpty()) {
			queue1.offer(o);
		}
		if(!queue1.isEmpty()) {
			queue1.offer(o);
		} else if(!queue2.isEmpty()) {
			queue2.offer(o);
		}
	}
	
	public int pop() throws Exception { //将非空队列的中的数据转移到空队列中，留下最后一个作为栈pop的元素
		int ret = 0;
		if(queue1.isEmpty() && queue2.isEmpty()) {
			throw new Exception("栈为空");
		} else {
			if(queue2.isEmpty()) {
				while(queue1.size() > 1) {
					queue2.offer(queue1.poll());
				}
				ret = queue1.poll();
			} else if(queue1.isEmpty()) {
				while(queue2.size() > 1) {
					queue1.offer(queue2.poll());
				}
				ret = queue2.poll();
			}
		}
		return ret;
	}
}
