package es101a110;

import javax.swing.*;

public class es107 {
    public static void main(String[] args) {
        //Moltiplicare fra di loro i primi n numeri naturali fino a ottenere un numero inferiore a quello inserito
        int limite = Integer.parseInt(JOptionPane.showInputDialog("Inserire limite"));
        int risultato = 1;
        int contatore = 1;
        while ( risultato*contatore < limite){
            risultato*=contatore;
            contatore++;
        }
        JOptionPane.showMessageDialog(null,"La moltiplicazione maggiore del numero inserito: "+limite+" vale: "+risultato);
    }
}
