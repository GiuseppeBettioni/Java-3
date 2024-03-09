package main.es111a120;

import javax.swing.*;

public class es119 {
    public static void main(String[] args) {
        //Stampare potenze da M a N dei numeri da K a L
        int m = Integer.parseInt(JOptionPane.showInputDialog("Inserire m"));
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire n"));
        int k = Integer.parseInt(JOptionPane.showInputDialog("Inserire k"));
        int l = Integer.parseInt(JOptionPane.showInputDialog("Inserire l"));
        int potenza = 0;
        String output = "Le potenze sono: ";
        for (int i = k; i <= l; i++) {
            for (int j = m; j <= n; j++) {
             potenza = (int) Math.pow(i,j);
             output += potenza + " ";
            }
            output += "\n";
        }
        JOptionPane.showMessageDialog(null,output);
    }
}
