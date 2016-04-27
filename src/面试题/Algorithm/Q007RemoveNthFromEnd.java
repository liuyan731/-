/*
 * Q007RemoveNthFromEnd.java
 *	删除链表的倒数第n个节点
 *  Created on: 2016年4月26日
 *      Author: liuyan
 */

package 面试题.Algorithm;

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
