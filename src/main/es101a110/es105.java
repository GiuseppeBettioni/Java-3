package main.es101a110;

import javax.swing.*;

public class es105 {
    public static void main(String[] args) {
        //Sommare i primi n numeri naturali finchè non si ottiene una somma uguale o maggiore a un input
        int limite = Integer.parseInt(JOptionPane.showInputDialog("Inserire valore limite"));
        int somma = 0;
        int contatore = 1;
        while ( somma < limite){
            somma += contatore;
            contatore++;
        }
        JOptionPane.showMessageDialog(null,"La somma dei primi numeri naturali maggiore o uguale a: "+limite+" vale: "+somma);
    }
}
