package esverifica;

import javax.swing.*;

public class esrecupero4 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Inserire primo valore"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Inserire secondo valore"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Inserire terzo valore"));
        int mcd = 1;
        int min = Math.min(a,Math.min(b,c));
        for (int i = 1; i <= min; i++) {
            if ( a%i==0 && b%i==0 && c%i==0){
                mcd = i;
            }
        }
        JOptionPane.showMessageDialog(null,"Il massimo comun divisore dei numeri inseriti è: "+mcd);
    }
}
