package es181a190;

import javax.swing.*;

public class es186 {
    public static void main(String[] args) {
        //Dato un vettore (Assumo che sia int) stampare una sola volta tutti i dati che compaiono, usando un vettore ausiliare
        int dim = lettura("Inserire lunghezza");
        int[] vettore = new int[dim];
        int[] contenitore = new int[dim];
        int ripetizione = 0;
        String output = "";
        for (int i = 0; i < dim; i++) {
            vettore[i] = lettura("Inserire il "+i+" elemento");
            contenitore[i] = Integer.MIN_VALUE;
        }
        for (int i = 0; i < dim; i++) {
            contenitore[i] = vettore[i];
            ripetizione = 0;
            for (int j = 0; j < dim; j++) {
                if ( contenitore[i] == contenitore[j]){
                    ripetizione++;
                }
            }
            if ( ripetizione < 2 ){
                output+= contenitore[i]+" ";
            }
        }
        JOptionPane.showMessageDialog(null,output);
    }

    public static int lettura (String msg){
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }
}
