package es171a180;

import javax.swing.*;

public class es174 {
    public static void main(String[] args) {
        //Dato un valore caricare i suoi primi N multipli in un vettore
        int valore = lettura("Inserire valore");
        int n = lettura("Inserire N");
        int[] vettore = new int[n];
        String output ="";
        for (int i = 1; i < n+1; i++) {
            //Se il numero stesso non vale come multiplo mettere 2 al posto di i, se 0 vale come multiplo mettere i = 0. Cambiare anche le []
            vettore[i-1] = valore*i;
            output+= vettore[i-1]+" ";
        }
        JOptionPane.showMessageDialog(null,output);
    }
    public static int lettura(String msg) {
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }
}
