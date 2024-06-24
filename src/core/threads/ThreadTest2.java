package core.threads;

public class ThreadTest2 implements Runnable {

    @Override
    public void run() {
        System.out.println("Hi, I am run method from the runnable interface..!");
    }

    public static void main(String[] args) {
        Thread t = new Thread(new ThreadTest2());
        t.start();
    }
}
