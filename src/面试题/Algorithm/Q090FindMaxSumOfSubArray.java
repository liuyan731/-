/*
 * Q090FindMaxSumOfSubArray.java
 *	����һ���������飬������������Ҳ�и�����������һ���������Ķ���������һ�������顣������������ĺ͵����ֵ��Ҫ��ʱ�临�Ӷ�ΪO(n)��
 *  Created on: 2016��4��27��
 *      Author: liuyan
 */

package ������.Algorithm;

public class Q090FindMaxSumOfSubArray {
	public static void main(String[] args) {
		int nums[] = { 1, -2, 3, 10, -4, 7, 2, -5 };
		System.out.println(findMaxSumOfSubArray(nums));
	}

	public static int findMaxSumOfSubArray(int[] nums) { // ʹ�ö�̬�滮��˼��
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
