package es121a130;

import javax.swing.*;

public class es126 {
    public static void main(String[] args) {
        //Stampare i numeri negativi da -1 a N con un for a passo negativo
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire n negativo"));
        if ( n > 0){
            n = -n;
        }
        String output ="I numeri sono: ";
        for (int i = -1; i > n; i--) {
            output += i+" ";
        }
        JOptionPane.showMessageDialog(null,output);
    }
}
