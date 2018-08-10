/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belajar.basic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dickaspring
 */
public class BelajarBilanganGanjilGenap {
    
    public static void main(String[] args){
        
        int[] himpunan_bilangan = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        
        System.out.print("ini bilang genap : ");
        for (int i=1; i < himpunan_bilangan.length; i++){
            if (himpunan_bilangan[i] %2 != 0){
                System.out.print(i+" ");
            }
        }
        
        System.out.print("\nini bilangan ganjil : ");
        for (int i=1; i < himpunan_bilangan.length; i++){
            if(himpunan_bilangan[i] %2 == 0){
                System.out.print(i+" ");
            }
        }
    }
}
