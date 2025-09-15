/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author Irsyad
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Siswa siswa1 = new Siswa();
        siswa1.nama = "budi";
        siswa1.umur = 17;
        
        Siswa siswa2 = new Siswa();
        siswa2.nama = "Rasyid";
        siswa2.umur = 20;
        
    siswa1.perkenalan();
    siswa2.perkenalan();     
    
    }
    
}
