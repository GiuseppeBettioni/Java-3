package main.es121a130;

import javax.swing.*;

public class es121 {
    public static void main(String[] args) {
        //Scrivere gli M numeri primi immediatamente superiori a n
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire n"));
        int m = Integer.parseInt(JOptionPane.showInputDialog("Inserire m"));
        int stampati = 0;
        int primo = n+1;
        int contaPrimo = 0;
        String output = "I primi M numeri primi superiore a n sono: ";
        while (stampati < m ){
            contaPrimo = 0;
            for (int i = 2; i < primo; i++) {
                if (primo % i == 0){
                    contaPrimo++;
                }
            }
            if (contaPrimo == 0){
                output += primo+ " ";
                stampati++;
            }
            primo++;
        }
        JOptionPane.showMessageDialog(null,output);
    }
}
