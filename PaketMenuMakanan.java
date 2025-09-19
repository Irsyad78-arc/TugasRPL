/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menumakanan;
import java.util.Scanner;

public class MenuMakanan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Daftar menu
        String[] menu = {"Paket Ayam", "Paket Ikan", "Paket Daging", "Paket Sayur"};
        int[] harga = {15000, 20000, 30000, 10000};

        // Tampilan
        System.out.println( "====== MENU PAKET MAKANAN ======" );
        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%d. %-15s" + " Rp%,d%n", (i + 1), menu[i], harga[i]);
        }
        System.out.println("=================================");

        // Input pilihan
        System.out.print("Masukkan nomor menu yang dipilih (pisahkan dengan spasi, contoh: 1 3 4): ");
        String pilihanString = in.nextLine();
        String[] pilihanArray = pilihanString.split(" ");

        int total = 0;

        System.out.println("=== RINCIAN PESANAN ===");
        for (String p : pilihanArray) {
            try {
                int pilihan = Integer.parseInt(p);
                int subtotal = 0;

                switch (pilihan) {
                    case 1 -> {
                        // Paket Ayam
                        System.out.print("Masukkan jumlah porsi untuk " + menu[0] + ": ");
                        int porsiAyam = in.nextInt();
                        subtotal = harga[0] * porsiAyam;
                        System.out.println(menu[0] + porsiAyam + " = Rp" + subtotal);
                    }

                    case 2 -> {
                        // Paket Ikan
                        System.out.print("Masukkan jumlah porsi untuk " + menu[1] + ": ");
                        int porsiIkan = in.nextInt();
                        subtotal = harga[1] * porsiIkan;
                        System.out.println(menu[1] + porsiIkan + " = Rp" + subtotal);
                    }

                    case 3 -> {
                        // Paket Daging
                        System.out.print("Masukkan jumlah porsi untuk " + menu[2] + ": ");
                        int porsiDaging = in.nextInt();
                        subtotal = harga[2] * porsiDaging;
                        if (porsiDaging > 0) {
                            System.out.println("Diskon Rp5.000 untuk Paket Daging!");
                            subtotal -= 5000; // diskon khusus
                        }
                        System.out.println(menu[2] + porsiDaging + " = Rp" + subtotal);
                    }

                    case 4 -> {
                        // Paket Sayur
                        System.out.print("Masukkan jumlah porsi untuk " + menu[3] + ": ");
                        int porsiSayur = in.nextInt();
                        subtotal = harga[3] * porsiSayur;
                        System.out.println(menu[3] + porsiSayur + " = Rp" + subtotal);
                    }

                    default -> System.out.println("Menu dengan nomor " + pilihan + " tidak tersedia.");
                }

                total += subtotal;

            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid: " + p );
            }
        }

        System.out.println("=====================================");
        System.out.println("Total yang harus dibayar: " + "Rp" + total );

        in.close();
    }
}
