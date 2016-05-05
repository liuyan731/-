/*
 * Q071TheTotalOneCount.java
 *	��1��n֮���ʮ��������1���ֵĴ���
 *  Created on: 2016��5��5��
 *      Author: liuyan
 */

package ������.Algorithm;

public class Q071TheTotalOneCount {
	public static void main(String[] args) {
		System.out.println(getRet(1000));
	}

	public static int count(int num, int digit) {
		int count = 0;
		while (num > 0) {
			if (num % 10 == digit) {
				count++;
			}
			num = num / 10;
		}
		return count;
	}
	
	public static int getRet(int m) {
		int ret = 0;
		for (int i = 0; i <= m; i++) {
			ret = ret + count(i, 1);
		}
		return ret;
	}
}
