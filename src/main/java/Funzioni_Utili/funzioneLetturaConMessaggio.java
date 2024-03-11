package Funzioni_Utili;

import javax.swing.*;

public class funzioneLetturaConMessaggio {
    public static void main(String[] args) {
        int n = lettura ("Inserisci numero");
    }
    public static int lettura (String msg){
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }
}
