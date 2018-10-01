/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117112.latihan24.perbandinganduabuahnilai;

import java.util.Scanner;

/**
 *
 * @author MHF NAMA : Faksi Kilat Buana Arifin Putra KELAS : PBO3 NIM : 10117112
 *
 * Deskripsi program : Program ini berisi program untuk perbandingan dua nilai
 */
public class PBO310117112Latihan24PerbandinganDuaBuahNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int nilai1;
        int nilai2;
        String aktifitas = "Ya";

        Scanner scanner = new Scanner(System.in);

        System.out.println("=======Program Perbandingan Nilai=======");
        while ("Ya".equals(aktifitas)) {

            System.out.print("Masukan Nilai Pertama : ");
            nilai1 = scanner.nextInt();
            System.out.print("Masukan Nilai Kedua : ");
            nilai2 = scanner.nextInt();
            if (nilai1 < nilai2) {
                System.out.println("Hasil : " + nilai2
                        + "Lebih Besar Dari " + nilai1);
            } else if (nilai1 > nilai2) {
                System.out.println("Hasil : " + nilai1
                        + "Lebih Besar Dari " + nilai2);
            }
            System.out.print("Ulangi Aktifitas ? (Ya/Tidak) : ");
            aktifitas = scanner.next();
            System.out.println("");
        }
        System.out.println("");
    }

}
