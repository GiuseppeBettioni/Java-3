package es131a140;

import javax.swing.*;

public class es138 {
    public static void main(String[] args) {
        //Stampare un triangolo di 2N righe del tipo
        //*
        //**
        //***
        //***
        //**
        //*
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire n"));
        String output ="";
        for (int i = 1; i <= n ; i++) {
            for (int j = 0; j < i; j++) {
                output += "*";
            }
            output +="\n";
        }
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                output += "*";
            }
            output+= "\n";
        }
        System.out.println(output);
    }
}
