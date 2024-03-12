package es171a180;

import javax.swing.*;

public class es178 {
    public static void main(String[] args) {
        //Dato un vettore calcolare la media e costruire due vettori, uno con gli elementi minori, uno con quelli maggiori
        int lunghezza = lettura("Inserire lunghezza");
        int[] vettoreOriginale = new int[lunghezza];
        int somma = 0;
        int media = 0;
        int[] vettoreMin = new int[lunghezza];
        int[] vettoreMax = new int[lunghezza];
        int valoriMin = 0;
        int valoriMax = 0;
        String max = "";
        String min = "";
        for (int i = 0; i < lunghezza; i++) {
            vettoreOriginale[i] = lettura("Inserire il "+i+" elemento");
            somma+= vettoreOriginale[i];
        }
        media = somma/lunghezza;
        for (int i = 0; i < lunghezza; i++) {
            if (vettoreOriginale[i] > media ){
                vettoreMax[valoriMax] = vettoreOriginale[i];
                max += vettoreMax[valoriMax] + " ";
                valoriMax++;
            } else if (vettoreOriginale[i] < media ){
                vettoreMin[valoriMin] = vettoreOriginale[i];
                min += vettoreMin[valoriMin] + " ";
                valoriMin++;
            }
        }
        JOptionPane.showMessageDialog(null,max+"\n"+min);
    }
    public static int lettura(String msg) {
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }
}
