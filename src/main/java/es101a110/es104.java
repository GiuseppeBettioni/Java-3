package es101a110;

import javax.swing.*;

public class es104 {
    public static void main(String[] args) {
        //Stampare maggior numero triangolare inferiore ad n
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Inserire n"));
        int contatore = 1;
        int risultato = 0;
        while (risultato+contatore < numero){
            risultato += contatore;
            contatore++;
        }
        JOptionPane.showMessageDialog(null,"IL primo numero triangolare inferiore a: "+numero+" vale: "+risultato);
    }
}
