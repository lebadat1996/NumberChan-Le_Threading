package Old_EvenThreading;

import static java.lang.Thread.sleep;

public class OldEvent extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i = i + 2) {
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
