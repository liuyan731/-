/*
 * PathIsExistInBinaryTree.java
 * ����һ����������һ��ֵ���ж�����������Ƿ����һ���ɸ���Ҷ�ӵ�·������֤·���ڵ�֮�͵��ڸ�����ֵ
 *  Created on: 2016��4��11��
 *      Author: liuyan
 */

package ������.interview;

public class PathIsExistInBinaryTree {
	public boolean isExisted(TreeNode node, int target) {
		if(node == null && target == 0) {
			return true;
		} else if(node == null && target != 1) {
			return false;
		} else {
			int newTarget = target - node.value;
			return isExisted(node.left, newTarget) || isExisted(node.right, newTarget);
		}
	}
}

class TreeNode {
	int value;
	TreeNode left;
	TreeNode right;
}
