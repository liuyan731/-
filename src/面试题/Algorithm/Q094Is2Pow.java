/*
 * Q094Is2Pow.java
 *	�ж�һ�����Ƿ�Ϊ2���������ݣ�n&(n-1)��
 *  Created on: 2016��4��27��
 *      Author: liuyan
 */

package ������.Algorithm;

public class Q094Is2Pow {
	public static void main(String[] args) {
		System.out.println(is2Pow(1021));
	}

	public static boolean is2Pow(int n) {
		return (n & (n - 1)) == 0 ? true : false;
	}
}
