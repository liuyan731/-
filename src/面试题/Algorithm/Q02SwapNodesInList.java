/*
 * SwapNodesInList.java
 *  将链表中的相邻两个节点互换
 *  Created on: 2016年4月11日
 *      Author: liuyan
 */

package 面试题.Algorithm;

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
