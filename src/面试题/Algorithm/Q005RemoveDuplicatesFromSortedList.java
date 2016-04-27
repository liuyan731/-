/*
 * Q005RemoveDuplicatesFromSortedList.java
 *	ɾ�������е��ظ��ڵ㣨ֻ����һ����
 *  Created on: 2016��4��26��
 *      Author: liuyan
 */

package ������.Algorithm;

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
