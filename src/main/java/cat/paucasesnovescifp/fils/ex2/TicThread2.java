package cat.paucasesnovescifp.fils.ex2;

public class TicThread2 implements Runnable {
    @Override
    public void run() {
        while(true) {
            System.out.println("TIC");
        }
    }
}
