/*
 * Q084FindNotRepeatOne.java
 *	һ�������г���ĳһ��Ԫ�أ�������Ԫ�ض��ظ���һ�Σ������û���ظ���Ԫ�أ���������
 *  Created on: 2016��5��1��
 *      Author: liuyan
 */

package ������.Algorithm;

public class Q084FindNotRepeatOne {
	public static void main(String[] args) {
		int mat[] = { 1, 2, 3, 4, 3, 2, 1 };
		System.out.println(findNotRepeatOne(mat));
	}

	public static int findNotRepeatOne(int[] nums) {
		//ע��������ͬ���������������0
		int ret = 0;
		for (int i = 0; i < nums.length; i++) {
			ret = ret ^ nums[i];
		}
		return ret;
	}
}
