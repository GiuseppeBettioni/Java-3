package main.esteoria;

import javax.swing.*;

public class teoria02 {
    public static void main(String[] args) {
        //Scrivere un programma che chiede all'utente di inserire una sequenza di interi.
        // Il programma continua finchè i valori sono negativi e divisibili per 2 o positivi e divisibili per 3
        //Alla fine stampa la somma di tutti i valori esclusi quelli non validi
        int somma = 0;
        int numero = 0;
        boolean ciclo = true;
        while (ciclo){
            numero = lettura();
            ciclo = controllo(numero);
            somma += somma(numero,ciclo);
        }
        stampa(somma);
    }
    public static int lettura (){
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserisci numero. Se è negativo e divisibile per 2" +
                "o positivo e divisibile per 3 il ciclo continua, se no finisce"));
        return n;
    }
    public static boolean controllo (int numero){
        return (numero >= 0 || numero % 2 == 0) && (numero < 0 || numero % 3 == 0);
    }
    public static int somma (int numero, boolean ciclo){
        if (ciclo){
            return numero;
        } else {
            return 0;
        }
    }
    public static void stampa (int somma){
        JOptionPane.showMessageDialog(null,"La somma è: "+somma);
    }
}
