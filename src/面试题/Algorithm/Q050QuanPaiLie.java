/*
 * QuanPaiLie.java
 *	全排列问题
 *  Created on: 2016年4月11日
 *      Author: liuyan
 */

package 面试题.Algorithm;

public class Q050QuanPaiLie {
	public static void main(String[] args) {
		int mat[] = {1,2,3,4};
		getQuanpailie(mat, 0, mat.length - 1);
	}
	
	public static void getQuanpailie(int num[], int l, int r) {
		if(l > r) {
			for (int i = 0; i < num.length; i++) {
				System.out.print(num[i] + " ");
			}
			System.out.println();
		}
		for (int i = l; i < num.length; i++) {
			swap(num, l, i);
			getQuanpailie(num, l + 1, r);
			swap(num, l, i);
		}
	}
	
	public static void swap(int num[] ,int i ,int j) {
		int temp = num[i];
		num[i] = num[j];
		num[j] = temp;
	} 
}
