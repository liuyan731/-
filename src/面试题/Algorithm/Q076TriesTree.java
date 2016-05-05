/*
 * TriesTree.java
 * Trie�����ֳ��ֵ��������ʲ���������ǰ׺������һ�����ڿ��ټ����Ķ�����ṹ����Ӣ����ĸ���ֵ�����һ��26���������ֵ��ֵ�����һ��10������
 *  Created on: 2016��4��11��
 *      Author: liuyan
 */

package ������.Algorithm;

import java.util.HashMap;
import java.util.Map;

public class Q076TriesTree {
	class Node {
		protected boolean isEnd;	// �ǲ��ǵ��ʵĽ�β
		protected int count;	//���ʳ��ֵ�Ƶ��
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


