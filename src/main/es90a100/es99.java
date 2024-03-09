package main.es90a100;

import javax.swing.*;

public class es99 {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Inserisci primo numeratore"));
        int den1 = Integer.parseInt(JOptionPane.showInputDialog("Inserisci primo denominatore"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Inserisci secondo numeratore"));
        int den2 = Integer.parseInt(JOptionPane.showInputDialog("Inserisci secondo denominatore"));
        int den1temp = den1;
        int den2temp = den2;
        while ( den1temp != den2temp){
            if (den1temp > den2temp){
                den1temp -= den2temp;
            } else {
                den2temp -= den1temp;
            }
        }
        int mcm = den1 * den2 / den1temp;
        num1 *= mcm;
        num2 *= mcm;
        JOptionPane.showMessageDialog(null,"Le frazione sono: "+num1+" / "+mcm+"\n"+num2+" / "+mcm);

    }
}