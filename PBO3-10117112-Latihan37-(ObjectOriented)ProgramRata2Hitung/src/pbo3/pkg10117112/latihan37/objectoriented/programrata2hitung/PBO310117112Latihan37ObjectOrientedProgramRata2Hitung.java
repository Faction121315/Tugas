/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117112.latihan37.objectoriented.programrata2hitung;

import java.util.Scanner;

/**
 *
 * @author MHF
 */
public class PBO310117112Latihan37ObjectOrientedProgramRata2Hitung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner action = new Scanner(System.in);
        
        Rata2 rata = new Rata2();
        System.out.print("Masukan Banyak Mahasiswa : ");
        rata.banyak = action.nextInt();
        System.out.println("");
        
        while (rata.i <= rata.banyak){
        
            System.out.print("Nilai Mahasiswa Ke-" + rata.i++ + ": ");
            rata.nilai = action.nextInt();
            rata.nilaiA = rata.nilaiA + rata.nilai;
        }
        
        rata.rataRata(rata.nilaiA, rata.banyak, rata.rata);
        
        System.out.println("Developed By : Faksi Kilat Buana Arifin Putra");
        
    }
    
}
