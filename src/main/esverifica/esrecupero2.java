package main.esverifica;

import javax.swing.*;

public class esrecupero2 {
    public static void main(String[] args) {
        int min = 0;
        int min2 = 0;
        int cicli = Integer.parseInt(JOptionPane.showInputDialog("Quanti numeri vuoi inserire?"));
        for (int i =1; i <= cicli; i++){
            int n = Integer.parseInt(JOptionPane.showInputDialog("Inserisci un numero."));
            if ( i == 1) {
                min = n;
            } else {
                if (n < min){
                    min2 = min;
                    min = n;
                } else if ( n < min2){
                    min2 = n;
                }
            }
        }
        JOptionPane.showMessageDialog(null,"Il numero minore fra quelli inseriti è: "+min+"\nIl numero immediatamente superiore fra quelli inseriti è: "+min2);
    }
}
