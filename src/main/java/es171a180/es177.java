package es171a180;

import javax.swing.*;

public class es177 {
    public static void main(String[] args) {
        //Dato un vettore copiare gli elementi di indice pari in un nuovo vettore
        int lunghezza = lettura("inserire lunghezza");
        int[] vettoreOriginale = new int[lunghezza];
        int[] vettore2 = new int[lunghezza/2];
        int elementiPari = 0;
        String output ="";
        for (int i = 0; i < lunghezza; i++) {
            vettoreOriginale[i] = lettura("Inserire il "+i+" elemento");
            if ( i % 2 == 0 && i != 0 ){
                vettore2[elementiPari] = vettoreOriginale[i];
                output+= vettore2[elementiPari]+" ";
                elementiPari++;
            }
        }
        JOptionPane.showMessageDialog(null,output);
    }

    public static int lettura(String msg) {
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }
}
