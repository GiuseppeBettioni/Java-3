package es171a180;

import javax.swing.*;

public class es172 {
    public static void main(String[] args) {
        //Come es171 ma senza vettore
        int dim = lettura("Inserire dimensione");
        int q = lettura("Inserire Q");
        int[] vettore = new int[dim];
        int salva,salva1;
        String output ="";
        for (int i = 0; i < dim; i++) {
         vettore[i] = lettura("Inserire il "+i+" elemento");
        }
        salva = vettore[0];
        for (int i = 0; i < q; i++) {
            for (int j = 0; j < dim-1; j++) {
                salva1 = vettore[i+1];
                vettore[i+1] = salva;
                salva = salva1;
            }
            vettore[0] = 0;
        }
        for (int i = 0; i < dim; i++) {
            output+= vettore[i]+" ";
        }
        JOptionPane.showMessageDialog(null,output);
    }

    public static int lettura (String msg){
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }
}
