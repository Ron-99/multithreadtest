public class Threaded implements Runnable {
    private final String name;
    private final MyObj obj;

    public Threaded(String name, MyObj obj) {
        this.name = name;
        this.obj = obj;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            obj.inc();
            System.out.println(name + ": " + obj.getCount());
        }
    }
}
