package es161a170;

import javax.swing.*;

public class es169 {
    public static void main(String[] args) {//Devi fare il 164
        //Generare tutti e soli i numeri inferiori a N che sono un palindromo
        int n = lettura("Inserire N");
        String cifre = String.valueOf(n);
        int lunghezza = cifre.length();
        int lunghezzaI = 0;
        int[] vettore = new int[lunghezza];
        int listaNumeri = 0;
        boolean isPalindromo = true;
        String output = "I numeri palindromi minori di N sono: ";
        for (int i = 0; i < n; i++) {
            cifre = String.valueOf(i);
            lunghezzaI = cifre.length();
            listaNumeri = i;
            for (int j = 0; j < lunghezzaI; j++) {
                vettore[j] = listaNumeri % 10;
                listaNumeri /= 10;
            }
            for (int j = 0; j < lunghezzaI; j++) {
                if ( vettore[j] != vettore[lunghezzaI-1-j]){
                    isPalindromo = false;
                }
            }
            if (isPalindromo){
                output += i+" ";
            }
            isPalindromo = true;
        }
        JOptionPane.showMessageDialog(null,output);
    }

    public static int lettura (String msg){
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }
}
