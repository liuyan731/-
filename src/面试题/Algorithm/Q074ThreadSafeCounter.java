/*
 * QThreadSafeCounter.java
 *
 *  Created on: 2016年5月2日
 *      Author: liuyan
 */

package 面试题.Algorithm;

public class Q074ThreadSafeCounter {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			Creature c = new Creature();
		}
		
		System.out.println(Creature.getCount());
	}
}

class Creature {
	private static long count;	//使用long而不是int
	
	public Creature() {	//每次创建对象的时候计数
		synchronized(Creature.class) {
			count++;
		}
	}
	
	public static long getCount() {
		return count;
	}
}
