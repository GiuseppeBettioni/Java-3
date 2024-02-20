package es90a100;

import javax.swing.*;

public class es94 {
    public static void main(String[] args) {
        //Stampare primo numero di fibonacci maggiore di n
        int n = Integer.parseInt(JOptionPane.showInputDialog("inserire n"));
        int fib1 = 0;
        int fib2 = 1;
        int temp = 0;
        while (fib2+fib1 <= n){
            temp = fib1;
            fib1 = fib2;
            fib2 += temp;
        }
        fib2 +=fib1;
        JOptionPane.showMessageDialog(null,"Il primo numero di fibonacci maggiore di n è: "+fib2);
    }
}
