/*
 * PathIsExistInBinaryTree.java
 * 给定一个二叉树和一个值，判断这个二叉树是否存在一条由根到叶子的路径来保证路径节点之和等于给定的值
 *  Created on: 2016年4月11日
 *      Author: liuyan
 */

package 面试题.interview;

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
