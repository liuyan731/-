/*
 * Q093UglyNumber.java
 *	我们把只包含因子2，3和5的数称作为丑数。
 *  Created on: 2016年4月27日
 *      Author: liuyan
 */

package 面试题.Algorithm;

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
