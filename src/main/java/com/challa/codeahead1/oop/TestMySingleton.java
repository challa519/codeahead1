package com.challa.codeahead1.oop;

public class TestMySingleton implements Runnable {

	public static void main(String[] args) {
		TestMySingleton t = new TestMySingleton();
        TestMySingleton t2 = new TestMySingleton();
        TestMySingleton t3 = new TestMySingleton();
        Thread tt = new Thread(t);
        Thread tt2 = new Thread(t2);
        Thread tt3 = new Thread(t3);
        Thread tt4 = new Thread(t);
        Thread tt5 = new Thread(t);
        tt.start();
        tt2.start();
        tt3.start();
        tt4.start();
        tt5.start();
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + MySingleton.getInst().hashCode());
        }
		
	}

}
