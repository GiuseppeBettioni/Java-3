package main.es90a100;

import javax.swing.*;

public class es97 {
    public static void main(String[] args) {
        //trovare il mcm di due numeri dividendo il prodotto dei due per il loro MCD
        int a = Integer.parseInt(JOptionPane.showInputDialog("Inserire a"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Inserire b"));
        int temp = a*b;
        while (a!=b){
            if (a == 0 || b == 0){
                break;
            }
            if ( a > b ){
                a -=b;
            } else {
                b -= a;
            }
        }
        int risultato = temp/a;
        JOptionPane.showMessageDialog(null,"L mcm vale: "+risultato);
    }
}
