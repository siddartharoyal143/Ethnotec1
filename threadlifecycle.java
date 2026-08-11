class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread is running");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class threadlifecycle {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        MyThread mtlc = new MyThread();
        MyThread mtlc2 = new MyThread();
        mtlc.setName("MyThread");
        mtlc2.setName("MyThread2");
        mtlc.start();
        mtlc2.start();
        mtlc.join();
        mtlc2.join();
        System.out.println("Thread state after completion: " + mtlc.getState());
        System.out.println("Thread2 state after completion: " + mtlc2.getState());
    }
}
