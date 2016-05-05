/*
 * Q071TheTotalOneCount.java
 *	求1到n之间的十进制数中1出现的次数
 *  Created on: 2016年5月5日
 *      Author: liuyan
 */

package 面试题.Algorithm;

public class Q071TheTotalOneCount {
	public static void main(String[] args) {
		System.out.println(getRet(1000));
	}

	public static int count(int num, int digit) {
		int count = 0;
		while (num > 0) {
			if (num % 10 == digit) {
				count++;
			}
			num = num / 10;
		}
		return count;
	}
	
	public static int getRet(int m) {
		int ret = 0;
		for (int i = 0; i <= m; i++) {
			ret = ret + count(i, 1);
		}
		return ret;
	}
}
