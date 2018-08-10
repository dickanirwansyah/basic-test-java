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
public class BelajarSegita2 {
    
    public static void main(String[] args){
         int i,j,k,l,a;
  
     for ( i=1; i<6; i++ ){
        for (j=1; j<= i; j++){
            System.out.print("*");
        }
         
         for  (k=1;k<=(10-(i+i))+1;k++){
            System.out.print(" ");      //Spasi bagian Atas
          }
            
          
          for (j=1; j<= i; j++){
            System.out.print("*");
         }  
            
     
         System.out.println(" "); 
     }
     
    for (i=1; i<=11; i++){
    System.out.print("*"); //garis tengah
    }
    
    System.out.println();
    
    
    for (i=1;i<=6;i++){
                                
          for (j=1;j<=(6-i);j++){
            System.out.print("*");
            }
            
            System.out.print(" ");
            
          for  (k=1;k<=i*2-2;k++){
            System.out.print(" "); //Spasi bagian bawah
            }
            
          for (l=1;l<=(6-i);l++){
            System.out.print("*");
            }
            
            System.out.println();
           
        }
      
    }
}
