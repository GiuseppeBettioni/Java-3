package main.esverifica;

import javax.swing.*;

public class esrecupero1 {
    public static void main(String[] args) {
        int min = 0;
        int max = 0;
        int cicli = Integer.parseInt(JOptionPane.showInputDialog("Quanti numeri vuoi inserire?"));
        for (int i =1; i <= cicli; i++){
            int n = Integer.parseInt(JOptionPane.showInputDialog("Inserisci un numero."));
            if (n < min){
                min = n;
            } else if ( n > max) {
                max = n;
            }
        }
        JOptionPane.showMessageDialog(null,"Il numero minore fra quelli inseriti è: "+min+"\nIl numero maggiore fra quelli inseriti è: "+max);
    }
}
