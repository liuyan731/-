/*
 * Q090FindMaxSumOfSubArray.java
 *	输入一个整型数组，数组里有正数也有负数。数组中一个或连续的多个整数组成一个子数组。求所有子数组的和的最大值。要求时间复杂度为O(n)。
 *  Created on: 2016年4月27日
 *      Author: liuyan
 */

package 面试题.Algorithm;

public class Q090FindMaxSumOfSubArray {
	public static void main(String[] args) {
		int nums[] = { 1, -2, 3, 10, -4, 7, 2, -5 };
		System.out.println(findMaxSumOfSubArray(nums));
	}

	public static int findMaxSumOfSubArray(int[] nums) { // 使用动态规划的思想
		int[] dp = new int[nums.length];
		dp[0] = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (dp[i - 1] < 0) {
				dp[i] = nums[i];
			} else {
				dp[i] = dp[i - 1] + nums[i];
			}
		}
		int ret = dp[0];
		for (int i = 1; i < dp.length; i++) {
			if(ret < dp[i]) {
				ret = dp[i];
			}
		}
		return ret;
	}
}
