package es111a120;

import javax.swing.*;

public class es113 {
    public static void main(String[] args) {
        //Dire se due numeri inseriti sono primi fra di loro ( non hanno divisori comuni)
        int a = Integer.parseInt(JOptionPane.showInputDialog("Inserire primo numero"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Inserire secondo numero"));
        boolean risposta = true;
        for (int i = 2; i < Math.min(a,b); i++) {
            if (a % i == 0 && b % i == 0) {
                risposta = false;
                break;
            }
        }
        if (risposta){
            JOptionPane.showMessageDialog(null,"Sono primi fra di loro");
        } else {
            JOptionPane.showMessageDialog(null,"Non sono primi fra di loro");
        }

    }
}
