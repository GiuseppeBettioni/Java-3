package main.es111a120;

import javax.swing.*;

public class es111 {
    public static void main(String[] args) {
        //Stampare tutti i numeri multipli di n inferiori a m
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire il numero di cui si vogliono stampare i multipli"));
        int m = Integer.parseInt(JOptionPane.showInputDialog("Inserire il valore limite"));
        StringBuilder output = new StringBuilder("I multipli di n minori di m sono: ");
        for (int i = 0; i <= m ; i+=n) {
            output.append(i).append(" ");
        }
        JOptionPane.showMessageDialog(null, output.toString());
    }
}
