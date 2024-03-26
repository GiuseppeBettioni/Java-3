package es171a180;

import javax.swing.*;

public class es179bis {
    public static void main(String[] args) {
        int n = lettura ("Inserire lunghezza");
        int[] vettore = new int[n];
        int[] decadi = new int[100];
        String output ="";
        for (int i = 0; i < n; i++) {
            vettore[i] = lettura("inserire elemento "+i);
            decadi[vettore[i]/10]++;
        }
        for (int i = 0; i < decadi.length; i++) {
            output += "nella decade: "+i+" ci sono: "+decadi[i]+ " elementi\n";
        }
        System.out.println(output);
    }

    public static int lettura (String msg){
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }
}
