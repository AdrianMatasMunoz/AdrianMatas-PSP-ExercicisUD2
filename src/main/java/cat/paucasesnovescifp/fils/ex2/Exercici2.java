package cat.paucasesnovescifp.fils.ex2;

public class Exercici2 {
    public static void main(String[] args) {
        Thread tic = new Thread(new TicThread2());
        Thread tac = new Thread(new TacThread2());
        
        tic.start();
        tac.start();
        
        // Es mostren blocs de TIC i blocs de TAC
        // Aixo es per la concurrencia, cada bucle té
        // temps d'executar-se una gran quantitat de
        // vegades abans d'haver de cedir el torn a
        // l'altre fil.
    }
}
