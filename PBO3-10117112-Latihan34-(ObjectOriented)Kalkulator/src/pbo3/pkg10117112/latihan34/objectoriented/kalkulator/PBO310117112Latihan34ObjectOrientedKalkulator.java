/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117112.latihan34.objectoriented.kalkulator;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author MHF
 */
public class PBO310117112Latihan34ObjectOrientedKalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        Kalkulator kal = new Kalkulator();

        System.out.println("====Aplikasi Kalkulator Bilangan====");
        System.out.print("Masukkan Angka ke-1 : ");
        kal.value1 = scn.nextDouble();
        System.out.print("Masukkan Angka ke-2 : ");
        kal.value2 = scn.nextDouble();

        //format dua digit di belakang koma
        DecimalFormat df = new DecimalFormat("###.##");

        System.out.println("\nHasil Penjumlahan : "+kal.tambahBilangan());
        System.out.println("Hasil Pengurangan : "+kal.kurangBiangan());
        System.out.println("Hasil Perkalian : "+kal.kaliBilangan());
        System.out.println("Hasil Pembagian : "+df.format(kal.bagiBilangan()));
        System.out.println("Hasil Sisa : "+kal.sisaBilangan());

    }
        
    }
 