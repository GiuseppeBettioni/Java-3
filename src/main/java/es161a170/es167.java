package es161a170;

import javax.swing.*;

public class es167 {
    public static void main(String[] args) {
        //Scambiare le componenti di un vettore in modo simmetrico
        int lunghezza = lettura("Inserire lunghezza");
        int[] vettore = new int[lunghezza];
        int temp = 0;
        String output = "";
        for (int i = 0; i < lunghezza; i++) {
            vettore [i] = lettura("Inserire il "+(i+1)+" elemento del vettore");
            output += vettore[i]+" ";
        }
        for (int i = 0; i < lunghezza/2; i++) {
            temp = vettore[i];
            vettore [i] = vettore[(lunghezza-1-i)];
            vettore [(lunghezza-1-i)] = temp;
        }
        output += "\n";
        for (int i = 0; i < lunghezza; i++) {
            output += vettore[i]+" ";
        }
        JOptionPane.showMessageDialog(null,output);
    }

    public static int lettura (String msg){
        int n = Integer.parseInt(JOptionPane.showInputDialog(msg));
        return n;
    }
}
