/*
 * StackImplementByTwoQueues.java
 *	ʹ����������ʵ��һ��ջ
 *  Created on: 2016��4��28��
 *      Author: liuyan
 */

package ������.Algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class Q087StackImplementByTwoQueues {
	private Queue<Integer> queue1;
	private Queue<Integer> queue2;
	public Q087StackImplementByTwoQueues() {
		queue1 = new LinkedList<>();
		queue2 = new LinkedList<>();
	}
	
	public void push(int o) { //push����ֻ�ڷǿյĶ����н���
		if(queue1.isEmpty() && queue2.isEmpty()) {
			queue1.offer(o);
		}
		if(!queue1.isEmpty()) {
			queue1.offer(o);
		} else if(!queue2.isEmpty()) {
			queue2.offer(o);
		}
	}
	
	public int pop() throws Exception { //���ǿն��е��е�����ת�Ƶ��ն����У��������һ����Ϊջpop��Ԫ��
		int ret = 0;
		if(queue1.isEmpty() && queue2.isEmpty()) {
			throw new Exception("ջΪ��");
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
