package es171a180;

import javax.swing.*;

public class es176 {
    public static void main(String[] args) {
        //Dato un vettore copiare i valori pari in un nuovo vettore
        int lunghezza = lettura("Inserire lunghezza");
        int[] vettoreOriginale = new int[lunghezza];
        int[] vettore2 = new int[lunghezza];
        int valoriPari = 0;
        String output ="";
        for (int i = 0; i < lunghezza; i++) {
            vettoreOriginale[i] = lettura("Inserire il "+i+" valore");
            if ( vettoreOriginale[i] % 2 == 0 && vettoreOriginale[i] != 0){
                vettore2[valoriPari]= vettoreOriginale[i];
                output += vettore2[valoriPari]+" ";
                valoriPari++;
            }
        }
        JOptionPane.showMessageDialog(null,output);
    }

    public static int lettura(String msg) {
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }
}
