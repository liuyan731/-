/*
 * HexConvert.java
 *	����ת��
 *  Created on: 2016��4��30��
 *      Author: liuyan
 */

package ������.Algorithm;

public class Q100HexConvert {
	public static void main(String[] args) {
		System.out.println(BinaryToDecimal("1010"));
		System.out.println(DecimalToBinary(10));

		System.out.println(HexTODecimal("AA"));
		System.out.println(DecimalToHex(2555));

		System.out.println(TwentySixToDecimal("AZ"));
		System.out.println(DecimalToTwentySix(52));
	}

	// �����Ƶ�ʮ����
	public static int BinaryToDecimal(String str) {
		char[] c = str.toCharArray();
		int[] cs = new int[c.length];
		for (int i = 0; i < cs.length; i++) {
			cs[i] = Integer.parseInt(c[i] + "");
		}
		int ret = 0;
		for (int i = 0; i < c.length; i++) {
			ret = ret + (int) (cs[i] * Math.pow(2, (c.length - 1 - i)));
		}
		return ret;
	}

	// ʮ���Ƶ�������
	public static String DecimalToBinary(int num) {
		StringBuilder sb = new StringBuilder("");
		while (num > 0) {
			sb.append(num % 2);
			num = num / 2;
		}
		return sb.reverse().toString();
	}

	// ʮ�����Ƶ�ʮ����
	public static int HexTODecimal(String str) {
		char[] c = str.toCharArray();
		int ret = 0;
		for (int i = 0; i < c.length; i++) {
			if ('0' <= c[i] && c[i] <= '9') {
				ret = ret + (int) ((c[i] - '0') * Math.pow(16, c.length - 1 - i));
			} else if ('A' <= c[i] && c[i] <= 'F') {
				ret = ret + (int) ((c[i] - 'A' + 10) * Math.pow(16, c.length - 1 - i));
			}
		}
		return ret;
	}

	// ʮ��ʮ������
	public static String DecimalToHex(int num) {
		StringBuilder sb = new StringBuilder("");
		while (num > 0) {
			if (0 <= num % 16 && num % 16 <= 9) {
				sb.append(num % 16);
			} else if (10 <= num % 16 && num % 16 <= 15) {
				sb.append((char) ((num % 16 - 10) + 'A'));
			}
			num = num / 16;
		}
		return sb.reverse().toString();
	}

	// 26���Ƶ�ʮ���� A:1, B:2, C:3, ....., Z:26, AA: 27, AB:28....
	public static int TwentySixToDecimal(String str) {
		char[] c = str.toCharArray();
		int ret = 0;
		for (int i = 0; i < c.length; i++) {
			ret = ret + (int) ((c[i] - 'A' + 1) * Math.pow(26, c.length - 1 - i));
		}
		return ret;
	}

	// ʮ��26���� 1:A, 2:B, ......, 26:Z, 27:AA, 28:AB ....
	public static String DecimalToTwentySix(int num) {
		StringBuilder sb = new StringBuilder("");
		while (num > 0) {
			if (num % 26 == 0) {	//��Ϊ�Ǵ�1��ʼ�ģ���26������������Ҫ�����ж�26
				sb.append('Z');
			} else {
				sb.append((char)(num % 26 + 'A' - 1));
			}
			num = (num - 1) / 26;	//��1��ʼ
		}
		return sb.reverse().toString();
	}
}
