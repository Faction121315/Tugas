/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117112.latihan27.hurufbesarkecil;

import java.util.Scanner;

/**
 *
 * @author MHF NAMA : Faksi Kilat Buana Arifin Putra KELAS : PBO3 NIM : 10117112
 *
 * Deskripsi program : Program ini berisi program untuk Mengubah kalimat
 * menjadi huruf kapital semua dan kecil semua
 */
public class PBO310117112Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String kalimat;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.printf("Masukkan Kalimat : ");
        kalimat = scanner.nextLine();
        
        String kalimat1 = kalimat.toUpperCase();
        String kalimat2 = kalimat.toLowerCase();
        
        System.out.println("========Hasil Formatting======");
        System.out.println("Huruf Besar : "+kalimat1);
        System.out.println("Huruf Kecil : "+kalimat2);
    }
    
}
