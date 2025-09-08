/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nilai_mutu.java;
import java.util.Scanner;

public class nilai_mutu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    int nilai;
    Scanner input = new Scanner (System.in);    
    System.out.println("masukan nilai");   
    
    nilai=input.nextInt();    
    if (nilai >= 90){
        System.out.println("Selamat, Anda Mendapatkan Nilai A");
    }
    
    nilai=input.nextInt();    
    if (nilai >= 70-89){
        System.out.println("Selamat, Anda Mendapatkan Nilai B");
    }
    
    nilai=input.nextInt();    
    if (nilai >= 60-69){
        System.out.println("Selamat, Anda Mendapatkan Nilai C");
    }
    
    nilai=input.nextInt();    
    if (nilai >= 50-59){
        System.out.println("Selamat, Anda Mendapatkan Nilai D");
    }
    
     nilai=input.nextInt();    
    if (nilai >= 0-49){
        System.out.println("Selamat, Anda Mendapatkan Nilai E");
    }
    
    else{
        System.out.println("Silahkan Coba Tahun depan");
    }
    }   
}


