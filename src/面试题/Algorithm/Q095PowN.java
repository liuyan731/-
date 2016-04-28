/*
 * Q95PowN.java
 *	高效求数值的整数次方
 *  Created on: 2016年4月27日
 *      Author: liuyan
 */

package 面试题.Algorithm;

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
			int tmp = powN(num, r1); //递归求一半，存起来，时间复杂度为O(logn)，原始的求法时间复杂度为O(n)
			if(r % 2 == 0) {
				return tmp * tmp;
			} else {
				return tmp * tmp * num;
			}
		}
	}
}
