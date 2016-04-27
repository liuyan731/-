/*
 * Q098PrimeFactors.java
 *	��һ�������������ֽ⣬��������90�����2*3*3*5��
 *  Created on: 2016��4��26��
 *      Author: liuyan
 */

package ������.Algorithm;

import java.util.ArrayList;

public class Q098PrimeFactors {
	public static void main(String[] args) {
		getPrimeFactors(400932);
	}
	
	public static void getPrimeFactors(int num) {	//��90Ϊ����
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if(num % i == 0) {	//iΪ������
				list.add(i);	//�洢i
				num = num / i;	//90�ҵ���2��num = 90/2 = 45 ��Ȼ�������45��ʼ��
				i = 1;	//��i++��������Ϊ1���´μ�����2��ʼ��
			}
		}
		list.add(num); //���һ����ҲΪ�����ӣ�����
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}
}
