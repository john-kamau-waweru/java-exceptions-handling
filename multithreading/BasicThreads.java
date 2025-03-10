package multithreading;

class Thread1 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread 1 is running");
    }
}

class Thread2 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread 2 is running");
    }
}

class MyThread1 implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("My Thread Running...!");

            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }
    }
}

public class BasicThreads {
    public static void main(String[] args) {
        Thread t1 = new Thread1();
        Thread t2 = new Thread2();

        Runnable rt1 = new MyThread1();

        Thread newRT1 = new Thread(rt1);

        newRT1.start();

        t1.start();
        t2.start();
    }
}
