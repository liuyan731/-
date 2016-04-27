/*
 * ListIsPalindrome.java
 *	判断回文链表
 *  Created on: 2016年4月26日
 *      Author: liuyan
 */

package 面试题.Algorithm;

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
	
	public ListNode findMid(ListNode l) {	// 找到链表的中点位置节点
		// 使用快慢指针，快速指针每次走两步，慢指针每次只走一步，当快指针走到头的时候，正好慢指针在中间位置，取慢指针.next就是后半部分
		ListNode fast = l;
		ListNode slow = l;
		while((fast.next != null && fast.next.next != null ) && slow.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		ListNode ret = slow.next;
		return ret;
	}
	
	public ListNode reverse(ListNode l) { // 就地反转链表（非递归）
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
