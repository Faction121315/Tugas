/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117112.latihan38.perhitunganlingkungan;

import java.util.Scanner;

/**
 *
 * @author MHF
 */
public class PBO310117112Latihan38PerhitunganLingkungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        perhitungan ling = new perhitungan();

        System.out.println("=======Perhitungan Lingkaran=======");
        ling.validasiInput();
        ling.hasilPerhitungan(ling.diameter);

    }

}
