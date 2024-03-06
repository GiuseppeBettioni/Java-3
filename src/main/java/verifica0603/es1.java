package verifica0603;

import javax.swing.*;

public class es1 {
    public static void main(String[] args) {
        //Trovare tutti i numeri narcisistici in un intervallo specificato. I numeri narcisistici sono numeri per i quali la somma delle K cifre che li costituiscono
        // ognuna elevata a K, equivale al numero di partenza. Ad esempio: 153 = 1^3 + 5^3 + 3^3 = 1 + 125 +27 = 153
        int limiteMinore = lettura("Inserire limite minore");
        int limiteMaggiore = lettura("Inserire limite maggiore");
        int temp = 0;
        int temp2 =0;
        int somma = 0;
        int cifre = 0;
        String output = "I numeri narcisistici nell'intervallo specificato sono: ";
        for (int i = limiteMinore; i < limiteMaggiore; i++) {
            temp = i;
            while ( temp > 0 ){
                temp /= 10;
                cifre++;
            }
            temp = i;
            while ( temp > 0 ){
                temp2  = temp % 10;
                somma += (int) Math.pow(temp2,cifre);
                temp /= 10;
            }
            if (somma == i ){
                output += i + "  ";
            }
            somma = 0;
            cifre = 0;
        }
        output = output.substring(0,output.length()-1);
        JOptionPane.showMessageDialog(null,output);

    }

    public static int lettura (String msg){
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }
}
