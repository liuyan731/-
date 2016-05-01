/*
 * Q080LongestIncreaseSubSequence.java
 *	�����������
 *  Created on: 2016��5��1��
 *      Author: liuyan
 */

package ������.Algorithm;

import java.util.Arrays;

public class Q080LongestIncreaseSubSequence {
	public static void main(String[] args) {
		int mat[] = { 1, 3, 6, 7, 9, 4, 10, 5, 6 };
		LCSequence(mat);
		System.out.println();
		LCSequence2(mat);
	}

	// ����һ����ԭ��������õ������飬Ȼ����Ԫ�����������������������У�ʱ�临�Ӷ�:����(O(logn)) + LCS��O(n^2)�� = O(n^2)
	public static void LCSequence(int nums[]) {
		int newNums[] = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			newNums[i] = nums[i];
		}
		Arrays.sort(newNums);

		int len1 = nums.length;
		int len2 = newNums.length;
		int dp[][] = new int[len1 + 1][len2 + 1];

		for (int i = len1 - 1; i >= 0; i--) {
			for (int j = len2 - 1; j >= 0; j--) {
				if (nums[i] == newNums[j]) {
					dp[i][j] = dp[i + 1][j + 1] + 1;
				} else {
					dp[i][j] = Math.max(dp[i + 1][j], dp[i][j + 1]);
				}
			}
		}

		int i = 0, j = 0;
		while (i < len1 && j < len2) {
			if (nums[i] == newNums[j]) {
				System.out.print(nums[i] + " ");
				i++;
				j++;
			} else if (dp[i + 1][j] > dp[i][j + 1]) {
				i++;
			} else {
				j++;
			}
		}
	}

	// ��������ֱ��ʹ�ö�̬�滮��ÿһһ��������һ���Ľ����һ��1��ʱ�临�Ӷ�ΪO(n^2)���ǣ���������Ĺ��̣����Ա�����ķ���Ҫ��
	public static void LCSequence2(int nums[]) {
		int dp[] = new int[nums.length];
		int maxLen = 0;
		for (int i = 0; i < dp.length; i++) {
			dp[i] = 1;
			for (int j = 0; j < i; j++) {
				if((nums[j] < nums[i]) && (dp[j] + 1 > dp[i])) {
					dp[i] = dp[j] + 1;
				}
			}
			if(dp[i] > maxLen) {
				maxLen = dp[i];
			}
		}
		System.out.println(maxLen);
	}
}
