package cat.paucasesnovescifp.fils.ex1;

public class TacThread extends Thread {
    @Override
    public void run() {
        while(true) {
            System.out.println("TAC");
        }
    }
}
