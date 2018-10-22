/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117112.latihan46.tandanyakamu;

import java.util.Scanner;

/**
 * NAMA     : Faksi Kilat Buana Arifin Putra
 * Kelas    : IF - 3
 * NIM      : 10117112
 * Deskripsi Program  : Program ini menapilkan hasil umur
 * @author MHF
 */
public class PBO310117112Latihan46TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        age ag = new age(2018);

        Scanner syds = new Scanner(System.in);
        System.out.print("Masukkan Tahun lahir anda : ");
        ag.setYearBirth(syds.nextInt());

        System.out.println("======Hasil Perhiyungan Umur======");
        System.out.println("Tahun Lahir Anda : " + ag.getYearBirth(0));
        System.out.println("Hari ini Tahun : " + ag.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah "
                + ag.hitungUmur() + " tahun");
        System.out.println("Tandanya Kamu : " + ag.tandanyaKamu(ag.hitungUmur()));
        
    }
    
}
