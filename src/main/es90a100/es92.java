package main.es90a100;

import javax.swing.*;

public class es92 {
    public static void main(String[] args) {
        //Stampare i numeri di fibonacci minori di n
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire n"));
        int fib1 = 0;
        int fib2 = 1;
        int temp =0;
        StringBuilder output;
        if (n>=0){
            output = new StringBuilder("I numeri di fibonacci minori di n sono: 0 ");
        } else {
            output = new StringBuilder("Non ci sono numeri di fibonacci inferiori ad n");
        }
        while (fib2+fib1 < n){
            temp = fib1;
            fib1 = fib2;
            fib2 += temp;
            output.append(fib2).append(" ");
        }
        JOptionPane.showMessageDialog(null, output.toString());
    }
}
