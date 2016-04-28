/*
 * Q092Fibonacci.java
 *	斐波那契数列类问题（上台阶问题、铺砖问题....）递归和非递归
 *  Created on: 2016年4月27日
 *      Author: liuyan
 */

package 面试题.Algorithm;

public class Q092Fibonacci {
	public static void main(String[] args) {
		System.out.println(fibonacci(10));
		System.out.println(fibonacci1(22));
	}
	
	public static int fibonacci(int n) {
		if(n == 0 || n == 1) {
			return n;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);	//递归，效率低下
		}
	}
	
	public static int fibonacci1(int n) {
		int[] ret = new int[n + 1];
		ret[0] = 0;
		ret[1] = 1;
		for (int i = 2; i <= n; i++) {
			ret[i] = ret[i - 1] + ret[i - 2];	//将结果存在数组中
		}
		return ret[n];
	}
}
