package es131a140;

import javax.swing.*;

public class es136 {
    public static void main(String[] args) {
        //Stampare un triangolo di n righe del tipo
        //....*....
        //...***...
        //..*****..
        //.*******.
        //*********
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire n"));
        int caratteriPerLinea = n*2-1;
        int asterischi = 1;
        int spazzi = 0;
        String output = "";
        for (int i = 1; i <= n; i++) {
            spazzi = (caratteriPerLinea-asterischi)/2;
            int temp = asterischi;
            for (int j = 0; j < caratteriPerLinea; j++) {
                if ( spazzi > 0 ){
                    output+=".";
                    spazzi--;
                } else if (temp > 0 ){
                    output+= "*";
                    temp--;
                } else {
                    output += ".";
                }
            }
            output+="\n";
            asterischi += 2;
        }
        System.out.println(output);
        JOptionPane.showMessageDialog(null,output);
    }
}
