package es121a130;

import javax.swing.*;

public class es124 {
    public static void main(String[] args) {
        //Calcolare tutti i numeri X Y Z < 100 tali che il risultato della loro moltiplicazione sia uguale alla loro somma
        int x;
        int y;
        int z;
        String output = "I numeri x y z con la loro moltiplicazione uguale alla loro somma sono: ";
        for (x = 1; x < 100 ; x++){
            for (y = 1; y < 100 ; y++){
                for (z = 1; z < 100 ; z++){
                    if ( x+y+z == x*y*z){
                        output+= x+" "+ y +" "+z+"\n";
                    }
                }
            }
        }
        JOptionPane.showMessageDialog(null,output);
    }
}
