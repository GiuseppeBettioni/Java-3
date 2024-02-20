package es121a130;

import javax.swing.*;

public class es125 {
    public static void main(String[] args) {
        //Calcolare tutte le terne pitagoriche delle variabili x y z < 100 tali che x*x + y*y = z*z
        int x,y,z;
        String output ="Le terne di numeri sono: ";
        for (x = 1; x < 100; x++){
            for (y = 1; y < 100; y++){
                for (z = 1; z < 100; z++){
                    if (Math.pow(x,2)+Math.pow(y,2)==Math.pow(z,2)){
                    output+= x +" "+y+" "+z+"\n";
                    }
                }
            }
        }
        JOptionPane.showMessageDialog(null,output);
    }
}
