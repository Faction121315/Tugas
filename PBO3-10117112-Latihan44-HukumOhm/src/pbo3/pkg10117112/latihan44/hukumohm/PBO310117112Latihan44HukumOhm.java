/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117112.latihan44.hukumohm;

/**
 * NAMA     : Faksi Kilat Buana Arifin Putra
 * Kelas    : IF - 3
 * NIM      : 10117112
 * Deskripsi Program  : Program ini menapilkan Hukum Ohm
 * @author MHF
 */
public class PBO310117112Latihan44HukumOhm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        baterai btre = new baterai();
        baterai batre = new baterai(3, 12);
        System.out.println("Kuat Arus : " + batre.getKuatArus() + " ampere");
        System.out.println("Hambatan : " + batre.getHambatan() + " ohm");
        System.out.println("Hasil Tegangan : " + batre.hitungTegangan() + " volt");

    }

}
