package es161a170;

import javax.swing.*;

public class es169 {
    public static void main(String[] args) {//Devi fare il 164
        //Generare tutti e soli i numeri inferiori a N che sono un palindromo
        int lunghezza = lettura("Inserire lunghezza");
        int n = lettura("Inserire N");

    }

    public static int lettura (String msg){
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }
}
