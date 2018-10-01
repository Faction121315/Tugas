/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117112.latihan21.rata2nilai;

import java.util.Scanner;

/**
 *
 * @author MHF
 * NAMA     : Faksi Kilat Buana Arifin Putra
 * KELAS    : PBO3
 * NIM      : 10117112
 * 
 * Deskripsi program : Program ini berisi program untuk menghitung nilai dan 
 *                     Rata-Rata
 */
public class PBO310117112Latihan21Rata2Nilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int nilai;
        int nilaiA = 0;
        double rata;
        int banyak;
        int i = 1;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Banyak Mahasiswa : ");
        banyak = scanner.nextInt();
        System.out.println("");
        
        while (i <= banyak){
        
            System.out.print("Nilai Mahasiswa Ke-" + i++ + ": ");
            nilai = scanner.nextInt();
            nilaiA = nilaiA + nilai;
        }
        
        System.out.println("");
        rata = nilaiA / banyak;
        
        System.out.println("Maka, Rata-rata Nilainya Adalah " + rata);
        System.out.println("Developed By : Faksi Kilat Buana Arifin Putra");
        
    }
    
}