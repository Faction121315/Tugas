/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117112.latihan31.objectoriented.perkenalanmahasiswa;

import java.util.Scanner;

/**
 *
 * @author MHF
 */
public class PBO310117112Latihan31ObjectOrientedPerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner action = new Scanner(System.in);

        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.name = "Syahrifal Dani S";
        mhs1.NIM = "10117093";
        mhs1.perkenalkanDiri(mhs1.name, mhs1.NIM);

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.name = "Tias Gumelar Timorisky";
        mhs2.NIM = "10117111";
        mhs2.perkenalkanDiri(mhs2.name, mhs2.NIM);
        
        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.name = "Faksi Kilat Buana Arifin Putra";
        mhs3.NIM = "10117112";
        mhs3.perkenalkanDiri(mhs3.name, mhs3.NIM);

    }

}
