/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117112.latihan26.waktusaatini;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author MHF NAMA : Faksi Kilat Buana Arifin Putra KELAS : PBO3 NIM : 10117112
 *
 * Deskripsi program : Program ini berisi program untuk Menampilkan waktu saat 
 * ini
 */
public class PBO310117112Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Date dNow = new Date();
        SimpleDateFormat ft =
        new SimpleDateFormat ("E yyyy.MM.dd hh:mm:ss a zzz");
        
        System.out.println("Hari ini Adalah Hari : "+ft.format(dNow));
    }
    
}
