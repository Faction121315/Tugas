/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117112.latihan16.penugasan;

/**
 *
 * @author MHF
 * NAMA     : Faksi Kilat Buana Arifin Putra
 * KELAS    : PBO3
 * NIM      : 10117112
 * 
 * Deskripsi program : Program ini berisi program untuk menjelaskan proses 
 *                      operator Penugasan
 * 
 */
public class PBO310117112Latihan16Penugasan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 0;
        
        System.out.println("Nilai a = " + a);
        System.out.println("Nilai b = " + b);
        System.out.println("Nilai c = " + c+"/n");
        
        c = a + b;
        System.out.println("c = a + b = " + c);
        
        c += a ;
        System.out.println("c += a = " + c);
        
        c -= a;
        System.out.println("c -= a = " + c);
        
        c *= a;
        System.out.println("c *= a = " + c);
        
        a = 10;
        c = 15;
        
        c %= a;
        System.out.println("c %= a = " + c);
        
        c <<= 2;
        System.out.println("c <<= 2 = " + c);
        
        c >>= 2;
        System.out.println("c >>= 2 = " + c);
        
        c &= a;
        System.out.println("c &= a = " + c);
        
        c ^= a;
        System.out.println("c ^= a = " + c);
        
        c |= a;
        System.out.println("c |= a = " + c);
        
    }
    
}
