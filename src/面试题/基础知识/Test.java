/*
 * Test.java
 *
 *  Created on: 2016��4��28��
 *      Author: liuyan
 */

package ������.����֪ʶ;

import ������.Algorithm.Q087StackImplementByTwoQueues;
import ������.Algorithm.Q088QueueImplementByTwoStacks;

public class Test {
	public static void main(String[] args) {
//		Q088QueueImplementByTwoStacks queue = new Q088QueueImplementByTwoStacks();
//		queue.offer(1);
//		queue.offer(2);
//		queue.offer(3);
//		queue.offer(4);
//		queue.offer(5);
		
//		int i = 5;
//		while (i > 0) {
//			System.out.println(queue.poll());
//			i--;
//		}
		
		Q087StackImplementByTwoQueues stack = new Q087StackImplementByTwoQueues();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		int i = 4;
		while(i > 0) {
			try {
				System.out.println(stack.pop());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i--;
		}
	}
}
