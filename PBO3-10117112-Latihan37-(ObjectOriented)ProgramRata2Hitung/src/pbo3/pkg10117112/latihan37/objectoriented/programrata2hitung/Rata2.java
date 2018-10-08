/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117112.latihan37.objectoriented.programrata2hitung;

/**
 *
 * @author MHF
 */
public class Rata2 {

        public int nilai;
        public int nilaiA = 0;
        public double rata;
        public int banyak;
        public int i = 1;
        
        public void rataRata(int nilaiA, int banyak, double rata){
            
            rata = nilaiA / banyak;
            
             System.out.println("Maka, Rata-rata Nilainya Adalah " + rata);
            
        }
    
}
