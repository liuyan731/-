/*
 * SwapNodesInList.java
 *  �������е����������ڵ㻥��
 *  Created on: 2016��4��11��
 *      Author: liuyan
 */

package ������.Algorithm;

public class Q02SwapNodesInList {
	public ListNode swapNodes(ListNode node) {
		if(node == null || node.next == null) {
			return node;
		} else {
			ListNode ret = node.next;
			ListNode tmp = ret.next;
			ret.next = node;
			node.next = swapNodes(tmp);
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
