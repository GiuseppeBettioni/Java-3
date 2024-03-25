package es171a180;

import javax.swing.*;

public class es171 {
    public static void main(String[] args) {
        //Shiftare un vettore di Q posizione verso destra
        int dim = lettura("Inserire dimensione");
        int q = lettura("Inserire Q");
        int[] vettore = new int[dim];
        int[] salvataggio = new int[q];
        int salva1 = 0;
        String output ="";
        String test ="";
        for (int i = 0; i < dim; i++) {
            vettore[i] = lettura("Inserire "+i+" elemento");
            test += vettore[i] +" ";
        }
        for (int i = 0; i < q; i++) {
            salvataggio[i] = vettore[i];
        }
        int i;
        for (i = q; i < dim-q; i+=q) {
            for (int j = 0; j < q; j++) {
                salva1 = vettore[i+j];
                vettore[i+j] = salvataggio[j];
                salvataggio[j] = salva1;
            }
        }
        int k = 0;
        for (int j = dim-q; j < dim; j++) {
            vettore[j] = salvataggio[k];
            k++;
        }
        for (i = 0; i < q; i++) {
            vettore[i] = 0;
        }
        for (i = 0; i < dim; i++) {
            output += vettore[i]+" ";
        }
        JOptionPane.showMessageDialog(null,test+"\n"+output.substring(0,output.length()-1));
    }
    public static int lettura (String msg){
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }
}
