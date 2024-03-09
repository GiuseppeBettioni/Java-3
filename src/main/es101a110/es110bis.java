package main.es101a110;

import javax.swing.*;

public class es110bis {
    public static void main(String[] args) {
        //Trovare i primi n numeri perfetti, un numero è perfetto se la somma dei suoi divisori tranne se stesso sono uguali al numero
        int n = Integer.parseInt(JOptionPane.showInputDialog("Quanti numeri perfetti vuoi sapere?I numeri perfetti sono pochi" +
                "\ne se metti un numero troppo grande mi ammazzi il pc."));
        int stampati = 0;
        int somma;
        int listaNumeri = 1;
        String output = "I primi n numeri perfetti sono: ";
        while ( stampati < n){
            somma = 0;
            for (int i = 1; i < listaNumeri; i++) {
                if (listaNumeri % i == 0){
                    somma+= i;
                }
            }
            if (somma == listaNumeri){
                output += somma +" ";
                stampati++;
            }
            listaNumeri++;
        }
        JOptionPane.showMessageDialog(null,output.subSequence(0,output.length()-1));
    }
}
