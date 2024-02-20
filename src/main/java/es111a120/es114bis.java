package es111a120;

import javax.swing.*;

public class es114bis {
    public static void main(String[] args) {
        //Come il 114 ma moltiplicazione di potenze
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire numero"));
        int contatore = 2;
        int esponente = 1;
        int divPrec = 0;
        String output = "Si può scomporre in: ";
        while ( n > 1 ){
            if( n % contatore == 0){
                n/= contatore;
                if (contatore == divPrec){
                    esponente++;
                } else if (divPrec != 0) {
                    output += divPrec+" ^ "+esponente+" * ";
                    esponente = 1;
                }
                divPrec = contatore;
            } else {
                contatore++;
            }
        }
        output += divPrec + " ^ " +esponente;
        JOptionPane.showMessageDialog(null,output);
    }
}
