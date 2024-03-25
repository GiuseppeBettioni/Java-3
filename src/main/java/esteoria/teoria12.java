package esteoria;

import javax.swing.*;

public class teoria12 {
    public static void main(String[] args) {
        //Cercare il numero più frequente in un array
        int dim = lettura("Inserire dimensione");
        int[] array = new int[dim];
        int numero = 0;
        int ripetizione = 0;
        int numeroNuovo = Integer.MIN_VALUE;
        int ripetizioneNuova = 0;
        String output = "";
        for (int i = 0; i < dim; i++) {
            array[i] = lettura("Inserire "+i+" elemento");
            output += array[i]+" ";
        }

        for (int i = 0; i < dim; i++) {
            numeroNuovo = array[i];
            for (int j = 0; j < dim; j++) {
                if ( array[j] == numeroNuovo){
                    ripetizioneNuova++;
                }
            }
            if ( ripetizioneNuova > ripetizione ){
                numero = numeroNuovo;
                ripetizione = ripetizioneNuova;
            }
            ripetizioneNuova = 0;
        }
        JOptionPane.showMessageDialog(null,output+"\nIl numero più ripetuto è "+numero+" ed è ripetuto "+ripetizione);
    }

    public static int lettura (String msg){
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }
}
