package es111a120;

import javax.swing.*;

public class es115 {
    public static void main(String[] args) {
        //Dato un numero inserite una sola volta ogni suo valore primo
        int numero = Integer.parseInt(JOptionPane.showInputDialog("inserisci un numero"));
        StringBuilder output = new StringBuilder("Il numero inserito: " + numero + " può essere scomposto in: ");
        int divisore = 2;
        int contatoreOutput = 0;
        int testDivisore = 1;
        while (numero > 1){
            if ( numero % divisore ==0 ){
                numero /= divisore;
                if (contatoreOutput == 0 ){
                    output.append(divisore);
                    contatoreOutput++;
                    testDivisore *= divisore;
                } else {
                    if (testDivisore % divisore != 0) {
                        output.append(" * ").append(divisore);
                        testDivisore *= divisore;
                    }
                }
                divisore = 2;
            } else
                divisore++;
        }
        JOptionPane.showMessageDialog(null, output.toString());
    }
}
