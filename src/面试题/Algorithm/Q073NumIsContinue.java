/*
 * Q073NumIsContinue.java
 *	һ���������У�Ԫ��ȡֵ������0~65535�е�����һ��������ͬ��ֵ�����ظ����֣�0�����⣬���Է������֡�
	�����һ���㷨������Ӹ�����������ѡȡ5����ֵ���ж���5����ֵ�Ƿ���������
	ע�⣺
	5����ֵ����������ġ����磺 8 7 5 0 6
	0����ͨ��������ֵ�����磺8 7 5 0 6 �е�0����ͨ���9����4
	0���Զ�γ��֡�
	���Ӷ������O(n2)�򲻵÷֡�
 *  Created on: 2016��5��3��
 *      Author: liuyan
 */

package ������.Algorithm;

public class Q073NumIsContinue {
	public static void main(String[] args) {
		int mat[] = { 8, 7, 5, 0, 6 };
		System.out.println(isContinued(mat));
	}

	/*
	 * ����˼·�� 1.ȡ5�����з�0�����������С����֮�����4������������������ 2.Ҫ�������������� 1��ȫ0 ��������2��ֻ��һ����0������
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
