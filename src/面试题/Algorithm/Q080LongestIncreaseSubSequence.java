/*
 * Q080LongestIncreaseSubSequence.java
 *	最长递增子序列
 *  Created on: 2016年5月1日
 *      Author: liuyan
 */

package 面试题.Algorithm;

import java.util.Arrays;

public class Q080LongestIncreaseSubSequence {
	public static void main(String[] args) {
		int mat[] = { 1, 3, 6, 7, 9, 4, 10, 5, 6 };
		LCSequence(mat);
		System.out.println();
		LCSequence2(mat);
	}

	// 方法一：将原数组排序得到新数组，然后求元素组与新数组的最长公共子序列，时间复杂度:排序(O(logn)) + LCS（O(n^2)） = O(n^2)
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

	// 方法二：直接使用动态规划，每一一步等于上一步的结果加一或1，时间复杂度为O(n^2)但是，少了排序的过程，所以比上面的方法要好
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
