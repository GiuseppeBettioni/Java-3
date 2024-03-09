package main.esteoria;

import javax.swing.*;

public class teoria08 {
    public static void main(String[] args) {
        //Calcolare la somma dei cubi dei primi n numeri primi
        int n = Integer.parseInt(JOptionPane.showInputDialog("inserire n"));
        int stampati = 0;
        int primo = 0;
        int risultato = 0;
        int listaNumeri = 1;
        while (stampati < n ){
            primo = 0;
            listaNumeri++;
            for (int i = 1; i <= listaNumeri; i++) {
                if ( listaNumeri % i == 0){
                    primo++;
                }
            }
            if ( primo == 2 ){
                risultato += Math.pow(listaNumeri,3);
                stampati++;
            }
        }
        JOptionPane.showMessageDialog(null,"La somma dei cubi dei primi n numeri primi vale: "+risultato);
    }
}
