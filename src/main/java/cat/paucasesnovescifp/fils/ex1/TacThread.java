package cat.paucasesnovescifp.fils.ex1;

import static java.lang.Thread.sleep;

public class TacThread extends Thread {
    @Override
    public void run() {
        try {
            while(true) {
                sleep(500);
                System.out.println("TAC");
                sleep(500);
            }
        } catch(InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
