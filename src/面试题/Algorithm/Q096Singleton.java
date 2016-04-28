/*
 * Singleton.java
 *  单例模式
 *  Created on: 2016年4月12日
 *      Author: liuyan
 */

package 面试题.Algorithm;

class Q096Singleton {	//恶汉式
	private static final Q096Singleton singleton = new Q096Singleton(); //在类加载的时候就创建了对象

	private Q096Singleton() {
	}
	
	public static Q096Singleton getInstance() {
		return singleton;
	}
}

class Singleton2 {	//懒汉式
	private static Singleton2 singleton2 = null;
	private Singleton2() {
	}
	public static Singleton2 getInstance() { //getInstance()方法可能出现线程安全问题
		synchronized (Singleton2.class) {
			if(singleton2 == null) {
				singleton2 = new Singleton2();
			}
		}
		return singleton2;
	}
}

class Singleton3 { // 双重校验锁
	private static volatile Singleton3 singleton = null;

	private Singleton3() {
	}

	public static Singleton3 getInstance() {
		if (singleton == null) { // 避免每次都调用加锁
			synchronized (Singleton3.class) {
				if (singleton == null) {
					singleton = new Singleton3();
				}
			}
		}
		return singleton;
	}
}

class Singleton4 { // 静态的内部类(静态的内部类只会加载一次，所以是线程安全的)
	private static class B {
		private static Singleton4 singleton2 = new Singleton4();
	}

	private Singleton4() {

	}

	public static Singleton4 getInstance() {
		return B.singleton2;
	}
}

// 调用方法Singeton5.INSTANCE.f();
enum Singleton5 {
	INSTANCE;

	public int i = 0; // 实例变量

	public void f() { // 实例方法
		System.out.println("枚举单例模式");
	}
}
