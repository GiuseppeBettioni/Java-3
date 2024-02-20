package es101a110;

import javax.swing.*;

public class es103 {
    public static void main(String[] args) {
        //Stampare primo numero triangolare maggiore di n.
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Inserire numero n"));
        int risultato = 0;
        int contatore = 0;
        int listaNumeri = 0;
        while ( risultato <= numero){
            listaNumeri++;
            risultato =0;
            contatore=0;
            while (risultato < listaNumeri){
                contatore++;
                risultato+=contatore;
            }
            if ( risultato != listaNumeri){
                risultato = 0;
            }
        }
        JOptionPane.showMessageDialog(null,"Il primo numero triangolare maggiore di : "+numero+" vale: "+risultato);
    }
}
