package cat.paucasesnovescifp.fils.ex1;

public class TicThread extends Thread {
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
