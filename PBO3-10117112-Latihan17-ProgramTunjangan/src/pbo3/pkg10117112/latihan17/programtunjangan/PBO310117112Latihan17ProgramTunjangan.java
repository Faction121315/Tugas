/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117112.latihan17.programtunjangan;

import java.util.Scanner;

/**
 *
 * @author MHF
 * NAMA     : Faksi Kilat Buana Arifin Putra
 * KELAS    : PBO3
 * NIM      : 10117112
 * 
 * Deskripsi program : Program ini berisi program menghitung Tunjangan
 */
public class PBO310117112Latihan17ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double gP;
        String status = null;
        double tunjangan;
        double gT;

        Scanner scanner = new Scanner(System.in);
        System.out.println("================Program Tunjangan================");
        System.out.print("Berapa Gaji Pokok Anda Perbulan? : Rp. ");
        gP = scanner.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum) : ");
        status = scanner.next();

        System.out.println("");
        System.out.println("========== Hasil Perhitungan Gaji Anda ==========");
        System.out.println("Gaji Pokok : Rp. " + gP);

        if ("menikah".equals(status)) {
            tunjangan = gP * 0.35;
        } else {
            tunjangan = gP * 0;
        }

        System.out.println("Tunjangan : Rp. " + tunjangan);

        gT = gP + tunjangan;

        System.out.println("Total Gaji : Rp. " + gT);

        System.out.println("(Developed By Faksi Kilat Buana Arifin Putra");

    }

}
