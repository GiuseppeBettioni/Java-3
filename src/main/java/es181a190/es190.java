package es181a190;

import javax.swing.*;

public class es190 {
    public static void main(String[] args) {
        //Dato un vettore di numeri estrarre i primi 3 numeri dispari.
        //Se non ci sono tre numeri dispari completare con numeri pari
        //Se non ci sono tre numeri completare con zeri
        int dim = lettura("Inserire dimensione");
        int[] vettore = new int[dim];
        int numeriPresi = 0;
        int opzione = 0;
        String output = "";
        for (int i = 0; i < vettore.length; i++) {
            vettore[i] = lettura("inserire elemento "+i);
        }
        while ( numeriPresi < 3 || opzione < 3){
            for (int i = 0; i < vettore.length; i++) {
                if ( numeriPresi < 3){
                    if ( opzione == 0 ){
                        if (vettore[i] % 2 == 1 ){
                            output += vettore[i]+" ";
                            numeriPresi++;
                        }
                    } else if ( opzione == 1 ){
                        if (vettore[i] % 2 == 0 && vettore[i] != 0 ){
                            output += vettore[i]+" ";
                            numeriPresi++;
                        }
                    } else {
                        if ( vettore[i] == 0 ){
                            output+= vettore[i]+" ";
                            numeriPresi++;
                        }
                    }
                }
            }
            opzione++;
        }
        JOptionPane.showMessageDialog(null,output);
    }

    public static int lettura (String msg){
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }
}
