package es150a160;

import javax.swing.*;

public class es159 {
    public static void main(String[] args) {
        //leggo n e leggo il vettore d
        //Mentre leggo il vettore d trova anche il max
        //Trovato il massimo calcolo il vettore s effettuando un ciclo e impostando s[i] = d[i] * 100 / max
        int lunghezza = lettura("Inserire lunghezza");
        int[] vettore = new int[lunghezza];
        int[] vettoreS = new int[lunghezza];
        int max = 0;
        String output ="";
        for (int i = 0; i < lunghezza; i++) {
            vettore [i] = lettura("Inserire il "+i+" elemento");
            if ( i == 0 ){
                max = vettore[i];
            } else if ( vettore[i] > max ){
                max = vettore[i];
            }
        }
        for (int i = 0; i < lunghezza; i++) {
            vettoreS[i] = vettore[i] * 100 / max;
            output+= vettoreS[i]+"% ";
        }
        JOptionPane.showMessageDialog(null,output);
    }

    public static int lettura (String msg){
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }
}
