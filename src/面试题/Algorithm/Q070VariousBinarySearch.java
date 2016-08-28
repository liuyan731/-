/*
 * Q070VariousBinarySearch.java
 *	各种不同的二分查找变型
 *	
 *  Created on: 2016年8月28日
 *      Author: liuyan
 */

package 面试题.Algorithm;

public class Q070VariousBinarySearch {
	public static void main(String[] args) {
		int low = 0, high = 10;
		System.out.println(low + ((high - low) >> 1));
	}

	// 返回第一个找到的等于target元素的下标，找不到返回-1，最基础的情况
	public static int binarySearch1(int nums[], int target) {
		int l = 0, r = nums.length - 1, mid;
		while (l <= r) {
			mid = (l + r) / 2; // mid = l + (r - l) >> 1
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] > target) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		return -1;
	}

	// 返回第一个等于target的元素的下标，找不到返回-1，注意条件是第一个等于target
	public static int binarySearch2(int nums[], int target) {
		int l = 0, r = nums.length - 1, mid;
		while (l <= r) {
			mid = (l + r) / 2;
			if (nums[mid] <= target) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		if (l < nums.length && nums[l] == target) {
			return l;
		}
		return -1;
	}

	// 返回最后一个等于target的元素的下标，找不到返回-1，注意条件是最后一个等于target
	public static int binarySearch3(int nums[], int target) {
		int l = 0, r = nums.length - 1, mid;
		while (l <= r) {
			mid = (l + r) / 2;
			if (nums[mid] > target) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		if (r >= 0 && nums[r] == target) {
			return r;
		}
		return -1;
	}

	// 返回第一个大于等于target元素的下标，都小于则返回-1
	public static int binarySearch4(int nums[], int target) {
		int l = 0, r = nums.length - 1, mid;
		while (l <= r) {
			mid = (l + r) / 2;
			if (nums[mid] >= target) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		if (l < nums.length) {
			return l;
		}
		return -1;
	}

	// 返回最后一个小于等于target元素的下标，都大于则返回-1
	public static int binarySearch5(int nums[], int target) {
		int l = 0, r = nums.length - 1, mid;
		while (l < r) {
			mid = (l + r) / 2;
			if (nums[mid] <= target) {
				l = mid + 1;
			} else {
				r = mid - 1;
			}
		}
		if (r >= 0) {
			return r;
		}
		return -1;
	}

	// 返回第一个大于target元素的下标，都小于或等于target返回-1
	public static int binarySearch6(int nums[], int target) {
		int l = 0, r = nums.length - 1, mid;
		while (l < r) {
			mid = (l + r) / 2;
			if (nums[mid] > target) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		if (l < nums.length - 1) {
			return l;
		}
		return -1;
	}

	// 返回最后一个小于target元素的下标，都大于或等于返回-1
	public static int binarySearch7(int nums[], int target) {
		int l = 0, r = nums.length - 1, mid;
		while(l <= r) {
			mid = (l + r) /2; 
			if(nums[mid] >= target) {
				l = mid - 1;
			} else {
				r = mid + 1;
			}
		}
		if(r < nums.length) {
			return r;
		}
		return -1;
	}
}
