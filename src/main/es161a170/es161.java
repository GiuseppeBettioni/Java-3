package main.es161a170;

import javax.swing.*;

public class es161 {
    public static void main(String[] args) {
        //Dato un vettore e due valori di confronto stampare indici di valori compresi fra i valori di confronto
        int lunghezza = lettura("Inserire lunghezza vettore");
        int valore1 = lettura("Inserire primo valore di confronto");
        int valore2 = lettura("Inserire secondo valore di confronto");
        int[] vettore = new int [lunghezza];
        String output ="Gli indici dei valori compresi fra quelli di confronto sono: ";
        int temp =0;
        if ( valore1 > valore2 ){
            temp = valore1;
            valore1 = valore2;
            valore2 = temp;
        }
        for (int i = 0; i < lunghezza; i++) {
            vettore[i] = lettura("Inseire il "+(i+1)+" elemento");
            if (vettore[i] > valore1 && vettore[i] < valore2){
                output += i +" ";
            }
        }
        JOptionPane.showMessageDialog(null,output);
    }
    public static int lettura (String msg){
        int n = Integer.parseInt(JOptionPane.showInputDialog(msg));
        return n;
    }
}
