package es121a130;

import javax.swing.*;

public class es128 {
    public static void main(String[] args) {
        //Stampare i numeri pari inferiori a N
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire numero"));
        int pari = 2;
        String output = "I numeri pari infeiori a n sono: ";
        for (int i = 1; i*pari< n; i++) {
            output += i*pari+" ";
        }
        JOptionPane.showMessageDialog(null,output);
    }
}
