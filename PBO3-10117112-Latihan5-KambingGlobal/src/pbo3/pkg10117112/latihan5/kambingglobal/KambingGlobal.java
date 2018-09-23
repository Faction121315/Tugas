/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117112.latihan5.kambingglobal;

/**
 *
 * @author MHF
 * NAMA     : Faksi Kilat Buana Arifin Putra
 * KELAS    : PBO3
 * NIM      : 10117112
 * 
 * Deskripsi program : Program ini berisi program untuk menampilkan hasil
 *                      suatu pemrosesan secara menyeluruh(sebelum dan sesudah)
 *                      (inputan oleh sistem)
 */
public class KambingGlobal {
    
        //Variabel jumlahkambing menjadi variabel instance
    
    int jumlahKambing = 88;
    
    //Metode untuk Menampilkan Jumlah Kambing
    
    public void getJumlahKabing() {
        
        System.out.println("Jumlah Kambiing : " + jumlahKambing);
        
    }
    
    public void tambahKambing() {
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing Setelah Ditambah : " + 
                            jumlahKambing);
        
    }
    
    public static void main(String[] args) {
                
        KambingGlobal kambingSusu = new KambingGlobal();
        
        //Menampilkan Jumlah Kambing Yang Ada Saat Program Pertama Berjalan
        
        kambingSusu.getJumlahKabing();
        
        //Menambah Satu Kambing 
        
        kambingSusu.tambahKambing();
        
        //Menampilkan Jumlah Kambing Yang Ada
        
        kambingSusu.getJumlahKabing();
        
    }
    
}
