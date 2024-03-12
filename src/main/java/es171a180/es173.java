package es171a180;

import javax.swing.*;

public class es173 {
    public static void main(String[] args) {
        //Dato un vettore cancellare i dati contigui ripetuti compattando a sinistra,
        // una volta finito dare l'indice dell'ultimo elemento compattato (Inteso come l'ultimo elemento non nullo)
        int lunghezza = lettura("Inserire lunghezza");
        int[] vettore = new int[lunghezza];
        int numeroPrec = 0;
        int elementiEliminati = 0;
        String input ="";
        String output ="";
        for (int i = 0; i < lunghezza; i++) {
            vettore[i] = lettura("Inserire il " + i + " valore");
            input+=vettore[i]+" ";
        }
        //0 1 1 2 2
        //0 1 2 2 null
        //0 1 2 null null
        for (int i = 0; i < lunghezza-elementiEliminati; i++) {
            if (i == 0) {
                numeroPrec = vettore[i];
            } else {
                if (vettore[i] == numeroPrec) {
                    for (int j = i; j < lunghezza - 1 - elementiEliminati; j++) {
                        vettore[j] = vettore[j + 1];
                        if (j + 1 > lunghezza - 1 - elementiEliminati) {
                            vettore[j + 1] = Integer.MIN_VALUE;
                        }
                    }
                    elementiEliminati++;
                    i--;
                }
                numeroPrec = vettore[i];
            }
        }
        for (int i = 0; i < lunghezza-elementiEliminati; i++) {
            output+= vettore[i]+" ";
        }
        JOptionPane.showMessageDialog(null,"Il vettore originale è: "+input+"\nLa versione compattata è: "+output
                +"\nL'indice dell'ultimo elemento è: "+(lunghezza-elementiEliminati-1));

    }

    public static int lettura(String msg) {
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }
}
