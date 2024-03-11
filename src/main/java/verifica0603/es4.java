package verifica0603;

import javax.swing.*;

public class es4 {
    public static void main(String[] args) {
        //4.Trova la somma di tutti i numeri primi inferiori a un dato numero N.
        int limiteSuperiore = lettura("Inserire limite superiore");
        int div = 0;
        int somma = 0;
        for (int i = 2; i < limiteSuperiore; i++) {
            div = 0;
            for (int j = 2; j < i; j++) {
                if ( i % j == 0){
                    div++;
                }
            }
            if ( div == 0 ){
                somma += i;
            }
        }
        JOptionPane.showMessageDialog(null,"La somma dei numeri primi inferiori a "+ limiteSuperiore+" vale: "+somma);

    }
    public static int lettura (String msg){
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }
}
