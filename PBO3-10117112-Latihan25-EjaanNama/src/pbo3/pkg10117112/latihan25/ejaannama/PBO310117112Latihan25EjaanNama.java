/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117112.latihan25.ejaannama;

import java.util.Scanner;

/**
 *
 * @author MHF NAMA : Faksi Kilat Buana Arifin Putra KELAS : PBO3 NIM : 10117112
 *
 * Deskripsi program : Program ini berisi program untuk Ejaan nama
 */
public class PBO310117112Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //variabel
        String nama;
        
        //scanner
        Scanner scanner = new Scanner(System.in);
        
        //input
        System.out.print("Masukkan nama depan anda untuk di eja : ");
        nama = scanner.next();
        
        int len = nama.length();
        char[] arrChar = new char[len];
        
        //looping ejaan
        for (int no = 0; no <= len-1; no++){
            arrChar[no] = nama.charAt(no);
            System.out.println("Huruf ke-"+(no+1)+  " : "+arrChar[no]);
        }
    }
    
}
