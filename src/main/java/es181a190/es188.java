package es181a190;

import javax.swing.*;
import java.util.Arrays;

public class es188 {
    public static void main(String[] args) {
        //Stabilire se un numero è primo provando come divisori solo i numeri primi precedenti
        int n = lettura("Inserire numero n");
        int[] vettoreNumeriPrimi = new int[n/2];
        int posizione = 0;
        int divisori = 0;
        for (int i = 2; i < n; i++) {
            divisori = 0;
            for (int j = 2; j < i; j++) {
                if ( i % j == 0 ){
                    divisori++;
                }
            }
            if ( divisori == 0 ){
                vettoreNumeriPrimi[posizione] = i;
                posizione++;
            }
        }
        divisori = 0;
        for (int i = 0; i < posizione; i++) {
            if ( n % vettoreNumeriPrimi[i] == 0 ){
                divisori++;
            }
        }
        if ( n >= 2  && divisori==0){
            JOptionPane.showMessageDialog(null,"È primo");
        } else {
            JOptionPane.showMessageDialog(null,"Non è primo");
        }
        System.out.println(Arrays.toString(vettoreNumeriPrimi));
    }

    public static int lettura (String msg){
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }
}
