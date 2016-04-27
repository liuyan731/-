/*
 * Q099SubStringNotRepeat.java
 *	���ַ���������ظ������С������ַ�����dabaccdeff������������ظ�������Ϊ��dabcef��
 *  Created on: 2016��4��26��
 *      Author: liuyan
 */

package ������.Algorithm;

import java.util.HashSet;

public class Q099SubStringNotRepeat {
	public static void main(String[] args) {
		System.out.println(getRet("dabaccdeff"));
	}

	public static String getRet(String str) {
		char[] cs = str.toCharArray();
		HashSet<Character> set = new HashSet<>();	//ֱ��ʹ��hashset
		for (char c : cs) {
			set.add(c);
		}
		String ret = "";
		for (Character character : set) {
			ret = ret + character;
		}
		return ret;
	}
}
