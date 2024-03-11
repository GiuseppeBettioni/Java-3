package es111a120;

import javax.swing.*;

public class es118 {
    public static void main(String[] args) {
        //Calcolare le potenze da M a N di un numero inserito
        int input = Integer.parseInt(JOptionPane.showInputDialog("Inserire numero"));
        int m = Integer.parseInt(JOptionPane.showInputDialog("Inserire m"));
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire n"));
        int somma = 0;
        for (int i = m; i <= n; i++) {
            somma += Math.pow(input,i);
        }
        JOptionPane.showMessageDialog(null,somma);
    }
}
