/*
 * StackOverflowErrorExample.java
 *
 *  Created on: 2016��4��30��
 *      Author: liuyan
 */

package ������.Others;

public class StackOverflowErrorExample {
	public static void main(String[] args) {
		A a = new A();
	}
}

class A {
	A a = new A();	//�ݹ���ã�ջ����Ȼ�ܸߣ�ջ���
}
