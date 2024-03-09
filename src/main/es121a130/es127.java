package main.es121a130;

import javax.swing.*;

public class es127 {
    public static void main(String[] args) {
        //Stampare valori da -1 a N negativo con un ciclo for usando un passo positivo
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserisci n"));
        String output = "I numeri sono: ";
        if ( n < 0){
            n = -n;
        }
        for (int i = 1; i < n; i++) {
            output += "-"+i+" ";
        }
        JOptionPane.showMessageDialog(null,output);
    }
}
