/*
 * Q082LongestCommonSubSequecce.java
 *	�����������
 *  Created on: 2016��5��1��
 *      Author: liuyan
 */

package ������.Algorithm;

public class Q082LongestCommonSubSequecce {
	public static void main(String[] args) {
		String str1 = "12424352435";
		String str2 = "345356365123";
		LCSequence(str1, str2);
	}

	public static void LCSequence(String str1, String str2) {
		int len1 = str1.length();
		int len2 = str2.length();
		int[][] dp = new int[len1 + 1][len2 + 1];
		for (int i = len1 - 1; i >= 0; i--) {
			for (int j = len2 - 1; j >= 0; j--) {
				if (str1.charAt(i) == str2.charAt(j)) {
					dp[i][j] = dp[i + 1][j + 1] + 1;//״̬ת�Ʒ���
				} else {
					dp[i][j] = Math.max(dp[i][j + 1], dp[i + 1][j]);//״̬ת�Ʒ���
				}
			}
		}

		int i = 0, j = 0;
		StringBuilder sb = new StringBuilder("");
		while (i < len1 && j < len2) {
			if(str1.charAt(i) == str2.charAt(j)) {
				sb.append(str1.charAt(i));
				i++;
				j++;
			} else if(dp[i + 1][j] > dp[i][j + 1]) {
				i++;
			} else {
				j++;
			}
		}
		
		System.out.println(sb.toString());
	}
}
