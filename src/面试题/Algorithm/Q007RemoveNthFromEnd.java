/*
 * Q007RemoveNthFromEnd.java
 *	ɾ������ĵ�����n���ڵ�
 *  Created on: 2016��4��26��
 *      Author: liuyan
 */

package ������.Algorithm;

public class Q007RemoveNthFromEnd {
	public ListNode removeNthFromEnd2(ListNode head, int n) {
		ListNode newHead = new ListNode(-1);
		newHead.next = head;
		ListNode fast = newHead;
		ListNode slow = newHead;
		while(fast.next != null) {
			if(n <= 0) {
				slow = slow.next;
			}
			fast = fast.next;
			n--;
		}
		if(slow.next != null) {
			slow.next = slow.next.next;
		}
		return newHead.next;
	}
}
