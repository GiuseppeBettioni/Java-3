package main.es111a120;

import javax.swing.*;

public class es117 {
    public static void main(String[] args) {
        //Sommare le potenze di due con esponente da M a N
        int m = Integer.parseInt(JOptionPane.showInputDialog("Inserire m"));
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire n"));
        int somma = 0;
        for (int i = m; i <= n; i++) {
            somma += Math.pow(2,i);
        }
        JOptionPane.showMessageDialog(null,somma);
    }
}
