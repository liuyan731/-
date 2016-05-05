/*
 * TriesTree.java
 * Trie树，又称字典树，单词查找树或者前缀树，是一种用于快速检索的多叉树结构，如英文字母的字典树是一个26叉树，数字的字典树是一个10叉树。
 *  Created on: 2016年4月11日
 *      Author: liuyan
 */

package 面试题.Algorithm;

import java.util.HashMap;
import java.util.Map;

public class Q076TriesTree {
	class Node {
		protected boolean isEnd;	// 是不是单词的结尾
		protected int count;	//单词出现的频次
		protected Map<Character, Node> children= null;
		
		public Node() {
			isEnd = false;
			count = 0;
			children = new HashMap<>();
		}
	}
	
	private Node root = new Node();
	
	public void insert(String str) {
		Node node = root;
		for (int i = 0; i < str.length(); i++) {
			if(!node.children.containsKey(str.charAt(i))) {
				node.children.put(str.charAt(i), new Node());
			}
			node = node.children.get(str.charAt(i));
		}
		node.isEnd = true;
		node.count++;
	}
	
	public boolean find(String word) {
		Node node = root;
		for (int i = 0; i < word.length(); i++) {
			if(!node.children.containsKey(word.charAt(i))) {
				return false;
			} else {
				node = node.children.get(word.charAt(i));
			}
		}
		return node.isEnd;
	}
}


