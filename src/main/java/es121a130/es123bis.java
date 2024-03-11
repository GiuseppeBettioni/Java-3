package es121a130;

import javax.swing.*;

public class es123bis {
    public static void main(String[] args) {
        //Cercare la sequenza di numeri non primi inferiori ad n
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire n"));
        int seq = 0;
        int seqMax = 0;
        String output ="";
        String outputMax = "";
        int div = 0;
        for (int i = 1; i < n ; i++) {
            div = 0;
            for (int j = 1; j <= i; j++) {
                if ( i % 2 == 0 && i != 2){
                    break;
                }
                if ( i % j == 0 ){
                    div++;
                }
            }
            if ( div != 2 ){
                seq++;
                output+=i+" ";
            } else {
                if (seq >= seqMax){
                    seqMax = seq;
                    outputMax = output;
                }
                seq = 0;
                output ="";
            }
        }
        if ( seq >= seqMax ){
            seqMax = seq;
            outputMax = output;
        }
        JOptionPane.showMessageDialog(null,outputMax);
    }
}
