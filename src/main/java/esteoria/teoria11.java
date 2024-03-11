package esteoria;

import javax.swing.*;

public class teoria11 {
    public static void main(String[] args) {
        //. Calcolare il numero di passaggi necessari per raggiungere il numero 1 seguendo la sequenza di Collatz a partire da un dato numero intero.
        //La sequenza di Collatz si ottiene applicando iterativamente le seguenti regole:
        //    - Se il numero è pari, lo si divide per 2.
        //    - Se il numero è dispari, lo si moltiplica per 3 e si aggiunge 1.
        //   Ad esempio, la sequenza di Collatz per il numero 6 è: 6 -> 3 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1.
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire n"));
        int numeroPassaggi = 0;
        while ( n > 1){
            if (n%2 == 0){
                n /= 2;
                numeroPassaggi++;
            } else {
                n = n*3 +1;
                numeroPassaggi++;
            }
        }
        JOptionPane.showMessageDialog(null,"Ci sono voluti: "+numeroPassaggi+" passaggi");
    }
}
