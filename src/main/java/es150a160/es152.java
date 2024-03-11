package es150a160;

import javax.swing.*;

public class es152 {
    public static void main(String[] args) {
        //Calcolare il vettore differenza di due vettori dati
        int lunghezzaArray = Integer.parseInt(JOptionPane.showInputDialog("Quanto sarà lungo il vettore? "));
        int[] vettore1 = new int[lunghezzaArray];
        int[] vettore2 = new int [lunghezzaArray];
        int[] vettoreRisultato = new int[lunghezzaArray];
        String output ="Il vettore differenza vale: ";
        /*for (int i = 0; i < ; i++) {
            vettore1 [i] = Integer.parseInt(JOptionPane.showInputDialog("Inserire "+i+" valore del primo vettore);
            vettore2 [i] = Integer.parseInt(JOptionPane.showInputDialog("Inserire "+i+" valore del secondo vettore);
        }*/
        for (int i = 0; i < lunghezzaArray; i++) {
            vettore1 [i]= Integer.parseInt(JOptionPane.showInputDialog("Inserire valore "+(i+1)+" del primo vettore"));
            vettore2 [i]= Integer.parseInt(JOptionPane.showInputDialog("Inserire valore "+(i+1)+" del secondo vettore"));
            vettoreRisultato[i] = vettore2 [i]- vettore1[i];
            output += vettoreRisultato [i]+" ";
        }
        JOptionPane.showMessageDialog(null,output);

    }
}
