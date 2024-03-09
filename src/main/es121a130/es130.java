package main.es121a130;

import javax.swing.*;

public class es130 {
    public static void main(String[] args) {
        //Stampare i numeri dispari in ordine decrescente da n a 1
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire n"));
        String output = "I numeri dispari da n a 1 sono: ";
        if (n%2 !=0 ){
            n--;
        }
        for (int i = n; i >= 1; i-=2) {
            output+=i+" ";
        }
        JOptionPane.showMessageDialog(null,output);
    }
}
