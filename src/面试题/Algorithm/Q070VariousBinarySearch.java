/*
 * Q070VariousBinarySearch.java
 *	���ֲ�ͬ�Ķ��ֲ��ұ���
 *	
 *  Created on: 2016��8��28��
 *      Author: liuyan
 */

package ������.Algorithm;

public class Q070VariousBinarySearch {
	public static void main(String[] args) {
		int low = 0, high = 10;
		System.out.println(low + ((high - low) >> 1));
	}

	// ���ص�һ���ҵ��ĵ���targetԪ�ص��±꣬�Ҳ�������-1������������
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

	// ���ص�һ������target��Ԫ�ص��±꣬�Ҳ�������-1��ע�������ǵ�һ������target
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

	// �������һ������target��Ԫ�ص��±꣬�Ҳ�������-1��ע�����������һ������target
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

	// ���ص�һ�����ڵ���targetԪ�ص��±꣬��С���򷵻�-1
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

	// �������һ��С�ڵ���targetԪ�ص��±꣬�������򷵻�-1
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

	// ���ص�һ������targetԪ�ص��±꣬��С�ڻ����target����-1
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

	// �������һ��С��targetԪ�ص��±꣬�����ڻ���ڷ���-1
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
