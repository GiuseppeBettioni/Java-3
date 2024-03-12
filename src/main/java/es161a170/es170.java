package es161a170;

import javax.swing.*;

public class es170 {
    public static void main(String[] args) {
        //Shiftare verso destra le componenti di un vettore, assumiamo che l'ultimo diventi il primo
        int lunghezza = lettura("Inserire lunghezza");
        int[] vettore = new int[lunghezza];
        int temp = 0;
        String output ="";
        String outputTest ="";
        int temp2 = 0;
        for (int i = 0; i < lunghezza; i++) {
            vettore[i] = lettura("Inserire "+i+" elemento del vettore");
            outputTest+= vettore[i]+" ";
        }
        for (int i = 0; i < lunghezza; i++) {
            if ( i == lunghezza-1 ) {
                vettore[0] = temp;
            } else if ( i == 0 ) {
                temp = vettore[i+1];
                vettore[i+1] = vettore[i];
            } else {
                temp2 = vettore [i+1];
                vettore[i+1] = temp;
                temp = temp2;
            }

        }
        for (int i = 0; i < lunghezza; i++) {
            output+= vettore[i]+" ";
        }
        JOptionPane.showMessageDialog(null,outputTest+"\n"+output);
    }

    public static int lettura (String msg){
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }
}
