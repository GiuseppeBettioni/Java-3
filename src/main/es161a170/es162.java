package main.es161a170;

import javax.swing.*;

public class es162 {
    public static void main(String[] args) {
        //Data la temperatura di una città in un mese stampare la temperatura media e i giorni in cui la temperatura è stata maggiore della media
        int lunghezza = lettura("Inserire lunghezza");
        int[] temperaturaArray = new int[lunghezza];
        int somma = 0;
        int media = 0;
        String output = "I giorni con le temperature maggiori della media sono: ";
        for (int i = 0; i < lunghezza; i++) {
            temperaturaArray [i] = lettura("Inserire la temperatura del "+(i+1)+" giorno");
            somma += temperaturaArray [i];
        }
        media = somma / lunghezza;
        for (int i = 0; i < lunghezza; i++) {
            if ( temperaturaArray[i] > media ){
                output += (i+1) +" ";
            }
        }
        JOptionPane.showMessageDialog(null,output);
    }
    public static int lettura (String msg){
        int n = Integer.parseInt(JOptionPane.showInputDialog(msg));
        return n;
    }
}
