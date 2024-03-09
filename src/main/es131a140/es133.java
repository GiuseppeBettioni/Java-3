package main.es131a140;

import javax.swing.*;

public class es133 {
    public static void main(String[] args) {
        //Stampare un triangolo di n righe
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire righe del triangolo"));
        String output = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                output+= "*";
            }
            output+="\n";
        }
        JOptionPane.showMessageDialog(null,output);
    }
}
