/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop;

/**
 *
 * @author Irsyad
 */
public class Oop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Buku buku1 = new Buku();
        buku1.judul = "jurus dan senam pencak silat";
        buku1.penerbit = "PT.jhadkuk";
        buku1.penulis = "KH.Mr.suryatama,S.H";
        buku1.tahun_terbit = 1948;
        
        buku1.infoBuku();
    }
    
}
