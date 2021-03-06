package net.antra.multithread.interrupt;

public class ThreadWithClass extends Thread{
	//Thread anotherThread = null;
	Object lock = new Object();
	@Override
	public void run() {
		System.out.println("ThreadWithClass is running");
		synchronized (this) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for(int i = 0 ; i < 10; i++){
			System.out.println("ThreadWithClass :" + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("ThreadWithClass is done");
	}

}
