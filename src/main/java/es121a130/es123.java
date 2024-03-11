package es121a130;

import javax.swing.*;

public class es123 {
    public static void main(String[] args) {
        //Dato un numero trovare il numero primo più vicino
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Inserire numero"));
        int risultato = 0;
        int contPrimo = 0;
        int primoMagg = numero;
        while (true){
            contPrimo = 0;
            for (int i = 2; i < primoMagg; i++) {
                if ( primoMagg % i == 0){
                    contPrimo++;
                }
            }
            if ( contPrimo == 0){
                break;
            }
            primoMagg++;
        }
        risultato = primoMagg - numero;
        int primoMin = numero;
        while (true){
            if ( risultato == 0 ){
                break;
            }
            contPrimo = 0;
            for (int i = 2; i < primoMin; i++) {
                if ( primoMin % i == 0){
                    contPrimo++;
                }
            }
            if ( contPrimo == 0){
                break;
            }
            primoMin--;
        }
        risultato += primoMin - numero;
        if ( risultato < 0 ){
            JOptionPane.showMessageDialog(null,"Il numero primo più vicino è: "+primoMagg);
        } else if ( risultato > 0 ){
            JOptionPane.showMessageDialog(null,"Il numero primo più vicino è: "+primoMin);
        } else {
            JOptionPane.showMessageDialog(null,"I due numeri sono equidistanti da n e sono: "+primoMagg+" e "+primoMin);
        }
    }
}
