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
public class BelajarBilanganPrima {
    
    public static void main(String[] args){
        
        int[] himpunan_angka = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        for (int i=2; i < himpunan_angka.length; i++){
            boolean isPrima = true;
            for (int j=2; j < i; j++){
                if(i % j == 0){
                    isPrima=false;
                    break;
                }
            }
            if(isPrima){
                System.out.print(i+" ");
            }
        }
    }
}
