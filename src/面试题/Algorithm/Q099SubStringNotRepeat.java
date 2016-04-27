/*
 * Q099SubStringNotRepeat.java
 *	求字符串的最长非重复子序列。比如字符串“dabaccdeff”，它的最长非重复子序列为“dabcef”
 *  Created on: 2016年4月26日
 *      Author: liuyan
 */

package 面试题.Algorithm;

import java.util.HashSet;

public class Q099SubStringNotRepeat {
	public static void main(String[] args) {
		System.out.println(getRet("dabaccdeff"));
	}

	public static String getRet(String str) {
		char[] cs = str.toCharArray();
		HashSet<Character> set = new HashSet<>();	//直接使用hashset
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
