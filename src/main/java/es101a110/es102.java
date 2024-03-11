package es101a110;

import javax.swing.*;

public class es102 {
    public static void main(String[] args) {
        //Calcolare n esimo numeri triangolare
        int posizioneFinale = Integer.parseInt(JOptionPane.showInputDialog("Inserire la posizione del numero triangolare che si vuole trovare"));
        int contatore = 0;
        int risultato = 0;
        int listaNumeri = 0;
        int posizioneAttuale = 0;
        while (posizioneAttuale < posizioneFinale){
            contatore = 0;
            risultato = 0;
            listaNumeri++;
            while (risultato < listaNumeri ){
                contatore++;
                risultato+=contatore;
            }
            if ( risultato == listaNumeri ){
                posizioneAttuale++;
            }
        }
        JOptionPane.showMessageDialog(null,"Il numero triangolare in posizione: "+posizioneFinale+" vale: "+risultato);
    }
}
