/*
 * Q04LowerCaseInFrontHigherCaseInBehind.java
 *  就地将字符串中所有的小写字母排在大写字母的前面（同类问题：调整数组顺序使奇数位于偶数前面）
 *  不需要考虑保持原顺序
 *  Created on: 2016年4月19日
 *      Author: liuyan
 */

package 面试题.Algorithm;

public class Q040LowerCaseInFrontHigherCaseInBehind {
	public static void main(String[] args) {
		String str = "ASasdasdASDFFXX";
		char cs[] = str.toCharArray();
		change(cs);
		for (char c : cs) {
			System.out.print(c);
		}
	}
	
	public static char[] change(char[] chars) {
		int l = 0, r = chars.length - 1;	//使用头尾指针的思想
		while(l < r) {
			if(chars[l] >= 'a' && chars[l] <= 'z') {
				l++;
				continue;
			} 
			if(chars[r] <= 'Z' && chars[r] >= 'A') {
				r--;
				continue;
			}
			
			char temp = chars[l];
			chars[l] = chars[r];
			chars[r] = temp;
			
		}
		return chars;
	}
	
}
