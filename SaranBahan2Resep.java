/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saranbahan2resep;

import java.util.Scanner;


/**
 *
 * @author surga 2019
 */
public class SaranBahan2Resep {
    private static int bahan1;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String identitas = "Richmond janus rafii aryanto / XRPL 2 / 32";
    System.out.print("Richmond janus rafii aryanto XRPL2 32 : "+ identitas);
    
    System.out.print("\nSaran Resep dari Bahan Milik Anda\n");
    
    

//Initial commit.
Scanner scanner = new Scanner(System.in);

System.out.println("bahan Pertama: ");
System.out.println("1. Pisang");
System.out.println("2. Telur");
System.out.println("masukkan no pilihan Anda :");
int bahanl = scanner.nextInt();

//Tambah Input Bahan 1
if(bahan1 == 1 || bahan1 == 2 )
{
   System.out.println("bahan kedua: ");
   if(bahan1 == 1) {
       System.out.println("1. Susu");
       System.out.println("2. Minyak Goreng");
       System.out.println("3. Tidak ada");
   }else{
       System.out.println("1. Minyak Goreng");
       System.out.println("2. Roti");
       System.out.println("3. Tidak ada");
   }
   System.out.print("Masukkan no pilihan Anda :");
   int bahan2 = scanner.nextInt();
   
}else
    System.out.println("Mohon Maaf, Pilihan tidak ditemukan, "+ "tidak dapat memberikan saran resep");
//Tambah input Bahan 2.
int bahan2 = scanner.nextInt();
if(bahan2 >= 1 && bahan2 <= 3)
{
     if(bahan2 == 1)
         switch(bahan2)
         {
             case 1: System.out.println("Anda dapat membuat milk shake banana"); break;
             case 2: System.out.println("Anda dapat membuat pisang goreng"); break;
             case 3: System.out.println("Anda dapat membuat pisang rebus");
        }
     else
         switch(bahan2)
        {
            case 1: System.out.println("Anda dapat membuat telor mata sapi"); break;
            case 2: System.out.println("Anda dapat membuat sandwich telur"); break;
            case 3: System.out.println("Anda dapat membuat telur rebus");
        }
}else
    System.out.println("Mohon maaf, Pilihan anda tidak ditemukan, "+ "tidak dapat memberikan saran resep");
     
         
     
}}

   
       
  

    

