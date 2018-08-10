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
public class BelajarSegitigaTerbalikScanner {
    
    public static void main(String[] args){
        
        System.out.println("Masukkan bilangan : ");
        Scanner scanner = new Scanner(System.in);
        int inputan = scanner.nextInt();
        System.out.println("segitiga terbalik dengan inputan : "+method_segitiga_terbalik(inputan));
    }
    
    static int method_segitiga_terbalik(int inputan){
      
        for (int i = 1; i <= inputan; i++){
            for (int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for (int k=inputan; k > i; k--){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        return inputan;
    }
}
