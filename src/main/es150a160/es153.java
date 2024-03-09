package main.es150a160;

import javax.swing.*;

public class es153 {
    public static void main(String[] args) {
        //Dato un vettore dire quanti elementi sono positivi, negativi, o nulli
        int lunghezzaArray = lettura("Inserire quanto sarà lungo l'array?");
        int[] vettore = new int[lunghezzaArray];
        int nulli = 0;
        int positivi = 0;
        int negativi = 0;
        for (int i = 0; i < lunghezzaArray; i++) {
            vettore[i] = lettura("Inserire "+(i+1)+" elemento dell'array");
            if ( vettore[i] == 0 ){
                nulli++;
            } else if ( vettore[i] > 0 ){
                positivi++;
            }else {
                negativi++;
            }
        }
        JOptionPane.showMessageDialog(null,"Ci sono: "+nulli+" zero\n"+positivi+" positivi\n"+negativi+" negativi.");
    }

    public static int lettura (String msg){
        int n = Integer.parseInt(JOptionPane.showInputDialog(msg));
        return n;
    }
}
