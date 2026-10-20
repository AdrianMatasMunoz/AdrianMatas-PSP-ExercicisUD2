package cat.paucasesnovescifp.fils.ex1;

public class TicThread extends Thread {
    @Override
    public void run() {
        while(true) {
            System.out.println("TIC");
        }
    }
}
