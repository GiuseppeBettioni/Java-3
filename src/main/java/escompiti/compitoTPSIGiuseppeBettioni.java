package escompiti;

import javax.swing.*;

public class compitoTPSIGiuseppeBettioni {
    public static void main(String[] args) {
        int min = 1;
        int max = 1000;
        int risposta = 500;
        String ciclo = JOptionPane.showInputDialog("Vuoi che il programma indovini il tuo numero? premi Y per continuare o n per finire.");
        String domanda = "";
        while (ciclo.equalsIgnoreCase("y")) {
            domanda = JOptionPane.showInputDialog("Il numero inserito è maggiore, minore o uguale a: "+risposta+" ?\n scrivi + per maggiore, - per minore o = per uguale.");
            if (domanda.equals("+")){
                min = risposta+1;
                risposta = (min+max)/2;
            } else if (domanda.equals("-")){
                max = risposta-1;
                risposta = (min+max)/2;
            } else if (domanda.equals("=")){
                JOptionPane.showMessageDialog(null,"Il numero indovinato è: "+risposta);
                ciclo = JOptionPane.showInputDialog(null,"Vuoi che il programma indovini il tuo numero? Premi Y per continuare o n per finire.");
                min = 1;
                max = 1000;
                risposta = 500;
            } else {
                JOptionPane.showMessageDialog(null,"Errore.");
                ciclo = JOptionPane.showInputDialog("Vuoi che il programma indovini il tuo numero? Premi Y per continuare o n per finire.");
                min = 1;
                max = 1000;
                risposta = 500;
            }
        }
        JOptionPane.showMessageDialog(null,"Il programma si sta spegnendo.");
    }
}

