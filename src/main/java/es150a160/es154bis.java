package es150a160;

import javax.swing.*;

public class es154bis {
    public static void main(String[] args) {
        //Dato un vettore ordinato stampare gli elementi maggiori del valore di confronto
        int lunghezza = lettura("Inserisci lunghezza");
        int[] vettore = new int[lunghezza];
        int confronto = lettura("Inserisci valore confronto");
        int start = 0;
        for (int i = 0; i < lunghezza; i++) {
            vettore[i] = lettura("Inserire valore");
        }
        for (int i = 0; i < lunghezza; i++) {
            if ( vettore[i] > confronto ){
                start = i;
                break;
            }
        }
        String output = "Gli elementi maggiori dle valore di confronto sono: ";
        for (int i = start; i < lunghezza; i++) {
            output += vettore[i];
        }
        JOptionPane.showMessageDialog(null,output);
    }

    public static int lettura (String msg){
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }
}
