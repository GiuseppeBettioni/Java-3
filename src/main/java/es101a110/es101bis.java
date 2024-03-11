package es101a110;

import javax.swing.*;

public class es101bis {
    public static void main(String[] args) {
        //Stampare i primi n numeri triangolare sapendo che un numero triangolare = precedente numero triangolare + posizione
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Inserire quanti numeri triangolare vuoi stampare"));
        int risultato = 0;
        int contatore = 1;
        StringBuilder output = new StringBuilder("I primi: " + numero + " numeri triangolare inseriti sono: ");
        while ( contatore <= numero){
            risultato+=contatore;
            output.append(risultato).append(" ");
            contatore++;
        }
        JOptionPane.showMessageDialog(null, output.toString());
    }
}
