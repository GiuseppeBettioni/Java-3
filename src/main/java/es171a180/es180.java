package es171a180;

import javax.swing.*;

public class es180 {
    public static void main(String[] args) {
        //Data una serie di temperatura, dire quante sono nel range
        // < -10, da -9 a 0, da 1 a 10, da 11 a 20, da 21 a 30, da31 a 40, >= 41
        //case -9 ... 0
        int lunghezza = lettura("Inserire lunghezza");
        int[] vettore = new int[lunghezza];
        int[] vettoreTemperature = new int[7];
        String output ="";
        for (int i = 0; i < lunghezza; i++) {
            vettore[i] = lettura("Inserire il "+i+" elemento");
            if ( vettore[i] <= -10 ){
                vettoreTemperature [0] ++;
            } else if ( vettore[i] <= 0 ){
                vettoreTemperature[1]++;
            } else if (vettore[i] <= 10 ){
                vettoreTemperature[2]++;
            } else if (vettore[i] <= 20 ){
                vettoreTemperature[3]++;
            } else if (vettore[i] <= 30 ){
                vettoreTemperature[4]++;
            } else if ( vettore[i] <= 40 ){
                vettoreTemperature[5]++;
            } else {
                vettoreTemperature[6]++;
            }
        }
        for (int i = 0; i < 7; i++) {
            if ( i != 6 ){
                output+= "Ci sono: "+vettoreTemperature[i]+" temperature uguale o minori di: "+(-10+(i*10))+"\n";
            } else {
                output+="Ci sono: "+vettoreTemperature[i]+" temperature sopra a: 41";
            }
        }
        JOptionPane.showMessageDialog(null,output);
    }
    public static int lettura(String msg) {
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }
}
