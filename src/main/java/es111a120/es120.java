package es111a120;

import javax.swing.*;

public class es120 {
    public static void main(String[] args) {
        //Cercare il numero primo immediatamente superiore a un numero dato
        int numeroLimite = Integer.parseInt(JOptionPane.showInputDialog("Inserire numero"));
        int primo = numeroLimite+1;
        int contaPrimo = 0;
        boolean checkPrimo = false;
        while (!checkPrimo){
            contaPrimo = 0;
            primo++;
            for (int i = 2; i < primo; i++) {
                if (primo % i == 0 ){
                    contaPrimo++;
                }
            }
            if (contaPrimo ==0){
                checkPrimo = true;
            } else{
                checkPrimo = false;
            }
        }
        JOptionPane.showMessageDialog(null,primo);
    }
}
