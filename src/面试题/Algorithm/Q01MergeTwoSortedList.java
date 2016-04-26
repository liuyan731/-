/*
 * MergeTwoSortedList.java
 *  �ϲ�������������
 *  Created on: 2016��4��11��
 *      Author: liuyan
 */

package ������.Algorithm;

public class Q01MergeTwoSortedList {
	public ListNode merge(ListNode l1, ListNode l2) {
		if(l1 == null) {
			return l2;
		} else if(l2 == null) {
			return l1;
		} else {
			ListNode ret;
			if(l1.val < l2.val) {
				ret= l1;
				ret.next = merge(l1.next, l2); 
			} else {
				ret = l2;
				ret.next = merge(l1, l2.next);
			}
			return ret;
		}
	}
	
	class ListNode {
		int val;
		ListNode next;
		public ListNode(int x) {
			this.val = x;
		}
	}
}

