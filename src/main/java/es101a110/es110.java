package es101a110;

import javax.swing.*;

public class es110 {
    public static void main(String[] args) {
        //Stampare i primi n numeri pari
        int limite = Integer.parseInt(JOptionPane.showInputDialog("Quanti numeri pari vuoi stampare?"));
        int listaNumeri = 2;
        int numeriStampati = 0;
        StringBuilder output = new StringBuilder("I primi n numeri pari sono: ");
        while ( numeriStampati < limite){
            output.append(listaNumeri).append(" ");
            numeriStampati++;
            listaNumeri+=2;
        }
        JOptionPane.showMessageDialog(null, output);
        output.subSequence(0,output.length()-1);
    }
}
