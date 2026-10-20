package cat.paucasesnovescifp.fils.ex1;

public class Exercici1 {
    public static void main(String[] args) {
        TicThread tic = new TicThread();
        TacThread tac = new TacThread();
        
        tic.start();
        tac.start();
        
        // Es mostren blocs de TIC i blocs de TAC
        // Aixo es per la concurrencia, cada bucle té
        // temps d'executar-se una gran quantitat de
        // vegades abans d'haver de cedir el torn a
        // l'altre fil.
    }
}
