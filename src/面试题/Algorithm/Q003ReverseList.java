/*
 * ReverseList.java
 *  �͵���������
 *  Created on: 2016��4��12��
 *      Author: liuyan
 */

package ������.Algorithm;

public class Q003ReverseList {
	
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		
		node1 = reverse(node1);
//		node1 = reverse2(node1, null);
		
		while(node1 != null) {
			System.out.println(node1.val);
			node1 = node1.next;
		}
	}
	
	/* �ǵݹ飺ͷ�巨 
	 * ��l��next��Ϊ�գ�Ȼ��p�ڵ����ͷ�巨���뵽l��
	 * */
	public static ListNode reverse(ListNode l) {
		if(l == null || l.next == null) {
			return l;
		} else {
			ListNode p = l.next;
			l.next = null;
			ListNode q = null;
			while(p != null) {
				q = p;
				p = p.next;
				q.next = l;
				l = q;
			}
			return l;
		}
	}
	
	/* �ݹ�ʵ��Good */
	public static ListNode reverse2(ListNode l, ListNode l2) {
		if(l == null) {
			return l2;
		} else {
			ListNode temp = l.next;
			l.next = l2;
			return reverse2(temp, l);
		}
	}
}
