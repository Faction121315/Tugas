/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117112.latihan4.kambing;

/**
 *
 * @author MHF
 * NAMA     : Faksi Kilat Buana Arifin Putra
 * KELAS    : PBO3
 * NIM      : 10117112
 * 
 * Deskripsi program : Program ini berisi program untuk menampilkan hasil
 *                      kambing yang  di proses yang dilakukan oleh sistem
 *                      (inputan oleh sistem sendiri)
 */
public class Kambing {

    public void tambahKambing() {
        
        //Deklarasi Variabel Lokal
        
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing Setelah Ditambah : " + 
                            jumlahKambing);
                
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Kambing kambingJantan = new Kambing();
        kambingJantan.tambahKambing();
        
    }
    
}
