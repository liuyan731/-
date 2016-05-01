/*
 * Q081LongestIncreaseSubString.java
 *	最长递增子串
 *  Created on: 2016年5月1日
 *      Author: liuyan
 */

package 面试题.Algorithm;

public class Q081LongestIncreaseSubString {
	public static void main(String[] args) {
		int[] mat = {4,2,3,32,1,324};
		LIString(mat);
	}

	//当然这个问题也可以转换成：将数组排序，然后求两个数组的最长公共子串，但是比较蠢
	public static void LIString(int[] nums) {
		int dp[] = new int[nums.length];
		int maxLen = 0, idx = 0;
		for (int i = 1; i < dp.length; i++) {
			if (nums[i] >= nums[i - 1]) {
				dp[i] = dp[i - 1] + 1;	//状态转移方程
				if(dp[i] > maxLen) {
					maxLen = dp[i];
					idx = i;
				}
			}
		}
		for (int i = idx - maxLen; i <= idx; i++) {
			System.out.println(nums[i]);
		}
	}
}
