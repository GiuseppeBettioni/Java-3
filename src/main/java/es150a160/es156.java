package es150a160;

import javax.swing.*;
public class es156 {
    public static void main(String[] args) {
        //Dato un vettore di caratteri con sole parentesi dire se le parentesi sono giuste ovvero se per ogni parentesi aperta vi è una chiusa
        int lunghezzaArray = Integer.parseInt(JOptionPane.showInputDialog("Inserire lunghezza"));
        char[] vettore = new char[lunghezzaArray];
        int check = 0;
        String input = "";
        for (int i = 0; i < lunghezzaArray; i++) {
            input = JOptionPane.showInputDialog("Inserire carattere");
            vettore [i] = input.charAt(0);
            if (vettore[i]=='(' ){
                check++;
            } else if ( vettore[i]==')'){
                check--;
            }
            if ( check < 0 ){
                break;
            }
        }
        if ( check == 0 ){
            JOptionPane.showMessageDialog(null,"Le parentesi sono giuste.");
        } else {
            JOptionPane.showMessageDialog(null,"Le parentesi non sono giuste.");
        }
    }
}
