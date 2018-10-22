/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117112.latihan42.tabungan;

import java.util.Scanner;

/**
 *
 * @author MHF
 */
public class PBO310117112Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner action = new Scanner(System.in);

        System.out.println("=======Program Penarikan Uang=======");
        System.out.print("Masukkan Saldo Awal : ");
        tabungan tabungan = new tabungan(action.nextInt());
        System.out.print("Jumlah uang yang diambil : ");
        System.out.print("Saldo anda Sekarang : "
                + tabungan.ambilUang(action.nextInt()) + "\n");

    }

}
