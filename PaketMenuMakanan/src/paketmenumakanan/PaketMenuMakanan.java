/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paketmenumakanan;
import java.util.Scanner;
/**
 *
 * @author Irsyad
 */
public class PaketMenuMakanan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           int Menu;
        
        Scanner in = new Scanner (System.in);
        System.out.println("=== MENU PAKET MAKANAN ===");
        System.out.println(" \n1.Paket Ayam - Rp.15.000 \n 2.Paket Ikan - Rp.20.000 \n 3.Paket Daging - Rp.30.000 dis. Rp.5000 \n4.Paket Sayur - Rp.10.000 \n\n Masukkan Pilihan");
        Menu = in.nextInt();
                
        int harga = switch (Menu){
            case 1 -> 15000;
            case 2 -> 20000;
            case 3 -> 25000;
            case 4 -> 10000;    
            default -> 0;   };    
       
        switch (Menu){
           case 1 -> System.out.println("Anda Memilih paket Ayam, dengan harga Rp15.000");
           case 2 -> System.out.println("Anda Memilih paket Ikan, dengan harga Rp20.000");
           case 3 -> { System.out.println("Anda Memilih paket Daging, dengan harga Rp30.000");
                       System.out.println("Selamat Anda mendapatkan potongan Rp5.000!"); }
           case 4 -> System.out.println("Anda Memilih paket Sayur, dengan harga Rp10.000");
           default -> System.out.println("Pilihan tidak tersedia");
        }
        if (harga > 0 ) {
           System.out.println("Total yang harus dibayar: Rp." + harga);
        }
    }
    
}
