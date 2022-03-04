package com.demo
class FirstThread extends Thread{
	Thread t;
	String ThreadName;
	FirstThread(String name){
		ThreadName=name;
		System.out.println("creating thread name" + name);
	}
	
	public void run() {
		try {
			for(int i=8;i>0;i--) {
				System.out.println("Thread " + ThreadName + "," + i);
				Thread.sleep(7000);
			}
		}catch (InterruptedException e) {
			System.out.println("Thread "+ ThreadName + "has been interrupted");
		}
	}
	public void start() {
		System.out.println("thread is starting..."+ThreadName);
		if (t==null) {
			t=new Thread(this,ThreadName);
			t.start();
		}
	}
}

public class TreadDemo {
	public static void main(String[] args) {
		FirstThread t1 = new FirstThread("thread 1");
		t1.start();
	}

}