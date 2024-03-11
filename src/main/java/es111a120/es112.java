package es111a120;

import javax.swing.*;

public class es112 {
    public static void main(String[] args) {
        //Dire quanti valori naturali pari a partire da 2 occorre moltiplicare per superare n
        int limite = Integer.parseInt(JOptionPane.showInputDialog("Inserire valore limite"));
        int risultato = 1;
        int contatore = 2;
        int numeriUsati = 0;
        while ( risultato <= limite){
            risultato*=contatore;
            numeriUsati++;
            contatore+=2;
        }
        JOptionPane.showMessageDialog(null,"Servono: "+numeriUsati+" risultato finale: "+risultato);
    }
}
