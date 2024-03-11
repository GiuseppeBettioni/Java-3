package es111a120;

import javax.swing.*;

public class es116 {
    public static void main(String[] args) {
        //Sommare le potenze di 2 con esponenti da 0 a n
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Inserire limite esponente di 2"));
        int somma = 0;
        for (int i = 0; i <= numero; i++) {
            somma += Math.pow(2,i);
        }
        JOptionPane.showMessageDialog(null,"La somma delle potenze di due da 0 a "+numero+" vale: "+somma);

    }
}
