/*
 * QueueImplementByTwoStacks.java
 *	ʹ������ջ��ʵ��һ������
 *  Created on: 2016��4��28��
 *      Author: liuyan
 */

package ������.Algorithm;

import java.util.Stack;

public class Q088QueueImplementByTwoStacks {
	// ʹ������ջ��ʵ��һ�����У�˼·���������ʹ��Stack1����ɣ�ɾ������ʹ��Satck2����Stack2Ϊ�յ�ʱ�򣬽�Stack1�����е�����ת�Ƶ�Stack2��
	private Stack<Integer> stack1;
	private Stack<Integer> stack2;

	public Q088QueueImplementByTwoStacks() {
		stack1 = new Stack<>();
		stack2 = new Stack<>();
	}

	public void offer(int o) { // ��Ӳ�����stack1�н���
		stack1.push(o);
	}

	public int poll() { // ���Ӳ���
		int ret = 0;
		if (!stack2.isEmpty()) { //��Ϊ�յ�ʱ��ֱ�ӵ���stack2��ջ��
			ret = stack2.pop();
		} else {  //Ϊ�յ�ʱ��stack1����������ת�Ƶ�stack2��
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
