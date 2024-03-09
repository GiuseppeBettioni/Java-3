package main.esteoria;

import javax.swing.*;

public class teoria04 {
    public static void main(String[] args) {
        //Fate inserire un numero naturale dall utente e dire quante cifre pari e quante dispari ha
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire numero"));
        int contPari = 0;
        int contDisp = 0;
        int risultato = 0;
        while ( n > 0 ) {
            risultato = n % 10;
            n /= 10;
            if (risultato % 2 == 0){
                contPari++;
            } else {
                contDisp++;
            }
        }
        JOptionPane.showMessageDialog(null,"Ci sono: "+contDisp+" cifre dispari\ne "+contPari+" cifre pari");
    }
}
