package es131a140;

import javax.swing.*;

public class es132 {
    public static void main(String[] args) {
        //Stampare un quadrato di asterischi di lato n
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire n"));
        String output ="";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ( i == 0 || i == n-1 ){
                    output += "*";
                } else if ( j == 0 || j == n-1 ){
                    output += "*";
                } else {
                    output+=" ";
                }
            }
            output+="\n";
        }
        JOptionPane.showMessageDialog(null,output);
    }
}
