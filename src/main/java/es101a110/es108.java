package es101a110;

import javax.swing.*;

public class es108 {
    public static void main(String[] args) {
        //Sommare i numeri interi multipli di 5 compresi fra m e n
        int m =Integer.parseInt(JOptionPane.showInputDialog("Inserire il limite inferiore"));
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire il limite superiore"));
        int somma = 0;
        while ( m % 5 != 0){
            m++;
        }
        for (int i = m; i <= n; i+=5) {
            somma += i;
        }
        JOptionPane.showMessageDialog(null,"La somma dei valori multipli di 5 compresi fra m e n vale: "+somma);
    }
}
