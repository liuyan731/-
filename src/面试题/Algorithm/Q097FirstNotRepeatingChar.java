/*
 * Q097FirstNotRepeatingChar.java
 *
 *  Created on: 2016年4月26日
 *      Author: liuyan
 */

package 面试题.Algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Q097FirstNotRepeatingChar {
	public static void main(String[] args) {
		System.out.println(getFirstNotRepeatingChar("abaccdeff"));
	}
	
	public static char getFirstNotRepeatingChar(String str) {
		char[] cs = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < cs.length; i++) {
			if(map.containsKey(cs[i])) {
				map.replace(cs[i], map.get(cs[i]) + 1);
			} else {
				map.put(cs[i], 1);
			}
		}
		Set<Map.Entry<Character,Integer>> set = map.entrySet();
		for (Map.Entry<Character,Integer> entry : set) {
			if(entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		return 0;
	}
}
