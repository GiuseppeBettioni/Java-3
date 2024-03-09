package main.es161a170;

import javax.swing.*;

public class es163 {
    public static void main(String[] args) {
        //Poste un numero N di domande a un numero X di persone confrontare le risposte con un vettore di riferimento
        // e dure quante risposte sono giuste. Le risposte possono avere valori da 1 a 4
        int domande = lettura("Inserire numero domande");
        int persone = lettura("Inserire numero persone");
        int turno = 1;
        int contatore = 0;
        String output ="";
        int[] riferimento = new int[domande];
        int[] risposte = new int[domande];
        for (int i = 0; i < domande; i++) {
            riferimento [i] = lettura("Inserire la "+(i+1)+" risposta");
        }

        while ( turno < persone+1 ){
            output += "Il "+turno+" concorrente ha dato: ";
            for (int i = 0; i < domande; i++) {
                risposte[i] = lettura(turno+ " concorrente. Rispondi alla "+(i+1)+" domanda.");
                if ( risposte [i] == riferimento[i]){
                    contatore++;
                }
            }
            output += contatore+" risposte giuste.\n";
            turno++;
            contatore = 0;
        }
        JOptionPane.showMessageDialog(null,output);
    }
    public static int lettura (String msg){
        int n = Integer.parseInt(JOptionPane.showInputDialog(msg));
        return n;
    }
}
