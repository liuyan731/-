/*
 * TryFinallyExample.java
 *
 *  Created on: 2016��4��30��
 *      Author: liuyan
 */

package ������.Others;

public class TryFinallyExample {
	public static void main(String[] args) {
		System.out.println(foo());
	}

	public static int foo() {
		int a = 0;
		try {
			return a; // ���û��finally�е�returnջ��Ԫ�ؾ�Ϊa��һ�ݸ��ƣ���finally�иı�a��ֵ�ǲ���ı�ջ����ֵ�����Է�����0
		} finally {
			a++;
			return a; // ��finally����return��ջ����Ԫ����Ϊ0��Ȼ�����return�޸�Ϊ1�����Է���ֵΪ1
		}
	}
}
