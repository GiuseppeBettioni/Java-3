package es90a100;

import javax.swing.*;

public class es96bis {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Inserisci a"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Inserisci b"));
        while (a!=b){
            if (a == 0 || b == 0){
                break;
            }
            if ( a > b ){
                a -=b;
            } else {
                b -= a;
            }
        }
        JOptionPane.showMessageDialog(null,"L mcd vale: "+(a+b)/2);
    }


}
