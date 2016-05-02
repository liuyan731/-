/*
 * Q077IsCompleteTree.java
 *
 *  Created on: 2016年5月2日
 *      Author: liuyan
 */

package 面试题.Algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class Q077IsCompleteTree {
	public boolean isCompleteTree(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		TreeNode node;
		//先进行层次遍历，若左右孩子为null也会被加入到队列，若是完全二叉树，最后队列中全为null,若为非完全二叉树，最后队列里面有不为null的节点
		while ((node = queue.poll()) != null) {
			queue.offer(node.left);
			queue.offer(node.right);
		}
		
		while(!queue.isEmpty()) {
			if(queue.poll() !=  null) {//若有非null的节点在队列中，则肯定不为完全二叉树
				return false;
			}
		}
		return true;
	}
}
