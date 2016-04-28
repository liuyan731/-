/*
 * Q091BinarySearch.java
 *	二分查找算法：递归、非递归
 *  Created on: 2016年4月27日
 *      Author: liuyan
 */

package 面试题.Algorithm;

public class Q091BinarySearch {
	public static void main(String[] args) {
		int nums[] = { 1, 3, 4, 5, 7, 8, 9 };
		System.out.println(binarySearch1(nums, -2));
	}

	public static int binarySearch(int[] nums, int l, int r, int x) { // 递归
		if (l <= r) {
			int mid = (l + r) / 2;
			if (nums[mid] == x) {
				return mid;
			} else if (nums[mid] > x) {
				return binarySearch(nums, l, mid - 1, x);
			} else {
				return binarySearch(nums, mid + 1, r, x);
			}
		} else {
			return -1;
		}
	}

	public static int binarySearch1(int[] nums, int x) { // 非递归
		int l = 0;
		int r = nums.length - 1;

		while (l <= r) {
			int mid = (l + r) / 2;
			if(nums[mid] == x) {
				return mid;
			} else if(nums[mid] > x) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		return -1;
	}
}
