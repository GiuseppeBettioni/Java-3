package esverifica;

import javax.swing.*;

public class esrecupero6 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("inserisci numero"));
        int risposta = 1;
        // ci sono pochissimi numeri perfetti conosciuti e sono quasi tutti troppo grandi per un int, è più veloce fare degli if che un ciclo.
        if ( numero > 33550336   ) {
            risposta = 33550336;
        } else if ( numero > 8128) {
            risposta = 8128;
        } else if ( numero > 496){
            risposta = 496;
        } else if (numero > 28){
            risposta = 28;
        } else if (numero>6){
            risposta = 6;
        }
        JOptionPane.showMessageDialog(null,"Il numero perfetto più grande inferiore a: "+numero+" è: "+risposta);
    }
}
