/*
 * Q098PrimeFactors.java
 *	求一个数的质因数分解，比如输入90，输出2*3*3*5。
 *  Created on: 2016年4月26日
 *      Author: liuyan
 */

package 面试题.Algorithm;

import java.util.ArrayList;

public class Q098PrimeFactors {
	public static void main(String[] args) {
		getPrimeFactors(400932);
	}
	
	public static void getPrimeFactors(int num) {	//以90为例子
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if(num % i == 0) {	//i为质因子
				list.add(i);	//存储i
				num = num / i;	//90找到了2，num = 90/2 = 45 。然后继续从45开始找
				i = 1;	//有i++所以设置为1，下次继续从2开始找
			}
		}
		list.add(num); //最后一个数也为质因子，存入
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}
}
