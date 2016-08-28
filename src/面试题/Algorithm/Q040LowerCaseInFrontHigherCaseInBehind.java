/*
 * Q04LowerCaseInFrontHigherCaseInBehind.java
 *  �͵ؽ��ַ��������е�Сд��ĸ���ڴ�д��ĸ��ǰ�棨ͬ�����⣺��������˳��ʹ����λ��ż��ǰ�棩
 *  ����Ҫ���Ǳ���ԭ˳��
 *  Created on: 2016��4��19��
 *      Author: liuyan
 */

package ������.Algorithm;

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
		int l = 0, r = chars.length - 1;	//ʹ��ͷβָ���˼��
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
