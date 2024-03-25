package esteoria;

import javax.swing.*;

public class teoria16 {
    public static void main(String[] args) {
        //Scrivere un programma DueSequenze che chiede all’utente di inserire due sequenze di stringhe,
        // ciascuna di 5 elementi, e poi stampa il messaggio “OK” se almeno una stringa della prima sequenza compare anche nella seconda,
        // altrimenti stampa il messaggio “NO”. Nel caso in cui le due sequenza abbiano almeno una stringa in comune,
        // i confronti tra le sequenze si devono interrompere non appena una coppia di stringhe uguali viene trovata.
        String[] vettore1 = new String[5];
        String[] vettore2 = new String[5];
        boolean dueSequenza = false;
        for (int i = 0; i < vettore1.length; i++) {
            vettore1[i] = JOptionPane.showInputDialog("Inserire elemento "+i);
        }
        for (int i = 0; i < vettore2.length; i++) {
            vettore2[i] = JOptionPane.showInputDialog("Inserire elemento "+i);
        }
        for (int i = 0; i < vettore1.length; i++) {
            for (int j = 0; j < vettore2.length; j++) {
                if ( vettore1[i].equals(vettore2[j])){
                    dueSequenza = true;
                    break;
                }
            }
        }
        JOptionPane.showMessageDialog(null,dueSequenza?"OK":"NO");
    }
}
