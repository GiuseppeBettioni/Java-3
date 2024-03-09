package main.es131a140;

import javax.swing.*;

public class es131 {
    public static void main(String[] args) {
        //Stampare numeri dispari partendo da n e arrivando a 1 con for positivo e unitario
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire valore n"));
        if ( n % 2 == 0){
            n--;
        }
        int ciclo = n;
        String output = "I numeri dispari partendo da n e arrivando a 1 sono: ";
        for (int i = ciclo; i < 2*ciclo ; i++) {
            if ( n % 2 != 0 ){
                output+= n + " ";
                n--;
            } else {
                n--;
            }
        }
        JOptionPane.showMessageDialog(null,output);
    }
}
