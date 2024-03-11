package es90a100;

import javax.swing.*;

public class es93 {
    public static void main(String[] args) {
    // stampare i numeri di fibonacci compresi fra m e n
        int m = Integer.parseInt(JOptionPane.showInputDialog("Inserire grado m"));
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire grado n"));
        int grado = 1;
        int fib1 = 0;
        int fib2 = 1;
        int temp;
        StringBuilder output = new StringBuilder("I numeri di fibonacci compresi fra m e n sono: ");
        while ( grado <= n){
            if ( grado >= m){
                output.append(fib1).append(" ");
            }
            temp = fib1;
            fib1 = fib2;
            fib2 += temp;
            grado++;
        }
        JOptionPane.showMessageDialog(null, output.toString());
    }
}
