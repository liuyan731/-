/*
 * Q079ProducerConsumer.java
 *
 *  Created on: 2016��5��1��
 *      Author: liuyan
 */

package ������.Algorithm;

public class Q079ProducerConsumer {
	//�������ԣ���Ҫ��֤���е���Դֵ�ں���ķ�Χ��
	public static void main(String[] args) {
		PublicResource resource = new PublicResource();
		new Thread(new ProducerThread(resource)).start();
		new Thread(new ConsumerThread(resource)).start();
		new Thread(new ProducerThread(resource)).start();
		new Thread(new ConsumerThread(resource)).start();
		new Thread(new ProducerThread(resource)).start();
	}
}

// ������Դ��
class PublicResource {
	private int num = 0; // ��Դ����

	public synchronized void increase() { // ������Դ
		while (num != 0) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		num++;
		System.out.println(num);
		notify();
	}

	public synchronized void decrease() { // ������Դ
		while (num == 0) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		num--;
		System.out.println(num);
		notify();
	}
}

// ��������
class ProducerThread implements Runnable {
	private PublicResource resource;
	public ProducerThread(PublicResource resource) {
		this.resource = resource;
	}
	public void run() {
		for (int i = 0; i < 10; i++) {
			resource.increase();
		}
	}
}

// ��������
class ConsumerThread implements Runnable {
	private PublicResource resource;
	public ConsumerThread(PublicResource resource) {
		this.resource = resource;
	}
	public void run() {
		for (int i = 0; i < 10; i++) {
			resource.decrease();
		}
	}
}
