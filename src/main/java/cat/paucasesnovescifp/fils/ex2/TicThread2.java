package cat.paucasesnovescifp.fils.ex2;

import static java.lang.Thread.sleep;

public class TicThread2 implements Runnable {
    @Override
    public void run() {
        try {
            while(true) {
                System.out.println("TIC");
                sleep(1000);
            }
        } catch(InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
