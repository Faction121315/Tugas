/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117112.latihan39.objectoriented.nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author MHF
 */
public class PBO310117112Latihan39ObjectOrientedNilaiTerbesarDanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        nilai nil = new nilai();
        Scanner keyboard = new Scanner(System.in);
        
        int bykMah;
        String nama;
        System.out.println
        ("========Program Nilai Terbesar dan Terkecil nilai Mahasiswa========");
        System.out.print("Masukkan Nama Petugas : ");
        nama = keyboard.nextLine();
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        bykMah = keyboard.nextInt();
        nil.inputNilai(nil.nilai, bykMah);
        nil.tampilBesarKecil(nil.nilai, bykMah);
        
        System.out.println("\n"+"Petugas : " + nama);
        
    }
    
}
