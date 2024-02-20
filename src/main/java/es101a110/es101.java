package es101a110;

import javax.swing.*;

public class es101 {
    public static void main(String[] args) {
        int limite = Integer.parseInt(JOptionPane.showInputDialog("Inserire quanti numeri triangolari si vogliono stampare")); // Numeri triangolare voluti
        int stampati = 0; // contatore numeri triangolari inseriti
        int contatore = 0; // trova i numeri triangolari
        int risultato = 0; // trova i numeri triangolari
        int numero = 0; // numeri naturali da 1 a x
        StringBuilder output = new StringBuilder("I primi " + limite + " numeri triangolare sono: ");
        while (stampati < limite){ // Continua a ciclare fin quando i primi limite numeri naturali sono stati inseriti
            numero++;
            contatore = 0;
            risultato = 0;
            while (risultato < numero){
                risultato += contatore;
                contatore++;
            }
            if (risultato==numero){ //Se è un numero triangolare lo salva in output e aumenta il contatore
                output.append(risultato).append(" ");
                stampati++;
            }
        }
        JOptionPane.showMessageDialog(null, output.toString());
    }
}
