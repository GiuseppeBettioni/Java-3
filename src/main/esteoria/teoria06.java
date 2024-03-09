package main.esteoria;

import javax.swing.*;

public class teoria06 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Inserire numero"));
        String check = "";
        int temp = numero;
        while (temp > 0){
            check += temp%10;
            temp /=10;
        }
        temp = Integer.parseInt(check);
        if ( numero == temp ){
            JOptionPane.showMessageDialog(null,"È palindromo");
        } else {
            JOptionPane.showMessageDialog(null,"Non è palindromo");
        }
    }
}
