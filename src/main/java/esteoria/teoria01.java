package esteoria;

import javax.swing.*;

public class teoria01 {
    public static void main(String[] args) {
        //Scrivere un programma che chiede all'utente di insererire una sequenza di interi, numero scelto dall'utente
        //al termine dell'inserimento stampa Tutti positivi e pari se sono tutti positivi e pari altrimenti stampa no.
        String messaggio = "Inserire quanti numeri vuoi inserire.";
        boolean risultato = true;
        int sequenza = lettura(messaggio);
        messaggio = "Inserire numero.";
        while (sequenza > 0){
            int numero = lettura(messaggio);
            risultato = controllo(numero,risultato);
            sequenza--;
        }
        stampa(risultato);
    }
    public static int lettura (String messaggio){
        int n = Integer.parseInt(JOptionPane.showInputDialog(messaggio));
        return n;
    }
    public  static boolean controllo ( int numero, boolean risultato ){
        return risultato && numero % 2 == 0 && numero >= 0;
    }
    public static void stampa (boolean risultato){
        if (risultato){
            JOptionPane.showMessageDialog(null,"Tutti positivi e pari");
        } else {
            JOptionPane.showMessageDialog(null,"NO");
        }
    }
}
