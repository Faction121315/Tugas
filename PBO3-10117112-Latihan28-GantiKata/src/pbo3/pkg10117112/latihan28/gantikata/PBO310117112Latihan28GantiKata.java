/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117112.latihan28.gantikata;

import java.util.Scanner;

/**
 *
 * @author MHF NAMA : Faksi Kilat Buana Arifin Putra KELAS : PBO3 NIM : 10117112
 *
 * Deskripsi program : Program ini berisi program untuk Mengganti Kata
 */
public class PBO310117112Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //deklarasi variable
        String kalimatAwal, kalimatBaru, gantiKata, jadiKata;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=======Program Ganti Kata=======");
        System.out.print("Masukkan Kalimat : ");
        kalimatAwal = scanner.nextLine();
        System.out.print("Ganti Kata : ");
        gantiKata = scanner.next();
        System.out.print("Menjadi Kata : ");
        jadiKata = scanner.next();
        
        //proses pergantian kata
        kalimatBaru = (kalimatAwal).replaceAll(gantiKata, jadiKata);
        
        //output
        System.out.println("\n======Hasil Formatting======");
        System.out.println("Kalimat Awal : "+kalimatAwal);
        System.out.println("Kalimat Baru : "+kalimatBaru);
    }
    
}
