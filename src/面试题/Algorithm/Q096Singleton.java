/*
 * Singleton.java
 *  ����ģʽ
 *  Created on: 2016��4��12��
 *      Author: liuyan
 */

package ������.Algorithm;

class Q096Singleton {	//��ʽ
	private static final Q096Singleton singleton = new Q096Singleton(); //������ص�ʱ��ʹ����˶���

	private Q096Singleton() {
	}
	
	public static Q096Singleton getInstance() {
		return singleton;
	}
}

class Singleton2 {	//����ʽ
	private static Singleton2 singleton2 = null;
	private Singleton2() {
	}
	public static Singleton2 getInstance() { //getInstance()�������ܳ����̰߳�ȫ����
		synchronized (Singleton2.class) {
			if(singleton2 == null) {
				singleton2 = new Singleton2();
			}
		}
		return singleton2;
	}
}

class Singleton3 { // ˫��У����
	private static volatile Singleton3 singleton = null;

	private Singleton3() {
	}

	public static Singleton3 getInstance() {
		if (singleton == null) { // ����ÿ�ζ����ü���
			synchronized (Singleton3.class) {
				if (singleton == null) {
					singleton = new Singleton3();
				}
			}
		}
		return singleton;
	}
}

class Singleton4 { // ��̬���ڲ���(��̬���ڲ���ֻ�����һ�Σ��������̰߳�ȫ��)
	private static class B {
		private static Singleton4 singleton2 = new Singleton4();
	}

	private Singleton4() {

	}

	public static Singleton4 getInstance() {
		return B.singleton2;
	}
}

// ���÷���Singeton5.INSTANCE.f();
enum Singleton5 {
	INSTANCE;

	public int i = 0; // ʵ������

	public void f() { // ʵ������
		System.out.println("ö�ٵ���ģʽ");
	}
}
