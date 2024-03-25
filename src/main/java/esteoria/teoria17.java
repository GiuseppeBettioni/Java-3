package esteoria;

import javax.swing.*;

public class teoria17 {
    public static void main(String[] args) {
        //Scrivere un programma SommaPariDispari che prevede un array di 10 numeri interi
        // contenente valori a piacere e stampa Pari e dispari uguali se la somma dei numeri in posizioni pari dell’array
        // e uguale alla somma dei numeri in posizioni dispari, altrimenti il programma stampa Pari e dispari diversi.
        //(Il programma deve essere scritto facendo finta di non sapere quali siano i valori inseriti nell’array)
        //Assumiamo che 0 sia pari
        int[] vettore = new int[10];
        int sommaPari = 0;
        int sommaDispari = 0;
        for (int i = 0; i < vettore.length; i++) {
            vettore[i] = Integer.parseInt(JOptionPane.showInputDialog("inserire elemento "+i));
        }
        for (int i = 0; i < vettore.length; i++) {
            if ( i % 2 == 0 ){
                sommaPari += vettore[i];
            } else {
                sommaDispari += vettore[i];
            }
        }
        if ( sommaPari == sommaDispari ){
            JOptionPane.showMessageDialog(null,"Uguali");
        } else {
            JOptionPane.showMessageDialog(null,"Diversi");
        }
    }
}
