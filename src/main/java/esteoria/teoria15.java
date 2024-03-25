package esteoria;

import javax.swing.*;

public class teoria15 {
    public static void main(String[] args) {
        //Scrivere un programma DoppioUnoDellaltro che he prevede un array di 10 numeri interi contenente valori a piacere
        // e stampa “Doppio uno dell’altro” se nell’array sono presenti due valori che sono l’uno il doppio dell’altro, oppure stampa “NO” altrimenti.
        // (Il programma deve essere scritto facendo finta di non sapere quali siano i valori inseriti nell’array)
        int dim = lettura("Inserire dim");
        int[] vettore = new int[dim];
        boolean isDoppio = false;
        for (int i = 0; i < dim; i++) {
            vettore[i] = lettura("Inserire elemento "+i);
        }
        for (int i = 0; i < dim; i++) {
            for (int j = i; j < dim; j++) {
                if ( vettore[i] == vettore[j]*2 && vettore[i] != 0 || vettore[i]*2 == vettore[j] && vettore[i] !=0){
                    isDoppio = true;
                }
            }
        }
        JOptionPane.showMessageDialog(null,isDoppio?"Doppo uno dell'altro.":"NO");
    }

    public static int lettura (String msg){
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }
}
