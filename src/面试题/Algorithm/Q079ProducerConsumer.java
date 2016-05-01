/*
 * Q079ProducerConsumer.java
 *
 *  Created on: 2016年5月1日
 *      Author: liuyan
 */

package 面试题.Algorithm;

public class Q079ProducerConsumer {
	//方法测试，需要保证所有的资源值在合理的范围内
	public static void main(String[] args) {
		PublicResource resource = new PublicResource();
		new Thread(new ProducerThread(resource)).start();
		new Thread(new ConsumerThread(resource)).start();
		new Thread(new ProducerThread(resource)).start();
		new Thread(new ConsumerThread(resource)).start();
		new Thread(new ProducerThread(resource)).start();
	}
}

// 公共资源类
class PublicResource {
	private int num = 0; // 资源个数

	public synchronized void increase() { // 增加资源
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

	public synchronized void decrease() { // 减少资源
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

// 生产者类
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

// 消费者类
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
