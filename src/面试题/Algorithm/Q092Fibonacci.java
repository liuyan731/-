/*
 * Q092Fibonacci.java
 *	쳲��������������⣨��̨�����⡢��ש����....���ݹ�ͷǵݹ�
 *  Created on: 2016��4��27��
 *      Author: liuyan
 */

package ������.Algorithm;

public class Q092Fibonacci {
	public static void main(String[] args) {
		System.out.println(fibonacci(10));
		System.out.println(fibonacci1(22));
	}
	
	public static int fibonacci(int n) {
		if(n == 0 || n == 1) {
			return n;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);	//�ݹ飬Ч�ʵ���
		}
	}
	
	public static int fibonacci1(int n) {
		int[] ret = new int[n + 1];
		ret[0] = 0;
		ret[1] = 1;
		for (int i = 2; i <= n; i++) {
			ret[i] = ret[i - 1] + ret[i - 2];	//���������������
		}
		return ret[n];
	}
}
