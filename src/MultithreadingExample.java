class MultithreadDemo extends Thread {
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}

public class MultithreadingExample {
    public static void main(String[] args) {
        int n = 5; // Number of threads
        for (int i = 0; i < n; i++) {
            MultithreadDemo thread = new MultithreadDemo();
            thread.start();
        }
    }
}
