package verifica0603;

import javax.swing.*;

public class es2 {
    public static void main(String[] args) {
        //2. Verificare se un numero è un numero perfetto.
        // I numeri perfetti sono numeri uguali alla somma dei loro divisori, escludendo il numero stesso. Ad esempio: 6 = 1 + 2 + 3
        int n = lettura("Inserire numero per sapere se sia perfetto");
        int temp = n;
        int somma = 0;
        String output = "Il numero inserito ";
        for (int i = 1; i < n; i++) {
            if ( n % i == 0 ){
                somma += i;
            }
        }
        if ( somma == n ){
            output += "è perfetto.";
        } else {
            output += "non è perfetto";
        }
        JOptionPane.showMessageDialog(null,output);
    }

    public static int lettura (String msg){
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }
}
