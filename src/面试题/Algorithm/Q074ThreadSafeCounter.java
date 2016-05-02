/*
 * QThreadSafeCounter.java
 *
 *  Created on: 2016��5��2��
 *      Author: liuyan
 */

package ������.Algorithm;

public class Q074ThreadSafeCounter {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			Creature c = new Creature();
		}
		
		System.out.println(Creature.getCount());
	}
}

class Creature {
	private static long count;	//ʹ��long������int
	
	public Creature() {	//ÿ�δ��������ʱ�����
		synchronized(Creature.class) {
			count++;
		}
	}
	
	public static long getCount() {
		return count;
	}
}
