class count {
    int count = 0;
    synchronized  void increment()
    {
        //System.out.println( " is incrementing the count");
        count++;

    }
    int getcount() {
        return count;

    }
}
public class testcount extends Thread {
    count c;
    
    testcount(count c) {
        this.c = c;
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            c.increment();
        }
    }
    
    public static void main(String[] args) throws InterruptedException {
        count c = new count();
        testcount t1 = new testcount(c);
        testcount t2 = new testcount(c);
        
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Count: " + c.getcount());
    }
}