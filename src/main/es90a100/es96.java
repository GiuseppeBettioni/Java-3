package main.es90a100;

import javax.swing.*;

public class es96 {
    public static void main(String[] args) {
        //trovare MCD di due numeri
        int a = Integer.parseInt(JOptionPane.showInputDialog("Inserire a"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Inserire b"));
        int mcd = 1;
        int contatore = 1;
        while ( contatore <= Math.min(a,b)){
            if ( a % contatore == 0 && b % contatore == 0){
                mcd = contatore;
            }
            contatore++;
        }
        JOptionPane.showMessageDialog(null,mcd);
    }
}
