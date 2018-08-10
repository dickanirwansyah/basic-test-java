/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belajar.basic;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author dickaspring
 */
public class BelajarSegiEmpatBintang {
    
    public static void main(String[] args){
        int i, n, j;
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan jumlah baris"));
 
        for (i = 1; i <= n; i++) {
            for (j = i; j >= 2; j--) {
                System.out.print(" ");
            }
        }
        for (j = i; j >= 1; i--) {
            for (j = n; j >= i; j--) {
                System.out.print("*");
            }
            for (j = (i * 2 - 1); j >= 2; j--) {
                System.out.print(" ");
            }
            for (j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
