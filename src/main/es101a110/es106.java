package main.es101a110;

import javax.swing.*;

public class es106 {
    public static void main(String[] args) {
        //Sommare i primi n numeri naturali finchè non si ottiene una somma uguale o maggiore a un input, dire quanti numeri sono stati sommati
        int limite = Integer.parseInt(JOptionPane.showInputDialog("Inserire valore limite"));
        int somma = 0;
        int contatore = 0;
        while ( somma < limite){
            contatore++;
            somma += contatore;
        }
        JOptionPane.showMessageDialog(null,"La somma dei primi numeri naturali maggiore o uguale a: "+limite+"\nvale: "+somma+"\nsono serviti: "+contatore+" numeri");
    }
}
