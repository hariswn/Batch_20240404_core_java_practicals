package core.threads;

public class ThreadTest1 extends Thread {

    public void run() {
        System.out.println("I am run method, just started...!");
    }

    public static void main(String[] args) {
        ThreadTest1 tt = new ThreadTest1();
        tt.start();
        tt = new ThreadTest1();
        tt.start();
        tt = new ThreadTest1();
    }
}
