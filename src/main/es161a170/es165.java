package main.es161a170;

import javax.swing.*;

public class es165 {
    public static void main(String[] args) {
        //Calcolare la somma dei valori di indice pari di un vettore
        int lunghezza = lettura("Inserire lunghezza");
        int[] vettore = new int[lunghezza];
        int somma = 0;
        for (int i = 0; i < lunghezza; i++) {
            vettore [i] = lettura("Inserire valore del "+(i+1)+" elemento");
            if ( i % 2 == 0 && i != 0 ){
                somma += vettore[i];
            }
        }
        JOptionPane.showMessageDialog(null,"La somma vale: "+somma);
    }

    public static int lettura (String msg){
        int n = Integer.parseInt(JOptionPane.showInputDialog(msg));
        return n;
    }
}
