/*
 * Q005RemoveDuplicatesFromSortedList2.java
 *	删除链表中的重复节点（一个都不保留）
 *  Created on: 2016年4月26日
 *      Author: liuyan
 */

package 面试题.Algorithm;

public class Q006RemoveDuplicatesFromSortedList2 {
	public ListNode removeDuplicatesFromSortedList(ListNode L) {
		ListNode head = new ListNode(-1);
		head.next = L;
		ListNode p = head;
		ListNode q = head.next;
		ListNode n = head.next.next;
		int val = -1;
		while(n != null) {
			if(q.val == n.val) {
				val = q.val;
				while(q != null) {
					if(q.val == val) {
						p.next = q.next;
						q = q.next;
						n = n.next;
					} else {
						val = -1;
						break;
					}
				}
			} else {
				p = p.next;
				q = q.next;
				n = n.next;
				val = -1;
			}
		}
		
		if(p.next.val == val) {
			p.next = p.next.next;
		}
		return null;
	}
}
