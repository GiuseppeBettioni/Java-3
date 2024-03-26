package es181a190;

import javax.swing.*;

public class es183bis {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("inserire testo").toLowerCase();
        String parola = JOptionPane.showInputDialog("Inserire parola").toLowerCase();
        String confronto ="";
        int lunghezzaParola = parola.length();
        int contatore = 0;
        for (int i = 0; i <= input.length()-lunghezzaParola; i++) {
            confronto = input.substring(i,i+lunghezzaParola);
            System.out.println(confronto);
            if ( confronto.equals(parola)){
                contatore++;
            }
        }
        JOptionPane.showMessageDialog(null,input+"\n"+contatore);
    }
}
