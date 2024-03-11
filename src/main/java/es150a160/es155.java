package es150a160;

import javax.swing.*;

public class es155 {
    public static void main(String[] args) {
        //Calcolare la somma dei numeri pari di un vettore
        int lunghezzaArray = lettura("Inserire lunghezza Array");
        int[] vettore = new int[lunghezzaArray];
        int pari = 0;
        for (int i = 0; i < lunghezzaArray; i++) {
            vettore[i] = lettura("Inserire il "+(i+1)+" elemento.");
            if ( vettore[i] % 2 == 0 ){
                pari+= vettore[i];
            }
        }
        JOptionPane.showMessageDialog(null,"La somma vale: "+pari);
    }
    public static int lettura (String msg){
        int n = Integer.parseInt(JOptionPane.showInputDialog(msg));
        return n;
    }
}
