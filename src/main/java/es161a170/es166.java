package es161a170;

import javax.swing.*;

public class es166 {
    public static void main(String[] args) {
        //Scambiare i valori di due vettori in modo simmetrico
        int lunghezza = lettura("Inserire lunghezza vettori");
        int[] vettore1 = new int[lunghezza];
        int[] vettore2 = new int[lunghezza];
        int temp = 0;
        String output ="";
        String output2 ="";
        for (int i = 0; i < lunghezza; i++) {
            vettore1[i] = lettura("Inserire "+(i+1)+" valore del primo vettore");
            vettore2[i] = lettura("Inserire "+(i+1)+" valore del secondo vettore");
        }
        for (int i = 0; i < lunghezza; i++) {
            temp = vettore1 [i];
            vettore1[i] = vettore2 [lunghezza-1-i];
            vettore2 [lunghezza-1-i] = temp;
        }
        for (int i = 0; i < lunghezza; i++) {
            output += vettore1[i]+" ";
            output2 += vettore2[i]+" ";
        }
        JOptionPane.showMessageDialog(null,output+"\n"+output2);
    }

    public static int lettura (String msg){
        int n = Integer.parseInt(JOptionPane.showInputDialog(msg));
        return n;
    }
}
