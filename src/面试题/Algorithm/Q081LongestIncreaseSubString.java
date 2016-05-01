/*
 * Q081LongestIncreaseSubString.java
 *	������Ӵ�
 *  Created on: 2016��5��1��
 *      Author: liuyan
 */

package ������.Algorithm;

public class Q081LongestIncreaseSubString {
	public static void main(String[] args) {
		int[] mat = {4,2,3,32,1,324};
		LIString(mat);
	}

	//��Ȼ�������Ҳ����ת���ɣ�����������Ȼ�������������������Ӵ������ǱȽϴ�
	public static void LIString(int[] nums) {
		int dp[] = new int[nums.length];
		int maxLen = 0, idx = 0;
		for (int i = 1; i < dp.length; i++) {
			if (nums[i] >= nums[i - 1]) {
				dp[i] = dp[i - 1] + 1;	//״̬ת�Ʒ���
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
