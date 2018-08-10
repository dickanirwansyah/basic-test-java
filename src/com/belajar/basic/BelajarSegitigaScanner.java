/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belajar.basic;

import java.util.Scanner;

/**
 *
 * @author dickaspring
 */
public class BelajarSegitigaScanner {
    
    public static void main(String[] args){
        
        System.out.println("masukkan angka : ");
        Scanner scanner = new Scanner(System.in);
        int inputan = scanner.nextInt();
        System.out.println("segitiga dengan banyak bintang : "+method_segitiga(inputan));
        
    }
    
    static int method_segitiga(int n){
        for (int i = 1; i <= n; i++){
            for (int j = n; j > i; j--){
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        return n;
    }
}
