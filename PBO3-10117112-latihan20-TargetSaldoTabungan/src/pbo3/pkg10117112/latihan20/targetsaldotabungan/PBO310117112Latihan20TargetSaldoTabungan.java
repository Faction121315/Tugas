/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117112.latihan20.targetsaldotabungan;

/**
 *
 * @author MHF
 * NAMA     : Faksi Kilat Buana Arifin Putra
 * KELAS    : PBO3
 * NIM      : 10117112
 * 
 * Deskripsi program : Program ini berisi program untuk menghitung saldo 
 *                     tabungan sampai Target
 */
public class PBO310117112Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double saldoA = 3500000;
        double bunga = 0.08;
        double saldoT = 6000000;
        int i = 1;
        
        while (saldoA <= saldoT){
        saldoA = saldoA * bunga + saldoA;
        System.out.println("Saldo Di Bulan Ke-" + i++ + " Rp. " + saldoA);
        }
        
        
        
        
    }
    
}
