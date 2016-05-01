/*
 * Q084FindNotRepeatOne.java
 *	一个数组中除了某一个元素，其他的元素都重复了一次，求这个没有重复的元素（异或操作）
 *  Created on: 2016年5月1日
 *      Author: liuyan
 */

package 面试题.Algorithm;

public class Q084FindNotRepeatOne {
	public static void main(String[] args) {
		int mat[] = { 1, 2, 3, 4, 3, 2, 1 };
		System.out.println(findNotRepeatOne(mat));
	}

	public static int findNotRepeatOne(int[] nums) {
		//注意两个相同的数异或操作后等于0
		int ret = 0;
		for (int i = 0; i < nums.length; i++) {
			ret = ret ^ nums[i];
		}
		return ret;
	}
}
