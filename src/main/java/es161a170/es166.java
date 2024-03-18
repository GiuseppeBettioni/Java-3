package es161a170;

import javax.swing.*;

public class es166 {
    public static void main(String[] args) {
        //Scambiare i valori di un vettore in modo simmetrico
        int lunghezza = lettura("Inserire lunghezza vettore");
        int[] vettore1 = new int[lunghezza];
        int[] vettore2 = new int [lunghezza];
        int temp = 0;
        String output ="";
        for (int i = 0; i < lunghezza; i++) {
            vettore1[i] = lettura("Inserire "+i+" elemento del vettore");
        }
        for (int i = 0; i < lunghezza; i++) {
            vettore2[i] = vettore1[lunghezza-1-i];
        }
        for (int i = 0; i < lunghezza; i++) {
            output += vettore2[i]+" ";
        }
        JOptionPane.showMessageDialog(null,output);
    }

    public static int lettura (String msg){
        int n = Integer.parseInt(JOptionPane.showInputDialog(msg));
        return n;
    }
}
