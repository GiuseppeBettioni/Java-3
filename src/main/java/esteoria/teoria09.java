package esteoria;

import javax.swing.*;

public class teoria09 {
    public static void main(String[] args) {
        //Stampare un quadrato di asterischi di n linee e asterischi
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire n"));
        String output ="";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                output +="*";
            }
            output+= "\n";
        }
        JOptionPane.showMessageDialog(null,output);
        System.out.println(output);
    }
}
