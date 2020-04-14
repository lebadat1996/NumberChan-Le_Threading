package Old_EvenThreading;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        OldEvent oldEvent = new OldEvent();
        EventThreading eventThreading = new EventThreading();
        Thread t1 = new Thread(oldEvent);
        Thread t2 = new Thread(eventThreading);
        t2.start();
        t2.join();
        t1.start();
    }
}
