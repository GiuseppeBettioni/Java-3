package esteoria;

import javax.swing.*;
import java.util.Arrays;

public class teoria18 {
    public static void main(String[] args) {
        //Scrivere un programma SecondoArray che chiede all’utente di inserire 10 numeri interi e li memorizza in un array.
        // Successivamente, crea un nuovo array di dimensione pari al numero di valori maggiori o uguali a zero inseriti dall’utente.
        // Copia tutti i valori maggiori o uguali a zero nel nuovo array e ne stampa i valori in ordine inverso.
        int[] vettore = new int[10];
        int magg = 0;
        String output = "";
        for (int i = 0; i < vettore.length; i++) {
            vettore[i] = Integer.parseInt(JOptionPane.showInputDialog("Inserire elemento "+i));
        }
        for (int i = 0; i < vettore.length; i++) {
            if ( vettore[i] > 0) {
                magg++;
            }
        }
        int[] vettore2 = new int[magg];
        int posizione = 0;
        for (int i = 0; i < vettore.length; i++) {
            if ( vettore[i] > 0 ){
                vettore2[posizione] = vettore[i];
                posizione++;
            }
        }
        for (int i = vettore2.length-1; i >+ 0; i--) {
            output += vettore2[i] + " ";
        }
        JOptionPane.showMessageDialog(null,output+"\n"+ Arrays.toString(vettore2)+"\n"+Arrays.toString(vettore));
    }
}
