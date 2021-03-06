
public class BasicThreadFunctionalityDemo {

    public static void main(String[] args) {

        new UThread().start();
        
        Thread t0 = new UThread();
        System.out.println(t0);
        t0.setName("myThread0");
        System.out.println(t0);
        System.out.println("main thread works");
        Thread t1 = new UThread();
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {}
        System.out.println("main thread has ended");
    }
}

class UThread extends Thread {

    @Override
    public void run() {

        System.out.println("start");
        try {
            currentThread().sleep(2000);
        } catch (InterruptedException e) {}
        System.out.println("end");
    }
}

