class ThreadScope extends ThreadLocal<String>{
	@Override
	protected String initialValue() {
		return "No ThreadLocal initialValue set";
	}
}

class A{
	void m1() {
		System.out.println("m1() executed by : " + Thread.currentThread().getClass().getName());
		System.out.println("m1(): Thread1 scope value : " + MyThread1.threadScope.get());
		System.out.println("m1(): Thread2 scope value : " + MyThread2.threadScope.get());
	}
	
	void m2() {
		System.out.println("m2() executed by : " + Thread.currentThread().getClass().getName());
		System.out.println("m2(): Thread1 scope value : " + MyThread1.threadScope.get());
		System.out.println("m2(): Thread2 scope value : " + MyThread2.threadScope.get());
	}
}

class MyThread1 extends Thread{
	static ThreadScope threadScope = new ThreadScope();
	A a; 
	MyThread1(A a){
		this.a = a; 
	}
	public void run() {
		threadScope.set("AAA");
		a.m1();
	}
}

class MyThread2 extends Thread{
	static ThreadScope threadScope = new ThreadScope();
	A a; 
	MyThread2(A a){
		this.a = a; 
	}
	public void run() {
		threadScope.set("BBB");
		a.m2();
	}
}

public class Test {
	public static void main(String[] args) {
		A a = new A();
		MyThread1 t1 = new MyThread1(a);
		MyThread2 t2 = new MyThread2(a);
		t1.start();
		t2.start();
	}
}
