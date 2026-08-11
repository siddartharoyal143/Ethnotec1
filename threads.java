class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running");
        System.out.println(Thread.currentThread().getName());

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
                System.out.println("hello world");
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class threads {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread());

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();
        t2.start();
    }
}