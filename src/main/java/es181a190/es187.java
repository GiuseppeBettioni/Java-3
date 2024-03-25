package es181a190;

import javax.swing.*;
import java.util.Arrays;

public class es187 {
    public static void main(String[] args) {
        //Inserire in un vettore dati tutti diversi fra di loro. (Controllare che il dato inserito non sia già presente)
        int dim = lettura("Inserire dim");
        int[] vettore = new int[dim];
        boolean isRipetuto = false;
        int input = 0;
        for (int i = 0; i < dim; i++) {
            if ( i == 0 ) {
                vettore[i] = lettura("Inserire elemento "+i);
            } else {
                input = (lettura("Inserire elemento "+i));
                for (int j = 0; j < i; j++) {
                    if ( vettore[j] ==  input) {
                        isRipetuto = true;
                    }
                }
                if (!isRipetuto){
                    vettore [i] = input;
                } else {
                    JOptionPane.showMessageDialog(null,"Valore ripetuto");
                    i--;
                }
                isRipetuto = false;
            }
        }
        JOptionPane.showMessageDialog(null, Arrays.toString(vettore));
    }

    public static int lettura (String msg){
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }
}
