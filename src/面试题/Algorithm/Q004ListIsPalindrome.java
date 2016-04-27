/*
 * ListIsPalindrome.java
 *	�жϻ�������
 *  Created on: 2016��4��26��
 *      Author: liuyan
 */

package ������.Algorithm;

public class Q004ListIsPalindrome {
	public boolean isPalindrome(ListNode head) {
		if(head == null || head.next == null) {
			return true;
		} else {
			ListNode mid = findMid(head);
			mid = reverse(mid);
			while(head != null && mid != null) {
				if(head.val != mid.val) {
					return false;
				}
				head = head.next;
				mid = mid.next;
			}
			return true;
		}
    }
	
	public ListNode findMid(ListNode l) {	// �ҵ�������е�λ�ýڵ�
		// ʹ�ÿ���ָ�룬����ָ��ÿ������������ָ��ÿ��ֻ��һ��������ָ���ߵ�ͷ��ʱ��������ָ�����м�λ�ã�ȡ��ָ��.next���Ǻ�벿��
		ListNode fast = l;
		ListNode slow = l;
		while((fast.next != null && fast.next.next != null ) && slow.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		ListNode ret = slow.next;
		return ret;
	}
	
	public ListNode reverse(ListNode l) { // �͵ط�ת�����ǵݹ飩
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
