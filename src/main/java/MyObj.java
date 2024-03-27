import java.util.concurrent.atomic.AtomicInteger;

public class MyObj {
    private final AtomicInteger counter = new AtomicInteger(0);

    public void inc() {
        counter.incrementAndGet();
    }

    public int getCount() {
        return counter.get();
    }
}
