/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117112.latihan6.kambingstatic.konstanta;

/**
 *
 * @author MHF
 * NAMA     : Faksi Kilat Buana Arifin Putra
 * KELAS    : PBO3
 * NIM      : 10117112
 * 
 * Deskripsi program : Program ini berisi program untuk menampilkan nilai suatu
 *                      variabel yang variabelnya diambil dari variabel badan 
 *                      utama
 */
public class KambingStatic {
    
    //NAMA_KAMBING Sebagai Konstanta
    
    public static final String NAMA_KAMBING = "Seppi";
    
    public static void main(String[] args) {
        
        Mamalia.jumlahKambing = 48000;
        System.out.println(NAMA_KAMBING + " Memiliki Kambing Sebanyak : " +
                            Mamalia.jumlahKambing);
        
    }
    
}
