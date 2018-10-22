/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117112.latihan41.massajenis;

import java.util.Scanner;

/**
 * NAMA     : Faksi Kilat Buana Arifin Putra
 * Kelas    : IF - 3
 * NIM      : 10117112
 * Deskripsi Program  : Program ini menapilkan hasil voulme dan jenis kubus
 * 
 * @author MHF
 */
public class PBO310117112Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner keyboard = new Scanner (System.in);
        kubus kbs = new kubus();
        
        System.out.println("========Massa Jenis Kubus========");
        System.out.print("Sisi : ");
        kbs.setSisi(keyboard.nextInt());
        System.out.print("Massa : ");
        kbs.setMassa(keyboard.nextInt());
        
        System.out.println("\n"+"========Hasil Perhitungan========");
        System.out.println("Volume : " + kbs.hitungVolume(kbs.getSisi()));
        System.out.println("Massa Jenis : " 
                + kbs.hitungMassaJenis(kbs.getMassa(), 
                        kbs.hitungVolume(kbs.getSisi())));
        
    }
    
}
