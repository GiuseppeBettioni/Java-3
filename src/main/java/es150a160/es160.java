package es150a160;

import javax.swing.*;

public class es160 {
    public static void main(String[] args) {
        //Dato un vettore di caratteri dire quante volte compaiono due caratteri uguali consecutivamente
        int lunghezza = Integer.parseInt(lettura("Inserire lunghezza array"));
        char[] array = new char[lunghezza];
        char precedente = ' ';
        int contatore = 0;
        for (int i = 0; i < lunghezza; i++) {
            array [i] = lettura("Inserire il: "+(i+1)+" elemento.").charAt(0);
            if ( precedente == array[i]){
                contatore++;
                precedente = ' ';
            } else {
                precedente = array [i];
            }
        }
        JOptionPane.showMessageDialog(null,"Due caratteri uguali appaiono consecutivamente : "+contatore+" volte");
    }
    public static String lettura (String msg){
        String input = JOptionPane.showInputDialog(msg);
        return input;
    }

}
