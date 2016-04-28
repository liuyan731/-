/*
 * Q95PowN.java
 *	��Ч����ֵ�������η�
 *  Created on: 2016��4��27��
 *      Author: liuyan
 */

package ������.Algorithm;

public class Q095PowN {
	public static void main(String[] args) {
		System.out.println(powN(3, 3));
	}
	
	public static int powN(int num, int r) {
		if(r == 0) {
			return 1;
		} else if(r == 1) {
			return num;
		} else {
			int r1 = r /2;
			int tmp = powN(num, r1); //�ݹ���һ�룬��������ʱ�临�Ӷ�ΪO(logn)��ԭʼ����ʱ�临�Ӷ�ΪO(n)
			if(r % 2 == 0) {
				return tmp * tmp;
			} else {
				return tmp * tmp * num;
			}
		}
	}
}
