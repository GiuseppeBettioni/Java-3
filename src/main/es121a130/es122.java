package main.es121a130;

import javax.swing.*;

public class es122 {
    public static void main(String[] args) {
        //Dato un numero n dire la differenza fra la somma di tutti i numeri pari e quella di tutti i numeri dispari inferiori.
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Inserire numero"));
        int risultato = 0;
        for (int i = 0; i < numero; i++) {
            if ( i % 2 == 0){
                risultato += i;
            } else {
                risultato -= i;
            }
        }
        JOptionPane.showMessageDialog(null,"IL risultato vale: "+risultato);
    }
}
