/*
 * Q083LongestCommonSubString.java
 *	������Ӵ�
 *  Created on: 2016��5��1��
 *      Author: liuyan
 */

package ������.Algorithm;

public class Q083LongestCommonSubString {
	
	public static void main(String[] args) {
		String str1 = "123456789";
		String str2 = "456213789";
		LCString(str1, str2);
	}
	
	public static void LCString(String str1, String str2) {
		int len1 = str1.length();
		int len2 = str2.length();
		int dp[][] = new int[len1 + 1][len2 + 1];
		int maxLen = 0, idx = 0;	// ��¼���Ĺ����Ӵ��ĳ��Ⱥ���ʼ���index
		for (int i = len1 - 1; i >= 0; i--) {
			for (int j = len2 - 1; j >= 0; j--) {
				if(str1.charAt(i) == str2.charAt(j)) {
					dp[i][j] = dp[i + 1][j + 1] + 1; //״̬ת�Ʒ���
					if(dp[i][j] > maxLen) {
						maxLen = dp[i][j];
						idx = i;
					}
				}
			}
		}
		System.out.println(str1.substring(idx, idx + maxLen));
	}
}	
