package es181a190;

import javax.swing.*;

public class es184 {
    public static void main(String[] args) {
        //Dato un vettore di elementi numerici visualizzare la distribuzione dei valori e la loro frequenza
        int dim = lettura("Inserire lunghezza vettore");
        int[] vettore = new int[dim];
        int[] contenitore = new int[dim];
        int contatore = 1;
        String output="";
        int ripetizione = 0;
        for (int i = 0; i < dim; i++) {
            vettore[i] = lettura("Inserire il "+i+" elemento");
            contenitore[i] = Integer.MIN_VALUE;
        }
        for (int i = 0; i < dim; i++) {
            contatore = 0;
            contenitore[i] = vettore[i];
            ripetizione = 0;
            for (int j = 0; j < dim; j++) {
                if ( contenitore[i] == contenitore[j]){
                    ripetizione++;
                }
            }
            if (ripetizione < 2){
                for (int j = 0; j < dim; j++) {
                    if ( contenitore[i] == vettore[j]){
                        contatore++;
                    }
                }
                output+= "Il numero "+contenitore[i]+" compare "+contatore+" volte.\n";
            }
        }
        JOptionPane.showMessageDialog(null,output);
    }

    public static int lettura (String msg){
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }
}
