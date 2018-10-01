/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117112.latihan22.perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author MHF
 * NAMA     : Faksi Kilat Buana Arifin Putra
 * KELAS    : PBO3
 * NIM      : 10117112
 * 
 * Deskripsi program : Program ini berisi program untuk menghitung Keliling dan 
 *                     Luas Lingkaran
 */
public class PBO310117112Latihan22PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double jari;
        double keliling;
        double luas;
        String n;
        double phi = 3.14;
        boolean ulang = true;
                
        
        Scanner scanner = new Scanner(System.in);
        
        while(ulang==true){
        
        System.out.println("=======Perhitungan Lingkaran========");
        System.out.print("Masukan Nilai Diameter Lingkaran : ");
        n = scanner.next();
        
        if(n.matches("[0-9]*")){
        double akhir =Double.parseDouble(n);
        
            jari = akhir * 0.5;
            luas =  0.5 * 3.14 * jari * jari;
            keliling = 2 * 3.14 * jari;
        
        
        System.out.println("=======Hasil Perhitungan Lingkaran========");
        System.out.println("Jari - Jari Lingkaran = " +jari+ "cm");
        System.out.println("Luas Lingkaran        =" +luas+"cm");
        System.out.println("Keliling Lingkaran    =" +keliling+ "cm");
        ulang = false;
        
        
        }else
        
            System.out.println("Nilai Diameter Tidak Sesuai");
        }
    }
    
}