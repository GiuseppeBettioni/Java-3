package esteoria;

import javax.swing.*;

public class teoria05 {
    public static void main(String[] args) {
        //Data una stringa in input contare da quante vocali è composta
        String input = JOptionPane.showInputDialog("Inserire stringa");
        String check;
        int vocali =0;
        for (int i = 0; i < input.length(); i++) {
            check = String.valueOf(input.charAt(i));
            if (check.equalsIgnoreCase("a") ||check.equalsIgnoreCase("e") ||check.equalsIgnoreCase("i") ||check.equalsIgnoreCase("o") ||check.equalsIgnoreCase("u")){
                vocali++;
            }
        }
        JOptionPane.showMessageDialog(null,"CI sono: "+vocali+" vocali");
    }
}
