package main.esverifica;

import javax.swing.*;

public class esrecupero3 {
    public static void main(String[] args) {
       int numero = Integer.parseInt(JOptionPane.showInputDialog("Inserire numero di cui si vuole sapere radice quadrata"));
       int i = 1;
       for (i = 1; i*i <= numero; i++){
       }
       JOptionPane.showMessageDialog(null,"La radice intera di: "+numero+" è: "+(i-1));
    }
}
