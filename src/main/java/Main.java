import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        var threads = new ArrayList<Thread>();

        MyObj obj = new MyObj();
        for (int i = 0; i < 3; i++) {
            Threaded t = new Threaded("Thread " + i, obj);
            Thread thread = new Thread(t);
            threads.add(thread);
            thread.start();
        }
        for (var thread : threads) {
            thread.join();
        }
        System.out.println(obj.getCount());
    }
}
