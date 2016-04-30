/*
 * StackOverflowErrorExample.java
 *
 *  Created on: 2016年4月30日
 *      Author: liuyan
 */

package 面试题.Others;

public class StackOverflowErrorExample {
	public static void main(String[] args) {
		A a = new A();
	}
}

class A {
	A a = new A();	//递归调用，栈的深度会很高，栈溢出
}
