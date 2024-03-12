package es161a170;

import javax.swing.*;

public class es164 {
    public static void main(String[] args) {
        //un testo è composto da frasi che terminano con un punto. Dire quante frasi ci sono, parole per frase, lunghezza media frasi.
        String input = JOptionPane.showInputDialog("Inserire delle frasi separate dai dei punti.");
        int frasiTot = 0;
        int parolePerFrase = 0;
        double lunghezzaMedia = 0;
        boolean parolaIniziata = true;
        String output ="";
        for (int i = 0; i < input.length(); i++) {
            if ( input.charAt(i) != ' ' && input.charAt(i) != ',' && input.charAt(i) != '.') {
                parolaIniziata = true;
            } else if (input.charAt(i) == ' ' && parolaIniziata){
                parolePerFrase++;
                lunghezzaMedia++;
                parolaIniziata = false;
            } else if ( input.charAt(i) == '.'){
                if (parolaIniziata){
                    parolePerFrase++;
                }
                frasiTot++;
                output += "La frase numero "+frasiTot+" contiene: "+parolePerFrase+" parole\n";
                parolePerFrase = 0;
                parolaIniziata = false;
            }
            lunghezzaMedia++;
        }
        lunghezzaMedia /= (frasiTot+1);
        JOptionPane.showMessageDialog(null, "Ci sono : "+frasiTot+" frasi.\n"+output+" la lunghezza media vale: "+lunghezzaMedia);
    }
}
