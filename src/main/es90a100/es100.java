package main.es90a100;

import javax.swing.*;

public class es100 {
    public static void main(String[] args) {
        //Dire se n è uguale alla somma dei primi n numeri naturali ovvero se è un numero triangolare
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Inserire numero"));
        int contatore = 1;
        int risultato = 0;
        while (risultato < numero){
            risultato+=contatore;
            contatore++;
        }
        if ( risultato == numero ){
            JOptionPane.showMessageDialog(null,"Il numero è triangolare");
        } else {
            JOptionPane.showMessageDialog(null,"Il numero non è triangolare");
        }
    }
}
