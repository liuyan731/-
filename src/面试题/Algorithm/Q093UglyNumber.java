/*
 * Q093UglyNumber.java
 *	���ǰ�ֻ��������2��3��5��������Ϊ������
 *  Created on: 2016��4��27��
 *      Author: liuyan
 */

package ������.Algorithm;

public class Q093UglyNumber {
	public static void main(String[] args) {
		System.out.println(isUglyNum(14));
	}

	public static boolean isUglyNum(int num) {
		while (num % 2 == 0) {
			num = num / 2;
		}
		while (num % 3 == 0) {
			num = num / 3;
		}
		while (num % 5 == 0) {
			num = num / 5;
		}
		return num == 1 ? true : false;
	}
}
