package main.es90a100;

import javax.swing.*;

public class es98 {
    public static void main(String[] args) {
        //Semplificare una frazione o dire se è irriducibile
        int numeratore = Integer.parseInt(JOptionPane.showInputDialog("Inserire numeratore"));
        int denominatore = Integer.parseInt(JOptionPane.showInputDialog("Inserire denominatore"));
        int risultatoNum = numeratore;
        int risultatoDen = denominatore;
        String output;
        while ( numeratore != denominatore){
            if ( numeratore > denominatore){
                numeratore -= denominatore;
            } else {
                denominatore -= numeratore;
            }
        }
        risultatoNum /= numeratore;
        risultatoDen /= numeratore;
        if (numeratore <= 1 || denominatore <= 1){
            output = "Frazione non riducibile";
            JOptionPane.showMessageDialog(null,output);
        } else {
            output = "Frazione riducibile";
            JOptionPane.showMessageDialog(null,output+" numeratore = "+risultatoNum+" denominatore = "+risultatoDen);
        }

    }
}
