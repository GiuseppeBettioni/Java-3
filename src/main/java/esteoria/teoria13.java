package esteoria;

import javax.swing.*;
import java.util.Arrays;

public class teoria13 {
    public static void main(String[] args) {
        //Invertire gli elementi di un array, il primo diventa l'ultimo
        int dim = lettura("Inserire dim");
        int[] array = new int[dim];
        int temp = 0;
        for (int i = 0; i < dim; i++) {
            array[i] = lettura("Inserire elemento "+i);
        }
        for (int i = 0; i < dim/2; i++) {
            temp = array[i];
            array[i] = array[dim-1-i];
            array[dim-1-i] = temp;
        }
        JOptionPane.showMessageDialog(null, Arrays.toString(array));
    }

    public static int lettura (String msg){
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }
}
