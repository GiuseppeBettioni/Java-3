package es171a180;

import javax.swing.*;

public class es175 {
    public static void main(String[] args) {
        //Dato un valore calcolare i suoi divisori in un vettore
        int valore = lettura("Inserire valore");
        int numDivisori = 0;
        int indice = 0;
        String output ="";
        for (int i = 1; i <= valore; i++) {
            if ( valore % i == 0 ){
                numDivisori++;
            }
        }
        int [] vettore = new int[numDivisori];
        for (int i = 1; i <= valore; i++) {
            if (valore % i == 0 ){
                vettore[indice] = i;
                output+= vettore[indice]+" ";
                indice++;

            }
        }
        JOptionPane.showMessageDialog(null, output);
    }

    public static int lettura(String msg) {
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }
}
