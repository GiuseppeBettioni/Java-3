package es181a190;

import javax.swing.*;
import java.util.Arrays;

public class es189 {
    public static void main(String[] args) {
        //Trovare tutti i numeri primi minori di n con il metodo crivello di Eratostene
        //Si inseriscono i numeri da 2 a N in un vettore
        //2 è primo, si stampa e si cancellano tutti i suoi multipli
        //il primo numero rimasto è primo, si stampa e si cancellano tutti i suoi multipli ecc.
        int n = lettura("Inserire n");
        int[] vettore = new int[n];
        int posizione = 0;
        int primo = 0;
        String output = "";
        for (int i = 2; i < n; i++) {
            vettore[posizione] = i;
            posizione++;
        }
        for (int i = 0; i < vettore.length; i++) {
            if ( i == 0 ) {
                primo = vettore[0];
            }
            for (int j = 0; j < vettore.length; j++) {
                if (vettore[j] % primo == 0 && vettore[j] != primo){
                    for (int k = j; k < vettore.length; k++) {
                        if ( k+1 < vettore.length){
                            vettore[k] = vettore[k+1];
                        }
                    }
                }
            }
        }
        posizione = 0;
        while (vettore[posizione] != 0 ){
            output += vettore[posizione]+" ";
            posizione++;
        }
        JOptionPane.showMessageDialog(null,output);
    }

    public static int lettura (String msg){
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }
}
