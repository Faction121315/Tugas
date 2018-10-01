/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117112.latihan23.nilaiterbesar.terkecil;

import java.util.Scanner;

/**
 *
 * @author MHF NAMA : Faksi Kilat Buana Arifin Putra KELAS : PBO3 NIM : 10117112
 *
 * Deskripsi program : Program ini berisi program untuk Menentukan Nilai
 * Terbesar dan Terkecil
 */
public class PBO310117112Latihan23NilaiTerbesarTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String namaPetugas;
        int no;
        int min;
        int max;
        int banyakKmhs;
        int[] nilai = new int[100];

        //scenner
        Scanner name = new Scanner(System.in);

        System.out.println("=====Program Nilai Terbesar dan Terkecil Mahasiswa"
                + "=====");
        System.out.print("Masukkan Nama Petugas : ");
        namaPetugas = name.next();
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        banyakKmhs = name.nextInt();

        for (no = 1; no <= banyakKmhs; no++) {
            System.out.print("Masukkan Nilai Mahasiswa ke- " + no + " : ");
            nilai[no] = name.nextInt();
        }
        
        max = 0;
        min = 1;
        
        System.out.println("\n" + "============Hasil Nilai Mahasiswa===========");
        for (no = 1; no <= nilai[no]; no++) {
            if (nilai[no] > max) {
                max = nilai[no];}
            if (nilai[no] < min) {
                min = nilai[no];}
            

            System.out.println("Nilai Mahasiswa ke- " + no + " :" + nilai[no] + "\n");
        }
        System.out.println("\n" + "Nilai Terbesar Adalah " + max);
        System.out.println("Nilai Terkecil adalah " + min + "\n");
        System.out.println("Petugas : " + namaPetugas + "\n");
    }

}
