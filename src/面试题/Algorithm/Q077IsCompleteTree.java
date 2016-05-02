/*
 * Q077IsCompleteTree.java
 *
 *  Created on: 2016��5��2��
 *      Author: liuyan
 */

package ������.Algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class Q077IsCompleteTree {
	public boolean isCompleteTree(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		TreeNode node;
		//�Ƚ��в�α����������Һ���ΪnullҲ�ᱻ���뵽���У�������ȫ����������������ȫΪnull,��Ϊ����ȫ�������������������в�Ϊnull�Ľڵ�
		while ((node = queue.poll()) != null) {
			queue.offer(node.left);
			queue.offer(node.right);
		}
		
		while(!queue.isEmpty()) {
			if(queue.poll() !=  null) {//���з�null�Ľڵ��ڶ����У���϶���Ϊ��ȫ������
				return false;
			}
		}
		return true;
	}
}
