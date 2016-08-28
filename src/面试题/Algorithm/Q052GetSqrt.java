/*
 * Q52GetSqrt.java
 *
 *  Created on: 2016年8月16日
 *      Author: liuyan
 */

package 面试题.Algorithm;

import java.lang.Math;

public class Q052GetSqrt {
	public static void main(String[] args) {
		System.out.println(getSqrt(19));
		System.out.println(getSqrt2(19));
	}

	// 使用牛顿迭代法求开方
	public static double getSqrt(double a) {
		double ret = 1, tmp = 1;
		do {
			tmp = ret;
			ret = (ret + a / ret) * 0.5;
		} while (Math.abs(ret - tmp) > 0.00000001);
		return ret;
	}

	// 使用二分查找的变异来求开方
	public static double getSqrt2(int x) {
		int low = 0, high = x, mid;
		while (low <= high) {
			mid = (low + high) / 2;
			if(mid * mid < x) {
				low = mid + 1;
			} else if(mid * mid >x) {
				high = mid - 1;
			} else {
				return mid;
			}
		}
		return high;
	}
}
