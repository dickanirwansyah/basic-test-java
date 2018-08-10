/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belajar.basic;

/**
 *
 * @author dickaspring
 */
public class BelajarTrapesium {
    
     public static void main(String[] args){
        
        int n = 5;
        for (int i=1; i <= n; i++){
            for (int j=n; j > i; j--){
                System.out.print(" ");
            }
            for (int k=1; k <= i; k++){
                System.out.print("* ");
            }
            
            for (int jj = 5; jj > n; jj--){
                System.out.print(" ");
            }
            for (int kk = 1; kk <= n; kk++){
                System.out.print("* ");
            }
            
            System.out.println(" ");

        }
  
    }
}
