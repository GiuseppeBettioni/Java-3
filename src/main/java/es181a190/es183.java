package es181a190;

import javax.swing.*;

public class es183 {
    public static void main(String[] args) {
        //Dire quante volte una parola compare in un testo
        String input = JOptionPane.showInputDialog("Inserire testo").toLowerCase();
        String parola = JOptionPane.showInputDialog("Inserire che parola si vuole confrontare").toLowerCase();
        String temp = "";
        int contatore = 0;
        for (int i = 0; i < input.length(); i++) {
            if ( input.charAt(i)== ' ' || input.charAt(i) == ',' || input.charAt(i) == '.'){
                if ( temp.equals(parola)){
                    contatore++;
                }
                temp ="";
            } else {
                temp+= input.charAt(i);
            }
        }
        JOptionPane.showMessageDialog(null, contatore);
    }
}
