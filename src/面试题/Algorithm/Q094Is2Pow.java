/*
 * Q094Is2Pow.java
 *	判断一个数是否为2的整数次幂（n&(n-1)）
 *  Created on: 2016年4月27日
 *      Author: liuyan
 */

package 面试题.Algorithm;

public class Q094Is2Pow {
	public static void main(String[] args) {
		System.out.println(is2Pow(1021));
	}

	public static boolean is2Pow(int n) {
		return (n & (n - 1)) == 0 ? true : false;
	}
}
