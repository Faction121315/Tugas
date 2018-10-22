/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117112.latihan42.tabungan;

/**
 *
 * @author MHF
 */
public class tabungan {

    private final int saldo;

    public tabungan(int saldo) {
        this.saldo = saldo;
    }

    public int ambilUang(int jumlah) {
        return saldo - jumlah;
    }

}
