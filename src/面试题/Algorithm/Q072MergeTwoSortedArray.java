/*
 * Q072MergeTwoSortedArray.java
 *
 *  Created on: 2016��5��5��
 *      Author: liuyan
 */

package ������.Algorithm;

public class Q072MergeTwoSortedArray {
	public static void main(String[] args) {
		int nums1[] = {1,4,6,8};
		int nums2[] = {1,2,4,6,9,10};
		int[] ret = merge(nums1, nums2);
		for (int i : ret) {
			System.out.println(i);
		}
	}
	
	public static int[] merge(int[] nums1, int[] nums2) {
		int totalLen = nums1.length + nums2.length;
		int array[] = new int[totalLen];
		int i = 0, j = 0;
		int idx = 0;
		while (i < nums1.length && j < nums2.length) {
			//ÿ�αȽ���������ĵ�һ��Ԫ�ص�ֵ��������С��ֵ���뵽array��
			if(nums1[i] <= nums2[j]) {
				array[idx] = nums1[i];
				i++;
				idx++;
			} else {
				array[idx] = nums2[j];
				j++;
				idx++;
			}
		}
		//�����һ��������ʣ���Ԫ�أ�ֱ�ӷ��뵽array�ĺ���
		if(i < nums1.length - 1) {
			for (int k = idx; k < array.length; k++) {
				array[k] = nums1[k - nums2.length];
			}
		} else if(j < nums2.length - 1) {
			for (int k = idx; k < array.length; k++) {
				array[k] = nums2[k - nums1.length];
			}
		}
		return array;
	}
}
