package esteoria;

import javax.swing.*;

public class teoria10 {
    public static void main(String[] args) {
        //3. Trovare tutti i numeri primi gemelli in un intervallo specificato. Due numeri primi si dicono gemelli se differiscono di 2 tra loro.
        int limiteMin = Integer.parseInt(JOptionPane.showInputDialog("Inserire limite minore"));
        int limiteSup = Integer.parseInt(JOptionPane.showInputDialog("Inserire limite superiore"));
        int checkPrimo = 0;
        int primoVecchio = -1;
        int primoNuovo = -1;
        String output = "I numeri primi gemelli nell'intervallo specificato sono: ";
        for (int i = limiteMin; i < limiteSup; i++) {
            checkPrimo = 0;
            for (int j = 1; j <= i ; j++) {
                if ( i % j == 0 ){
                    checkPrimo++;
                }
            }
            if ( checkPrimo == 2){
                primoVecchio = primoNuovo;
                primoNuovo = i;
                if (primoNuovo-2 == primoVecchio){
                    output +="\n"+primoVecchio+" "+primoNuovo;
                }
            }
        }
        JOptionPane.showMessageDialog(null,output);
    }
}
