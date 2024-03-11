package es161a170;

import javax.swing.*;

public class es164 {
    public static void main(String[] args) {
        //un testo è composto da frasi che terminano con un punto. Dire quante frasi ci sono, parole per frase, lunghezza media frasi.
        String input = JOptionPane.showInputDialog("Inserire delle frasi separate dai dei punti.");
        int frasiTot = 0;
        int parolePerFrase = 0;
        int numeroFrase = 0;
        int lunghezzaMedia = 0;
        String output ="";
        for (int i = 0; i < input.length()-1; i++) {
            if (input.charAt(i) == ' '){
                parolePerFrase++;
            } else if ( input.charAt(i) == '.'){
                frasiTot++;
                numeroFrase++;
                lunghezzaMedia += parolePerFrase;
                output += "La frase numero "+numeroFrase+" contiene: "+parolePerFrase+"\n";
                parolePerFrase = 0;
            }
        }
        lunghezzaMedia /= numeroFrase;

    }
}
