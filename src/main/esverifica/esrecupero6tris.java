package main.esverifica;

import javax.swing.*;

public class esrecupero6tris {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Inserisci numero."));
        int controllo = 0;
        int risposta = 0;
        for (int i = 1; i < numero; i++) {
            controllo = 0;
            for ( int j = 1; j < i; j++){
                if ( i % j == 0 ){
                    controllo +=j;
                }
            }
            if (controllo == i){
                risposta = controllo;
            }
        }
        if (risposta == 0) {
            JOptionPane.showMessageDialog(null,"Non ci sono numeri perfetti inferiori al numero inserito");
        } else {
            JOptionPane.showMessageDialog(null,"Il numero perfetto più grande minore di: "+numero+ " è "+risposta);
        }

    }
}

