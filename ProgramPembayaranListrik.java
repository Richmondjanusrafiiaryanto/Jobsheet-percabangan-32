/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programpembayaranlistrik;

import java.util.Scanner;

/**
 *
 * @author surga 2019
 */
public class ProgramPembayaranListrik {



/**
 * @param args the command line arguments
 */
public static void main(String[] args) {
        double biaya;
        double tarifperkwh;
        double hargalangganan;
        double pajak;
        double totalbiaya;
        
        System.out.println("--Program Pembayaran Tagihan Listrik--");
        
        //Syarat pembayaran 
        
        //golongan A
        double hargalanggananA = 50000;
        double tarifperkwhA = 3000;
        //golongan B
        double hargalanggananB = 35000;
        double tarifperkwhB = 2500;
        //golongan 
        double hargalanggananC = 20000;
        double tarifperkwhC = 1000;
        //input
        Scanner scanner = new Scanner (System.in);
        System.out.print("besar pemakaian kwh ?");
        int a = scanner.nextInt();
    if (a <= 450){
        System.out.println("golongan c");
        biaya = hargalanggananC + (tarifperkwhC * a);
        System.out.println("biaya : " + biaya);
        pajak = (0.1 * biaya);
        totalbiaya = (biaya + pajak);
        System.out.println("Total Biaya : " + totalbiaya);
    }else if (a <=900){
        System.out.println("golongan b");
        biaya = hargalanggananB + (tarifperkwhB * a);
        System.out.println("biaya : " + biaya);
        pajak = (0.15 / biaya);
        totalbiaya = (biaya + pajak);
        System.out.println("Total Biaya : " + totalbiaya);
    }else if (a <=1200){
        System.out.println("golongan a");
        biaya = hargalanggananA + (tarifperkwhA * a);
        System.out.println("biaya : " + biaya);
        pajak = (0.2 / biaya);
        totalbiaya = (biaya + pajak);
        System.out.println("Total biaya : " + totalbiaya);
        
        
        
   

        
        
        
        
        
        
        
        
        
                
                
        
        
        
        
        
        
        
        
        
        
    
    
    
        
   
        
        
        
  
    }
   }
}
