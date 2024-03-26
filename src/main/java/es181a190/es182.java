package es181a190;

import javax.swing.*;

public class es182 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Inserire testo");
        int[] frequenza = new int[26];
        for (int i = 0; i < input.length(); i++) {
            char c = Character.toLowerCase(input.charAt(i));
            if (c >= 'a' && c <= 'z'){
                frequenza[c-'a']++;
            }
        }
        String output ="";
        for (int i = 0; i < 26; i++) {
            output += frequenza[i]+" ";
        }
        JOptionPane.showMessageDialog(null,output);
    }
}
