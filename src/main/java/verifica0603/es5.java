package verifica0603;

import javax.swing.*;

public class es5 {
    public static void main(String[] args) {
        //5.Trovare il valore massimo in un array di numeri interi inseriti dall’utente.
        int lunghezza = lettura("Inserire lunghezza array");
        int[] array = new int[lunghezza];
        int max = 0;
        //String output ="";
        for (int i = 0; i < lunghezza; i++) {
            array [i] = lettura("Inserire il "+(i+1)+" elemento dell'array");
            if ( array[i] > max){
                max = array[i];
            }
            //output += array[i]+" ";
        }
        JOptionPane.showMessageDialog(null,"Il valore massimo degli elementi inseriti nell'array vale: "+max);
        //System.out.println(output);

    }

    public static int lettura (String msg){
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }
}
