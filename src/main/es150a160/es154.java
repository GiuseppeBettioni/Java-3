package main.es150a160;

import javax.swing.*;

public class es154 {
    public static void main(String[] args) {
        //Dato un vettore ordinato e un valore di confronto stampare gli elementi maggiori del valore
        int lunghezzaArray = lettura("Inserire lunghezza Array");
        int[] vettore = new int[lunghezzaArray];
        int valoreConfronto = lettura("Inserire valore di confronto");
        String output ="";
        for (int i = 0; i < lunghezzaArray; i++) {
            vettore[i] = lettura("Inserire il "+(i+1)+" valore");
            if ( vettore[i]> valoreConfronto){
                output += vettore[i]+" ";
            }
        }
        JOptionPane.showMessageDialog(null,"I valori maggiori del numero di confronto sono: "+output);
    }

    public static int lettura (String msg){
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }
}
