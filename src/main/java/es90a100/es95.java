package es90a100;

import javax.swing.*;

public class es95 {
    public static void main(String[] args) {
        //Calcolare la somma delle cifre di un numero;
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire n"));
        int k = n;
        int somma = 0;
        while ( k > 0){
            somma += k % 10;
            k /= 10;
        }
        JOptionPane.showMessageDialog(null,"La somma delle cifre di n vale: "+somma);
    }
}
