package es171a180;

import javax.swing.*;

public class es179 {
    public static void main(String[] args) {
        //Dato un vettore di N numeri inferiori a 1000
        //contare le frequenze con le quali i numeri si ripartiscono nelle decadi 0-9, 10-19, 20-29,... 990-999
        //Per non impazzire io ho fatto n inferiore a 500, centinaia 0-99, 100-199 invece di decadi.
        int lunghezza = lettura("Inserire lunghezza");
        int[] vettoreOriginale = new int[lunghezza];
        int[] vettoreCentinaia = new int[5];
        String output ="";
        for (int i = 0; i < lunghezza; i++) {
            vettoreOriginale[i] = lettura("Inserire il "+i+" elemento");
             switch (vettoreOriginale[i] / 100 ){
                 case 0:
                     vettoreCentinaia[0] ++;
                     break;
                 case 1:
                     vettoreCentinaia[1]++;
                     break;
                 case 2:
                     vettoreCentinaia[2]++;
                     break;
                 case 3:
                     vettoreCentinaia[3]++;
                     break;
                 case 4:
                     vettoreCentinaia[4]++;
                     break;
                 default:
                     break;
             }
        }
        for (int i = 0; i < 5; i++) {
            output+= "Ci sono: "+vettoreCentinaia[i]+" nel range: "+(i*100)+" "+(i*100+99)+"\n";
        }
        JOptionPane.showMessageDialog(null,output);
    }
    public static int lettura(String msg) {
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }
}
