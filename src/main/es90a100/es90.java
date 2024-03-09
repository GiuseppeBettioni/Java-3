package main.es90a100;

import javax.swing.*;

public class es90 {
    public static void main(String[] args) {
        //Data una serie di numeri che inizia da 1 e raddoppia ogni passo, dire qual é il primo numero maggiori di n.
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire valore n."));
        int contatore =1;
        while (contatore <= n) {
            contatore *= 02;
        }
        JOptionPane.showMessageDialog(null,"Il primo valore maggiore di n é: "+contatore);
    }

}