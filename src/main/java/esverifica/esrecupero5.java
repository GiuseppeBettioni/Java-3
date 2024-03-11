package esverifica;

import javax.swing.*;

public class esrecupero5 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Inserire valore"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Inserire valore"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Inserire valore"));
        int max = a;
        if ( b > max){
            max = b;
        }
        if ( c > max ){
            max = c;
        }
        int contatore = 1;
        while (a%contatore == 0){
            contatore++;
        }
        JOptionPane.showMessageDialog(null,contatore);
    }
}
