package es150a160;

import javax.swing.*;

public class es154 {
    public static void main(String[] args) {
        //Dato un vettore ordinato e un valore di confronto stampare gli elementi maggiori del valore
        int lunghezzaArray = lettura("Inserire lunghezza Array");
        int[] vettore = new int[lunghezzaArray];
        int valoreConfronto = lettura("Inserire valore di confronto");
        int contatoreMagg = 0;
        for (int i = 0; i < lunghezzaArray; i++) {
            vettore[i] = lettura("Inserire il "+(i+1)+" valore");
            if ( vettore[i]> valoreConfronto){
                contatoreMagg++;
            }
        }
        JOptionPane.showMessageDialog(null,"Ci sono: "+contatoreMagg+" elementi maggiori del valore di confronto");
    }

    public static int lettura (String msg){
        int n = Integer.parseInt(JOptionPane.showInputDialog(msg));
        return n;
    }
}
