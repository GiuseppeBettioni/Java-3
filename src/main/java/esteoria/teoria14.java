package esteoria;

import javax.swing.*;
import java.util.jar.JarOutputStream;

public class teoria14 {
    public static void main(String[] args) {
        //vere un programma TreConsecutivi che prevede un array di 10 numeri interi contenente valori a piacere
        //e stampa “Tre valori consecuitivi uguali” se l’array contiene tre valori uguali in tre posizioni consecutive,
        //oppure stampa “NO” altrimenti. (Il programma deve essere scritto facendo finta di non sapere quali siano i valori inseriti nell’array)
        int dim = lettura("inserire dim");
        int[] vettore = new int[dim];
        for (int i = 0; i < dim; i++) {
            vettore[i] = lettura("Inserire il "+i+" elemento");
        }
        boolean isConsec = true;
        String output ="NO";
        for (int i = 0; i < dim-2; i+=2) {
            for (int j = i; j <= i+2; j++) {
                if (vettore[i] != vettore[j]){
                    isConsec = false;
                }
            }
            if(isConsec){
                output ="Tre valori consecutivi uguali";
            }
            isConsec = true;
        }
        JOptionPane.showMessageDialog(null,output);

    }
    public static int lettura (String msg){
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }
}
