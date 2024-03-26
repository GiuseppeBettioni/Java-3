package es191a200;

import javax.swing.*;
import java.util.Arrays;

public class es191 {
    public static void main(String[] args) {
        //In un vettore di 12 elementi corrispondenti ai mesi inserire il numero di giorni di ciascun mese, chiesto poi un mese dire quanti giorni ci sono
        int[] vettoreMesi = new int[12];
        for (int i = 0; i < 12; i++) {
            switch (i+1){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    vettoreMesi[i] = 31;
                    break;
                case 2:
                    vettoreMesi[i] = 28;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    vettoreMesi[i] = 30;
                    break;
                default:
                    break;
            }
        }
        int n = Integer.parseInt(JOptionPane.showInputDialog("Di quale mese vuoi sapere i giorni?"));
        //System.out.println(Arrays.toString(vettoreMesi));
        for (int i = 0; i < n; i++) {
            if ( n-1 == i ){
                JOptionPane.showMessageDialog(null,"Nel mese: "+n+" ci sono: "+vettoreMesi[i]+" giorni");
            }
        }

    }
}
