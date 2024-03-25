package Funzioni_Utili;

import javax.swing.*;
import java.util.Arrays;

public class StampareArraySenzaFor {
    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 2, 3, 4};
        JOptionPane.showMessageDialog(null, Arrays.toString(array));

    }
}
