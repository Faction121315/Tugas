/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117112.latihan45.cetaknama;

import java.util.Scanner;

/**
 * NAMA     : Faksi Kilat Buana Arifin Putra
 * Kelas    : IF - 3
 * NIM      : 10117112
 * Deskripsi Program  : Program ini menapilkan cetak nama
 * @author MHF
 */
public class PBO310117112Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner action = new Scanner(System.in);
        printer print = new printer();

        System.out.println("=====Aplikasi Pencetak Nama=====");
        System.out.print("Masukkan nama anda : ");
        print.setNama(action.nextLine());
        System.out.print("Mau cetak nama berapa kali? : ");
        print.setJmlCetak(action.nextInt());

        print.cetak(print.getNama());
        print.cetak(print.getJmlCetak(), print.getNama());

    }

}
