/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117112.latihan19.saldotabungan;

/**
 *
 * @author MHF
 * NAMA     : Faksi Kilat Buana Arifin Putra
 * KELAS    : PBO3
 * NIM      : 10117112
 * 
 * Deskripsi program : Program ini berisi program  untuk menghitung saldo
 *                     tabungan
 */
public class PBO310117112Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        double saldoA =     2500000;
        double bunga  =     0.15;
        int    lama   =     1;
        
        while(lama <= 6){
            saldoA = saldoA * bunga + saldoA;
            System.out.println("Saldo Di Bulan Ke - " + lama++ + "\tRp. " + saldoA);
        }
        
    }
    
}
