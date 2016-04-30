/*
 * TryFinallyExample.java
 *
 *  Created on: 2016年4月30日
 *      Author: liuyan
 */

package 面试题.Others;

public class TryFinallyExample {
	public static void main(String[] args) {
		System.out.println(foo());
	}

	public static int foo() {
		int a = 0;
		try {
			return a; // 如果没有finally中的return栈顶元素就为a的一份复制，在finally中改变a的值是不会改变栈顶的值，所以返回是0
		} finally {
			a++;
			return a; // 在finally中有return，栈顶的元素先为0，然后被这个return修改为1，所以返回值为1
		}
	}
}
