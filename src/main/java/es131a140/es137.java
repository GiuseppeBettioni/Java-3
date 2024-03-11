package es131a140;

import javax.swing.*;

public class es137 {
    public static void main(String[] args) {
        //Stampa due triangoli di n linee del tipo
        /*
        12345678901234
        ...*......*...
        ..***....***..
        .*****..*****.
        **************
         */
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire n"));
        int caratteriPerLinea = n*4-2;
        int asterischi = 1;
        int asterischi2 = 1;
        int punti1,punti2;
        int temp1,temp2;
        String output ="";
        for (int i = 1; i <= n; i++) {
            temp1 = asterischi;
            temp2 = asterischi2;
            punti1 = n - i;
            punti2 = caratteriPerLinea - (asterischi+asterischi2+(punti1*2));
            for (int j = 0; j < caratteriPerLinea; j++) {
                if ( punti1 > 0 ){
                    output+=".";
                    punti1--;
                } else if (temp1>0){
                    output+="*";
                    temp1--;
                } else if ( punti2 > 0 ){
                    output+= ".";
                    punti2--;
                } else if (temp2 > 0 ){
                    output+="*";
                    temp2--;
                } else {
                    output += ".";
                }
            }
            asterischi += 2;
            asterischi2 += 2;
            output+="\n";
        }
        JOptionPane.showMessageDialog(null,output);
        System.out.println(output);
    }
}
