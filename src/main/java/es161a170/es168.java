package es161a170;

import javax.swing.*;

public class es168 {
    public static void main(String[] args) {
        //Leggere un vettore di caratteri e dire se è palindrome, ovvero se è uguale partendo da destra o da sinistra
        int lunghezza = Integer.parseInt(lettura("Inserire lunghezza"));
        char[] vettore = new char[lunghezza];
        boolean isPalindromo = true;
        for (int i = 0; i < lunghezza; i++) {
            vettore[i] = lettura("Inserire carattere").charAt(0);
        }
        for (int i = 0; i < lunghezza; i++) {
            if (vettore[i] != vettore[lunghezza-i-1]){
                isPalindromo = false;
            }
        }
        if (isPalindromo){
            JOptionPane.showMessageDialog(null,"È palindromo");
        } else {
            JOptionPane.showMessageDialog(null,"Non è palindromo");
        }
    }

    public static String lettura (String msg){
        return JOptionPane.showInputDialog(msg);
    }
}
