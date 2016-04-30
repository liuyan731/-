/*
 * Q085FindTheRepeatOne.java
 *
 *  Created on: 2016��4��30��
 *      Author: liuyan
 */

package ������.Algorithm;

public class Q085FindTheRepeatOne {
	public static void main(String[] args) {
		int mat[] = { 1, 2, 3, 3, 4, 5, 6, 7 };
		System.out.println(findTheRepeatOne(mat));

		int mat2[] = { 0, 1, 2, 3, 3, 5 };
	}

	public static int findTheRepeatOne(int[] nums) {
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < nums.length; i++) {
			sum1 += i;
			sum2 += nums[i];
		}
		return sum2 - sum1;
	}

	public static int findTheRepeatOne2(int[] num) { // ����������ظ���һ��Ԫ��ȱʧ
		// �����ظ���Ԫ��Ϊa�� ȱʧ��Ԫ��Ϊb
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < num.length; i++) {
			sum1 = sum1 + num[i] - i; // �õ� a-b
			sum2 = sum2 + num[i] * num[i] - i * i; // �õ�a*a - b*b
		}
		sum2 = sum2 / sum1;
		return (sum1 + sum2) / 2;
	}
	//ͬ������ʹ��hash
}
