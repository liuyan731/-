/*
 * ThreadLockRelated.java
 *
 *  Created on: 2016年4月15日
 *      Author: liuyan
 */

package 面试题.Algorithm;

import java.util.ArrayList;

public class ThreadLockRelated {
	public static void main(String[] args) {
		final Insert insert = new Insert();
		
		new Thread() {
			public void run() {
				insert.insert(Thread.currentThread());
			};
		}.start();
		
		new Thread() {
			public void run() {
				insert.insert(Thread.currentThread());
			};
		}.start();
	}
}

class Insert {
	private ArrayList<Integer> arrayList = new ArrayList<>();
	
	public synchronized void insert(Thread thread) {
		for (int i = 0; i < 5; i++) {
			System.out.println(thread.getName() + "插入数据" + i);
			arrayList.add(i);
		}
	}
}