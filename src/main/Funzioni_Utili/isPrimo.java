package main.Funzioni_Utili;

import javax.swing.*;

public class isPrimo {
    public static boolean isPrimo (int n) {
        // Dato un numero che prende il nome di n ma può essere tutto anche i di un ciclo for
        // return a boolean vero sè il numero è primo, falso se non è primo.
        // div == 0 perchè il ciclo parte da 2 e arriva a n-1
        int div = 0;
        for (int j = 2; j < n; j++) {
            if ( n % j == 0 ){
                div++;
            }
        }
        if ( div == 0 ){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire n"));
        int somma = 0;
        for (int i = 1; i < n; i++) {
            if (isPrimo(i)){
                somma += i;
            }
        }
        JOptionPane.showMessageDialog(null,somma);
    }
}
