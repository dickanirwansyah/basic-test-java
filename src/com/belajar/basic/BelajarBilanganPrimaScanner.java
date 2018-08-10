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
public class BelajarBilanganPrimaScanner {
    
    public static void main(String[] args){
        
        System.out.print("masukkan bilangan : ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(method_prima(input));
    }
    
    static int method_prima(int n){
        for (int i=2; i < n; i++){
            boolean isPrima = true;
            for (int j=2; j < i; j++){
                if (i % j == 0){
                    isPrima = false;
                    break;
                }
            }
            if(isPrima){
                System.out.println(i+" ");
            }
        }
        return n;
    }
}
