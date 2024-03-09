package main.verifica0603;

import javax.swing.*;

public class es3 {
    public static void main(String[] args) {
        //3.Disegnare un quadrato vuoto di '*' data la lunghezza.
        int lunghezza = lettura("Inserire lunghezza quadrato");
        String output = "";
        for (int i = 0; i < lunghezza; i++) {
            for (int j = 0; j < lunghezza; j++) {
                if ( i == 0 || i == lunghezza -1){
                    output += "*";
                } else if (j == 0 || j == lunghezza-1){
                    output += "*";
                } else {
                    output += " ";
                }
            }
            output +="\n";
        }
        JOptionPane.showMessageDialog(null,output);
        System.out.println(output);
    }

    public static int lettura (String msg){
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }
}
