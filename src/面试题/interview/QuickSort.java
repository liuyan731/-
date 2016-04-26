/*
 * QuickSort.java
 *
 *  Created on: 2016年4月11日
 *      Author: liuyan
 */

package 面试题.interview;

public class QuickSort {
	public static void main(String[] args) {
		int mat[] = { 2, 4, 6, 2, 3, 5, 6, 8 };
		quickSort(mat, 0, mat.length - 1);
		for (int i = 0; i < mat.length; i++) {
			System.out.println(mat[i]);
		}
	}

	public static void quickSort(int nums[], int l, int r) {
		if (l < r) {
			int i = l, j = r, x = nums[l];
			while (i < j) {
				while (i < j && x < nums[j]) {
					j--;
				}
				if (i < j) {
					nums[i++] = nums[j];
				}

				while (i < j && x > nums[i]) {
					i++;
				}
				if (i < j) {
					nums[j--] = nums[i];
				}
			}

			nums[i] = x;
			quickSort(nums, l, i - 1);
			quickSort(nums, i + 1, r);
		}
	}
}
