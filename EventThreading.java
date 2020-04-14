package Old_EvenThreading;

public class EventThreading implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 11; i = i + 2) {
            System.out.print("number:" + i + " ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}
