/*
 * Q073NumIsContinue.java
 *	一个整数数列，元素取值可能是0~65535中的任意一个数，相同数值不会重复出现；0是例外，可以反复出现。
	请设计一个算法，当你从该数列中随意选取5个数值，判断这5个数值是否连续相邻
	注意：
	5个数值允许是乱序的。比如： 8 7 5 0 6
	0可以通配任意数值。比如：8 7 5 0 6 中的0可以通配成9或者4
	0可以多次出现。
	复杂度如果是O(n2)则不得分。
 *  Created on: 2016年5月3日
 *      Author: liuyan
 */

package 面试题.Algorithm;

public class Q073NumIsContinue {
	public static void main(String[] args) {
		int mat[] = { 8, 7, 5, 0, 6 };
		System.out.println(isContinued(mat));
	}

	/*
	 * 解题思路： 1.取5个数中非0的最大数和最小数，之差不大于4则连续，否则不连续。 2.要增加两个特例： 1）全0 算连续，2）只有一个非0算连续
	 */
	public static boolean isContinued(int nums[]) {
		int max = 0, min = Integer.MAX_VALUE, zeroNum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				zeroNum++;
			} else {
				if (nums[i] > max) {
					max = nums[i];
				}
				if (nums[i] < min && nums[i] != 0) {
					min = nums[i];
				}
			}
		}
		if (zeroNum >= 4) {
			return true;
		} else if (max - min > 4) {
			return false;
		}

		return true;
	}
}
