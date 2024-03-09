package main.es150a160;

import javax.swing.*;

public class es157 {
    public static void main(String[] args) {
        //Dati due vettori costruire un terzo vettore che contenga il valore minimo dei primi due
        int lunghezza = lettura ("Inserire lunghezza array");
        int [] vettore1 = new int[lunghezza];
        int [] vettore2 = new int[lunghezza];
        int [] vettore3 = new int[lunghezza];
        String output = "Il terzo vettore è composto da: ";
        for (int i = 0; i < lunghezza; i++) {
            vettore1 [i] = lettura("Inserire il "+(i+1)+" elemento del primo array");
            vettore2 [i] = lettura("Inserire il "+(i+1)+" elemento del secondo array");
            if (vettore1[i] > vettore2[i] ){
                vettore3 [i] = vettore2 [i];
            } else {
                vettore3 [i] = vettore1 [i];
            }
            output += vettore3 [i]+" ";
        }
        JOptionPane.showMessageDialog(null,output);

    }
    public static int lettura (String msg){
        int n = Integer.parseInt(JOptionPane.showInputDialog(msg));
        return n;
    }
}
