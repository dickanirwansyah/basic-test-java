/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belajar.basic;

import javax.swing.JOptionPane;

/**
 *
 * @author dickaspring
 */
public class BelajarPerkalian {
    
    public static void main(String[] args){
        
        int i, n, j, a;
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan batas daftar perkalian : "));
 
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                a = i * j;
                System.out.println(i + " * " + j + " = " + a);
            }
            System.out.println(" ");
        }        
    }
}
