package main.es131a140;

import javax.swing.*;

public class es134 {
    public static void main(String[] args) {
        //Stampare un triangolo di n righe partendo da n e scendendo a 1
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire n"));
        String output ="";
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                output+="*";
            }
            output+="\n";
        }
        JOptionPane.showMessageDialog(null,output);
    }
}
