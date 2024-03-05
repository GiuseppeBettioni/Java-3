package es150a160;

import javax.swing.*;

public class es158 {
    public static void main(String[] args) {
        //Inseire dei dati in un vettore e calcolare di ciascuno la percentuale di incidenza sul totale
        int lunghezza = lettura("Inserire lunghezza vettore");
        int[] vettore = new int[lunghezza];
        int somma = 0;
        for (int i = 0; i < lunghezza; i++) {
            vettore[i] = lettura("Inserire il "+(i+1)+" elemento");
            somma += vettore[i];
        }
        String output = "";
        double temp = 0;
        for (int i = 0; i < lunghezza; i++) {
            temp = ((double) vettore[i] / somma) * 100;
            //output += "Il "+(i+1)+" elemento corrisponde al: "+temp+"% del totale.\n";
            output += String.format("Il %d corrisponde al: %.2f %s del totale\n",i+1,temp,"%");
        }
        JOptionPane.showMessageDialog(null,output);
    }

    public static int lettura (String msg){
        int n = Integer.parseInt(JOptionPane.showInputDialog(msg));
        return n;
    }
}
