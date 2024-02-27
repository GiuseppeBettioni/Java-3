package es131a140;

import javax.swing.*;

public class es139 {
    public static void main(String[] args) {
        //Scrivere un programma per la rappresentazione del triangolo di Floyd.
        //Il triangolo è un triangolo che contiene numeri che partono da 1 in alto a sinistra
        /*1
          2 3
          4 5 6
          Questo è un triangolo di floyd con n uguale a 3
         */
        int righeTotali = Integer.parseInt(JOptionPane.showInputDialog("Inserire numero"));
        int righeStampate = 0;
        int caratteriPerLinea = 1;
        int numeri = 0;
        String output = "";
        while ( righeStampate < righeTotali){
            for (int i = 0; i < caratteriPerLinea; i++) {
                numeri++;
                output += numeri+ "   ";
            }
            output +="\n";
            caratteriPerLinea++;
            righeStampate++;
        }
        JOptionPane.showMessageDialog(null,output);
    }
}
