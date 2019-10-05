/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan24.perbandingannilai;
// package scanner
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA              : David Aditya Winarto
 * KELAS             : PBO2
 * NIM               : 10118071
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 *                     perbandingan dua buah nilai  
 * 
 */
public class PBO210118071Latihan24PerbandinganNilai {

    /**
     * @param args the command line arguments
     */
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("========Program Perbandingan Nilai========");
        String pilih = "Ya";
        
        while (!(pilih.equals("Tidak"))) {
            nilai();
            
            System.out.println("");
            System.out.print("Ulangi Aktifitas ? (Ya/Tidak) : ");
            pilih = input.next();
            System.out.println("");
        }
    }

    public static void nilai() {
        int satu, dua;

        System.out.print("Masukkan nilai pertama \t: ");
        satu = input.nextInt();
        System.out.print("Masukkan nilai kedua \t: ");
        dua = input.nextInt();

        if (satu > dua) {
            System.out.println("Hasil : " + satu + " Lebih besar dari " + dua);
        } else if (dua > satu) {
            System.out.println("Hasil : " + satu + " Lebih kecil dari " + dua);
        } else {
            System.out.println("Hasil : " + satu + " Sama dengan " + dua);
        }
    }
    
}
