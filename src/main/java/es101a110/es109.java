package es101a110;

import javax.swing.*;

public class es109 {
    public static void main(String[] args) {
        //calcolare i primi n numeri primi
        int limite = Integer.parseInt(JOptionPane.showInputDialog("Inserire quanti numeri primi si vogliono sapere"));
        int listaNumeri = 2;
        int numeriStampati = 0;
        int controlloPrimo;
        StringBuilder output = new StringBuilder("I primi n numeri primi sono: ");
        while ( numeriStampati < limite){
            controlloPrimo = 0;
            for (int i = 1; i < listaNumeri; i++) {
                if (listaNumeri % i == 0){
                    controlloPrimo++;
                }
            }
            if ( controlloPrimo == 1 ){
                output.append(listaNumeri).append(" ");
                numeriStampati++;
            }
            listaNumeri++;
        }
        JOptionPane.showMessageDialog(null, output.toString());
    }
}
