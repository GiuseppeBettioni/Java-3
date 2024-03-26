package es181a190;

import javax.swing.*;

public class es181 {
    public static void main(String[] args) {
        //Leggere un vettore di caratteri e dire quante volte compaiono ogni vocale
        String input = lettura("Inserire testo").toLowerCase();
        int[] vettoreVocali = new int[5];
        String output ="";
        char carattere = '1';
        for (int i = 0; i < input.length(); i++) {
            carattere = input.charAt(i);
            switch (Character.toLowerCase(carattere)){
                case 'a':
                    vettoreVocali [0]++;
                    break;
                case 'e':
                    vettoreVocali [1]++;
                    break;
                case 'i':
                    vettoreVocali [2]++;
                    break;
                case 'o':
                    vettoreVocali [3]++;
                    break;
                case 'u':
                    vettoreVocali [4]++;
                    break;
                default:
                    break;
            }
        }
        for (int i = 0; i < 5; i++) {
            output += "Ci sono: "+vettoreVocali[i];
            switch (i){
                case 0:
                    output+= " a \n";
                    break;
                case 1:
                    output+= " e \n";
                    break;
                case 2:
                    output+= " i \n";
                    break;
                case 3:
                    output+= " o \n";
                    break;
                case 4:
                    output+= " u \n";
                    break;
                default:
                    break;
            }
        }
        JOptionPane.showMessageDialog(null,output);
    }

    public static String lettura (String msg){
        return JOptionPane.showInputDialog(msg);
    }
}
