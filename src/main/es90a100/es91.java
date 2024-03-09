package main.es90a100;

import javax.swing.*;

public class es91 {
    public static void main(String[] args) {
        //Trovare radice quadrata intera di un numero ovvero k*k <=n
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire n"));
        int i=0;
        while ( i*i <= n){
            i++;
        }
        i--;
        JOptionPane.showMessageDialog(null,i);
    }
}
