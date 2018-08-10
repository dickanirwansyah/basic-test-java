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
public class BelajarBilanganFibonacci {
    
    public static void main(String[] args){
        
        System.out.println("input angka : ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println("angka yang diinput : "+method_fibonacci(input));
    }
    
    static int method_fibonacci(int n){
        
        long fib[] = new long[n];
        fib[0] = 0;
        fib[1] = 1;
        
        for (int i=2; i < n; i++){
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        for (int i=0; i < n; i++){
            System.out.println(fib[i]+" ");
        }
        return n;
    }
}
