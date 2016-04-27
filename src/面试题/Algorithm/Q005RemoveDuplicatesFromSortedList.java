/*
 * Q005RemoveDuplicatesFromSortedList.java
 *	删除链表中的重复节点（只保留一个）
 *  Created on: 2016年4月26日
 *      Author: liuyan
 */

package 面试题.Algorithm;

public class Q005RemoveDuplicatesFromSortedList {
	public ListNode removeDuplicatesFromSortedList(ListNode L) {
		if(L == null) {
			return L;
		} else {
			ListNode p = L;
			ListNode q = L.next;
			while(q != null) {
				if(p.val == q.val) {
					p.next = q.next;
					q = q.next;
				} else {
					p = p.next;
					q = q.next;
				}
			}
			return L;
		}
	}
}
