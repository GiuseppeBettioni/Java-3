package es111a120;

import javax.swing.*;

public class es114 {
    public static void main(String[] args) {
        //Dato un numero scomporlo in fattori primi
        int numero = Integer.parseInt(JOptionPane.showInputDialog("inserisci un numero"));
        StringBuilder output = new StringBuilder("Il numero inserito: " + numero + " può essere scomposto in: ");
        int divisore = 2;
        int contatoreOutput = 0;
        while (numero > 1){
            if ( numero % divisore ==0 ){
                numero /= divisore;
                if (contatoreOutput == 0 ){
                    output.append(divisore);
                    contatoreOutput++;
                } else {
                    output.append(" * ").append(divisore);
                }
                divisore = 2;
            } else
                divisore++;
        }
        JOptionPane.showMessageDialog(null, output.toString());
    }
}
